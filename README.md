# CS26115: COMPUTER GRAPHICS AND MULTIMEDIA TECHNOLOGY

This repository contains simple Java graphics demos that can be built and run using **Apache Ant** or **Apache Maven**.  
It’s designed to replicate a typical **Java Application workflow** (like in NetBeans) but works seamlessly in **VS Code**.
It's purpose is to be able to replicate the repository in different devices for the course Computer Graphics and Multimedia Technology.

---

## 📦 Prerequisites

### Install Java (JDK)
1. Download and install **JDK 17** (or whichever version your professor requires).
2. Set environment variables:
   - `JAVA_HOME` → path to your JDK (e.g., `C:\Program Files\Java\jdk-17`)
   - Add `%JAVA_HOME%\bin` to your **PATH**.

Verify:
```bash
java -version
```

---

### Install Apache Ant
1. Download the binary zip from Apache Ant [(ant.apache.org in Bing)](https://www.bing.com/search?q="https%3A%2F%2Fant.apache.org%2Fbindownload.cgi").
2. Extract to a folder (e.g., `C:\Ant`).
3. Set environment variables:
   - `ANT_HOME` → path to Ant (e.g., `C:\Ant\apache-ant-1.10.x`)
   - Add `%ANT_HOME%\bin` to your **PATH**.

Verify:
```bash
ant -version
```

---

### Install Apache Maven
1. Download the binary zip from Apache Maven [(maven.apache.org in Bing)](https://www.bing.com/search?q="https%3A%2F%2Fmaven.apache.org%2Fdownload.cgi").
2. Extract to a folder (e.g., `C:\Maven`).
3. Set environment variables:
   - `MAVEN_HOME` → path to Maven (e.g., `C:\Maven\apache-maven-3.9.x`)
   - Add `%MAVEN_HOME%\bin` to your **PATH**.

Verify:
```bash
mvn -version
```

---

## 📂 Project Structure

```
demo/
  src/
    main/
      java/
        com/example/CsdGraphics.java
  build.xml
  pom.xml
```

---

## 📝 Ant Setup (`build.xml`)

```xml
<project name="demo" default="run" basedir=".">
    <property name="src" location="src/main/java"/>
    <property name="build" location="build"/>

    <target name="compile">
        <mkdir dir="${build}"/>
        <javac srcdir="${src}" destdir="${build}" includeantruntime="false"/>
    </target>

    <target name="run" depends="compile">
        <java classname="com.example.CsdGraphics" classpath="${build}" fork="true"/>
    </target>

    <target name="clean">
        <delete dir="${build}"/>
    </target>
</project>
```

Usage:
```bash
ant compile
ant run
```

---

## 📝 Maven Setup (`pom.xml`)

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
</project>
```

Usage:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.CsdGraphics"
```

---

## 🚀 Running the Demo

- With **Ant**:
  ```bash
  ant run
  ```
- With **Maven**:
  ```bash
  mvn exec:java -Dexec.mainClass="com.example.CsdGraphics"
  ```

Both will launch the Swing window showing your graphics demo.

---

## 🎯 Notes
- VS Code users: install the **Java Extension Pack** for IntelliSense and debugging.  
- NetBeans users: open as a “Java Application with Ant” project.  
- You can switch between Ant and Maven freely—both configs are included.
