// Bihasa, Christian Louie A. | 4CSD
// Activity: 3D Shapes and 3D Transformations
//
// Given:
//   1. Cone with height = 10 and radius = 8
//   2. Cube whose edge is 5 and initial point is located at (3, 6, 4)
// Then:
//   1. Translate the cone using the parameter [5, 7, 2]
//   2. Rotate the cube using theta = 75 degrees about the y-axis
//
// The 3D figures are generated the same way as in the reference notebooks
// (parametric cone surface, cube vertices + faces, 4x4 homogeneous
// transformation matrices) and are drawn with Java2D using a 3D -> 2D
// projection (matplotlib's default view: elevation 30, azimuth -60).
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.List;

public class Act_3D_Bihasa extends Frame {

    // ------------------------------------------------------------------
    // Parameters
    // ------------------------------------------------------------------
    static final double CONE_RADIUS = 8;
    static final double CONE_HEIGHT = 10;
    static final int    NUM_POINTS  = 40;               // points around the cone
    static final double[] TRANSLATION = {5, 7, 2};      // (tx, ty, tz)

    static final double[] CUBE_INITIAL = {3, 6, 4};     // initial corner
    static final double   CUBE_EDGE    = 5;
    static final double   THETA_DEG    = 75;            // rotation about y-axis

    // View angles (same defaults as matplotlib's 3D axes)
    static final double ELEV = Math.toRadians(30);
    static final double AZIM = Math.toRadians(-60);

    // ------------------------------------------------------------------
    // 3D Transformation matrices (homogeneous, 4x4)
    // ------------------------------------------------------------------
    //  | 1  0  0  tx |
    //  | 0  1  0  ty |
    //  | 0  0  1  tz |
    //  | 0  0  0  1  |
    static double[][] translationMatrix(double tx, double ty, double tz) {
        return new double[][] {
            {1, 0, 0, tx},
            {0, 1, 0, ty},
            {0, 0, 1, tz},
            {0, 0, 0, 1}
        };
    }

    //  | cos(t)   0  sin(t)  0 |
    //  |  0       1    0     0 |
    //  | -sin(t)  0  cos(t)  0 |
    //  |  0       0    0     1 |
    static double[][] rotationYMatrix(double theta) {
        double c = Math.cos(theta), s = Math.sin(theta);
        return new double[][] {
            { c, 0, s, 0},
            { 0, 1, 0, 0},
            {-s, 0, c, 0},
            { 0, 0, 0, 1}
        };
    }

    // Multiply a 4x4 matrix by the point [x, y, z, 1]
    static double[] apply(double[][] m, double[] p) {
        double[] h = {p[0], p[1], p[2], 1};
        double[] r = new double[3];
        for (int i = 0; i < 3; i++) {
            r[i] = m[i][0] * h[0] + m[i][1] * h[1] + m[i][2] * h[2] + m[i][3] * h[3];
        }
        return r;
    }

    // Apply a matrix to every vertex of every face
    static List<double[][]> transform(double[][] m, List<double[][]> faces) {
        List<double[][]> out = new ArrayList<>();
        for (double[][] f : faces) {
            double[][] nf = new double[f.length][];
            for (int i = 0; i < f.length; i++) nf[i] = apply(m, f[i]);
            out.add(nf);
        }
        return out;
    }

    // ------------------------------------------------------------------
    // Shapes
    // ------------------------------------------------------------------
    // Cone: X = r(1 - Z/h)cos(theta), Y = r(1 - Z/h)sin(theta), Z = z
    static List<double[][]> createCone(double radius, double height, int n) {
        List<double[][]> faces = new ArrayList<>();
        int rings = 10;
        for (int j = 0; j < rings; j++) {
            double z0 = height * j / rings, z1 = height * (j + 1) / rings;
            double r0 = radius * (1 - z0 / height), r1 = radius * (1 - z1 / height);
            for (int i = 0; i < n; i++) {
                double t0 = 2 * Math.PI * i / n, t1 = 2 * Math.PI * (i + 1) / n;
                faces.add(new double[][] {
                    {r0 * Math.cos(t0), r0 * Math.sin(t0), z0},
                    {r0 * Math.cos(t1), r0 * Math.sin(t1), z0},
                    {r1 * Math.cos(t1), r1 * Math.sin(t1), z1},
                    {r1 * Math.cos(t0), r1 * Math.sin(t0), z1}
                });
            }
        }
        // Base (circle at z = 0)
        for (int i = 0; i < n; i++) {
            double t0 = 2 * Math.PI * i / n, t1 = 2 * Math.PI * (i + 1) / n;
            faces.add(new double[][] {
                {0, 0, 0},
                {radius * Math.cos(t0), radius * Math.sin(t0), 0},
                {radius * Math.cos(t1), radius * Math.sin(t1), 0}
            });
        }
        return faces;
    }

    static double[][] cubeVertices(double[] c, double e) {
        return new double[][] {
            {c[0],     c[1],     c[2]},         // (3, 6, 4)
            {c[0] + e, c[1],     c[2]},         // (3+5, 6, 4)
            {c[0] + e, c[1] + e, c[2]},         // (3+5, 6+5, 4)
            {c[0],     c[1] + e, c[2]},         // (3, 6+5, 4)
            {c[0],     c[1],     c[2] + e},     // (3, 6, 4+5)
            {c[0] + e, c[1],     c[2] + e},     // (3+5, 6, 4+5)
            {c[0] + e, c[1] + e, c[2] + e},     // (3+5, 6+5, 4+5)
            {c[0],     c[1] + e, c[2] + e}      // (3, 6+5, 4+5)
        };
    }

    static List<double[][]> cubeFaces(double[][] v) {
        List<double[][]> faces = new ArrayList<>();
        faces.add(new double[][] {v[0], v[1], v[2], v[3]});  // Bottom
        faces.add(new double[][] {v[4], v[5], v[6], v[7]});  // Top
        faces.add(new double[][] {v[0], v[1], v[5], v[4]});  // Front
        faces.add(new double[][] {v[2], v[3], v[7], v[6]});  // Back
        faces.add(new double[][] {v[1], v[2], v[6], v[5]});  // Right
        faces.add(new double[][] {v[4], v[7], v[3], v[0]});  // Left
        return faces;
    }

    static double volumeCone(double r, double h) { return Math.PI * r * r * h / 3.0; }
    static double volumeCube(double e)           { return e * e * e; }

    // ------------------------------------------------------------------
    // Figures to draw
    // ------------------------------------------------------------------
    List<double[][]> cone, coneTranslated, cube, cubeRotated;

    public Act_3D_Bihasa() {
        cone = createCone(CONE_RADIUS, CONE_HEIGHT, NUM_POINTS);
        coneTranslated = transform(
            translationMatrix(TRANSLATION[0], TRANSLATION[1], TRANSLATION[2]), cone);

        cube = cubeFaces(cubeVertices(CUBE_INITIAL, CUBE_EDGE));
        cubeRotated = transform(rotationYMatrix(Math.toRadians(THETA_DEG)), cube);

        printResults();

        setTitle("Act_3D_Bihasa - 3D Transformations");
        setSize(1200, 950);
        setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
    }

    void printResults() {
        System.out.println("=== 1. Cone (r = 8, h = 10) translated by [5, 7, 2] ===");
        printMatrix(translationMatrix(TRANSLATION[0], TRANSLATION[1], TRANSLATION[2]));
        double[] apex = {0, 0, CONE_HEIGHT}, base = {0, 0, 0};
        double[][] t = translationMatrix(TRANSLATION[0], TRANSLATION[1], TRANSLATION[2]);
        System.out.printf("Base center: %s -> %s%n", fmt(base), fmt(apply(t, base)));
        System.out.printf("Apex       : %s -> %s%n", fmt(apex), fmt(apply(t, apex)));
        System.out.printf("Volume of Cone: %.4f cubic units%n%n", volumeCone(CONE_RADIUS, CONE_HEIGHT));

        System.out.println("=== 2. Cube (edge = 5, initial point (3, 6, 4)) rotated 75 deg about y-axis ===");
        double[][] r = rotationYMatrix(Math.toRadians(THETA_DEG));
        printMatrix(r);
        double[][] v = cubeVertices(CUBE_INITIAL, CUBE_EDGE);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Corner %d: %s -> %s%n", i + 1, fmt(v[i]), fmt(apply(r, v[i])));
        }
        System.out.printf("Volume of Cube: %.4f cubic units%n", volumeCube(CUBE_EDGE));
    }

    static void printMatrix(double[][] m) {
        for (double[] row : m) {
            System.out.printf("| %8.4f %8.4f %8.4f %8.4f |%n", row[0], row[1], row[2], row[3]);
        }
    }

    static String fmt(double[] p) {
        return String.format("(%.4f, %.4f, %.4f)", p[0], p[1], p[2]);
    }

    // ------------------------------------------------------------------
    // Drawing
    // ------------------------------------------------------------------
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        Insets in = getInsets();
        int w = (getWidth() - in.left - in.right) / 2;
        int h = (getHeight() - in.top - in.bottom) / 2;

        // Same axis limits for the original and transformed figures so the
        // change in position is visible.
        double[][] coneLim = {{-10, 15}, {-10, 17}, {0, 14}};
        double[][] cubeLim = {{0, 12}, {0, 12}, {-8, 10}};

        Color blue = new Color(0, 0, 255, 180), red = new Color(255, 0, 0, 180);

        drawPanel(g2d, cone, coneLim, blue, Color.GREEN.darker(),
            "Original Cone (r = 8, h = 10)", in.left, in.top, w, h);
        drawPanel(g2d, coneTranslated, coneLim, red, Color.GREEN.darker(),
            "Translated Cone [5, 7, 2]", in.left + w, in.top, w, h);
        drawPanel(g2d, cube, cubeLim, new Color(255, 0, 0, 90), Color.BLUE,
            "Original Cube (edge = 5, at (3, 6, 4))", in.left, in.top + h, w, h);
        drawPanel(g2d, cubeRotated, cubeLim, new Color(255, 0, 0, 90), Color.BLUE,
            "Rotated Cube (Y-Axis, θ = 75°)", in.left + w, in.top + h, w, h);
    }

    // One 3D "subplot"
    void drawPanel(Graphics2D g, List<double[][]> faces, double[][] lim,
                   Color fill, Color edge, String title,
                   int px, int py, int pw, int ph) {
        double scale = Math.min(pw, ph) * 0.62;
        double cx = px + pw / 2.0, cy = py + ph / 2.0 + 15;
        Projector p = new Projector(lim, scale, cx, cy);

        // Axis box: three back panes with grid lines
        drawAxes(g, p, lim);

        // Painter's algorithm: sort faces from farthest to nearest
        List<double[][]> sorted = new ArrayList<>(faces);
        sorted.sort((a, b) -> Double.compare(p.depth(a), p.depth(b)));

        g.setStroke(new BasicStroke(0.8f));
        for (double[][] f : sorted) {
            Path2D poly = new Path2D.Double();
            for (int i = 0; i < f.length; i++) {
                Point2D s = p.project(f[i]);
                if (i == 0) poly.moveTo(s.getX(), s.getY());
                else poly.lineTo(s.getX(), s.getY());
            }
            poly.closePath();
            g.setColor(fill);
            g.fill(poly);
            g.setColor(edge);
            g.draw(poly);
        }

        // Title
        g.setColor(Color.BLACK);
        g.setFont(new Font("SansSerif", Font.BOLD, 16));
        FontMetrics fm = g.getFontMetrics();
        g.drawString(title, (int) (px + (pw - fm.stringWidth(title)) / 2.0), py + 28);
    }

    void drawAxes(Graphics2D g, Projector p, double[][] lim) {
        double x0 = lim[0][0], x1 = lim[0][1];
        double y0 = lim[1][0], y1 = lim[1][1];
        double z0 = lim[2][0], z1 = lim[2][1];

        // For azim = -60 the back panes are x = x0, y = y1 and z = z0
        Color pane = new Color(242, 242, 242), grid = new Color(210, 210, 210);
        fillQuad(g, p, pane, new double[][] {{x0, y0, z0}, {x0, y1, z0}, {x0, y1, z1}, {x0, y0, z1}});
        fillQuad(g, p, pane, new double[][] {{x0, y1, z0}, {x1, y1, z0}, {x1, y1, z1}, {x0, y1, z1}});
        fillQuad(g, p, new Color(230, 230, 230),
                 new double[][] {{x0, y0, z0}, {x1, y0, z0}, {x1, y1, z0}, {x0, y1, z0}});

        g.setStroke(new BasicStroke(0.7f));
        g.setFont(new Font("SansSerif", Font.PLAIN, 10));
        double[] xt = ticks(x0, x1), yt = ticks(y0, y1), zt = ticks(z0, z1);

        for (double x : xt) {
            g.setColor(grid);
            line(g, p, new double[] {x, y0, z0}, new double[] {x, y1, z0});
            line(g, p, new double[] {x, y1, z0}, new double[] {x, y1, z1});
            label(g, p, new double[] {x, y0 - (y1 - y0) * 0.08, z0}, num(x));
        }
        for (double y : yt) {
            g.setColor(grid);
            line(g, p, new double[] {x0, y, z0}, new double[] {x1, y, z0});
            line(g, p, new double[] {x0, y, z0}, new double[] {x0, y, z1});
            label(g, p, new double[] {x1 + (x1 - x0) * 0.08, y, z0}, num(y));
        }
        for (double z : zt) {
            g.setColor(grid);
            line(g, p, new double[] {x0, y0, z}, new double[] {x0, y1, z});
            line(g, p, new double[] {x0, y1, z}, new double[] {x1, y1, z});
            if (z > z0) label(g, p, new double[] {x0, y0 - (y1 - y0) * 0.08, z}, num(z));
        }

        // Axis lines and labels
        g.setColor(Color.DARK_GRAY);
        g.setStroke(new BasicStroke(1.2f));
        line(g, p, new double[] {x0, y0, z0}, new double[] {x1, y0, z0});
        line(g, p, new double[] {x1, y0, z0}, new double[] {x1, y1, z0});
        line(g, p, new double[] {x0, y0, z0}, new double[] {x0, y0, z1});

        g.setFont(new Font("SansSerif", Font.BOLD, 13));
        g.setColor(Color.BLACK);
        label(g, p, new double[] {(x0 + x1) / 2, y0 - (y1 - y0) * 0.22, z0}, "X");
        label(g, p, new double[] {x1 + (x1 - x0) * 0.22, (y0 + y1) / 2, z0}, "Y");
        label(g, p, new double[] {x0, y0 - (y1 - y0) * 0.22, (z0 + z1) / 2}, "Z");
    }

    static double[] ticks(double a, double b) {
        double range = b - a, step = range <= 12 ? 2 : 5;
        List<Double> t = new ArrayList<>();
        for (double v = Math.ceil(a / step) * step; v <= b + 1e-9; v += step) t.add(v);
        double[] r = new double[t.size()];
        for (int i = 0; i < r.length; i++) r[i] = t.get(i);
        return r;
    }

    static String num(double v) { return String.valueOf((int) Math.round(v)); }

    static void fillQuad(Graphics2D g, Projector p, Color c, double[][] q) {
        Path2D poly = new Path2D.Double();
        for (int i = 0; i < q.length; i++) {
            Point2D s = p.project(q[i]);
            if (i == 0) poly.moveTo(s.getX(), s.getY()); else poly.lineTo(s.getX(), s.getY());
        }
        poly.closePath();
        g.setColor(c);
        g.fill(poly);
    }

    static void line(Graphics2D g, Projector p, double[] a, double[] b) {
        g.draw(new Line2D.Double(p.project(a), p.project(b)));
    }

    static void label(Graphics2D g, Projector p, double[] at, String s) {
        Color old = g.getColor();
        g.setColor(Color.BLACK);
        Point2D q = p.project(at);
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, (float) (q.getX() - fm.stringWidth(s) / 2.0), (float) (q.getY() + fm.getAscent() / 2.0));
        g.setColor(old);
    }

    // ------------------------------------------------------------------
    // 3D -> 2D projection (orthographic, matplotlib-style box aspect 4:4:3)
    // ------------------------------------------------------------------
    static class Projector {
        final double[][] lim;
        final double scale, cx, cy;
        final double[] right, up, eye;
        final double[] aspect = {1.0, 1.0, 0.75};

        Projector(double[][] lim, double scale, double cx, double cy) {
            this.lim = lim; this.scale = scale; this.cx = cx; this.cy = cy;
            right = new double[] {-Math.sin(AZIM), Math.cos(AZIM), 0};
            up    = new double[] {-Math.sin(ELEV) * Math.cos(AZIM),
                                  -Math.sin(ELEV) * Math.sin(AZIM),
                                   Math.cos(ELEV)};
            eye   = new double[] { Math.cos(ELEV) * Math.cos(AZIM),
                                   Math.cos(ELEV) * Math.sin(AZIM),
                                   Math.sin(ELEV)};
        }

        // World coordinates -> normalized box coordinates centered at 0
        double[] normalize(double[] p) {
            double[] n = new double[3];
            for (int i = 0; i < 3; i++) {
                n[i] = ((p[i] - lim[i][0]) / (lim[i][1] - lim[i][0]) - 0.5) * aspect[i];
            }
            return n;
        }

        Point2D project(double[] p) {
            double[] n = normalize(p);
            double sx = n[0] * right[0] + n[1] * right[1] + n[2] * right[2];
            double sy = n[0] * up[0] + n[1] * up[1] + n[2] * up[2];
            return new Point2D.Double(cx + sx * scale, cy - sy * scale);
        }

        // Larger depth = closer to the viewer
        double depth(double[][] face) {
            double d = 0;
            for (double[] v : face) {
                double[] n = normalize(v);
                d += n[0] * eye[0] + n[1] * eye[1] + n[2] * eye[2];
            }
            return d / face.length;
        }
    }

    public static void main(String[] args) {
        new Act_3D_Bihasa().setVisible(true);
    }
}
