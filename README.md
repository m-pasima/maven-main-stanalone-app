


### 📄  EC2 Implementation Steps

````markdown
## 🚀 Run on Amazon EC2 (Red Hat) with Maven installed

### 1. SSH into your EC2 instance

```bash
ssh ec2-user@<your-ec2-public-ip>
````

---

### 2. Clone the repository

```bash
git clone https://github.com/m-pasima/maven-stanalone-application.git
cd maven-stanalone-application
```

---

### 3. Build the project with Maven

```bash
mvn clean package
```

✅ This will generate:

* Plain JAR → `target/devops-standalone-app-1.0.0.jar`
* Fat JAR → `target/devops-standalone-app-1.0.0-jar-with-dependencies.jar`

---

### 4. Run the fat JAR (recommended)

```bash
java -jar target/devops-standalone-app-1.0.0-jar-with-dependencies.jar
```

✅ Example output:

```
2025-05-04 16:11:47,254 [main] INFO  com.devopsacademy.App - 🚀 Welcome to DevOps Academy Standalone Application!
2025-05-04 16:11:47,256 [main] INFO  com.devopsacademy.App - 👉 Hello, DevOps Engineer! Keep rocking DevOps!
```

---

### 5. (Optional) Run the plain JAR with manual classpath

```bash
java -cp target/devops-standalone-app-1.0.0.jar:~/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar com.devopsacademy.App
```

✅ On Linux (EC2), use `:` as the classpath separator.

---

### 6. (Optional) Run in Docker if installed

```bash
docker build -t devops-standalone-app .
docker run --rm devops-standalone-app
```

---

### 🔥 Summary

* 💥 SSH to EC2
* 💥 Clone repo: `git clone https://github.com/m-pasima/maven-stanalone-application.git`
* 💥 Build: `mvn clean package`
* 💥 Run: `java -jar target/devops-standalone-app-1.0.0-jar-with-dependencies.jar`

---

Built with ❤️ for DevOps Academy.

```




