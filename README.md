````markdown
# DevOps Academy Standalone App

This is a sample Maven standalone Java application for DevOps Academy.

---

## 🛠 Build with Maven

```bash
mvn clean package
````

✅ This will generate:

* Plain JAR → `target/devops-standalone-app-1.0.0.jar`
* Fat JAR → `target/devops-standalone-app-1.0.0-jar-with-dependencies.jar`

---

## 🚀 Run Fat JAR (recommended)

```bash
java -jar target/devops-standalone-app-1.0.0-jar-with-dependencies.jar
```

✅ This runs with all dependencies bundled
✅ Example output:

```
2025-05-04 16:11:47,254 [main] INFO  com.devopsacademy.App - 🚀 Welcome to DevOps Academy Standalone Application!
2025-05-04 16:11:47,256 [main] INFO  com.devopsacademy.App - 👉 Hello, DevOps Engineer! Keep rocking DevOps!
```

---

## ⚙️ Run Plain JAR (requires classpath)

```bash
java -cp target/devops-standalone-app-1.0.0.jar;~/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar com.devopsacademy.App
```

✅ Replace `;` with `:` if on Linux/macOS.

---

## 🐳 Run with Docker

1. **Build Docker image**

```bash
docker build -t devops-standalone-app .
```

2. **Run container**

```bash
docker run --rm devops-standalone-app
```

✅ Example output:

```
2025-05-04 16:11:47,254 [main] INFO  com.devopsacademy.App - 🚀 Welcome to DevOps Academy Standalone Application!
```

---

## 🔥 Tips

* To run in background:

  ```bash
  docker run -d --name devops-app devops-standalone-app
  docker logs -f devops-app
  ```
* To stop and remove:

  ```bash
  docker stop devops-app
  ```

```
=

=


