

### 📄 `README.md`

````markdown
# 🚀 DevOps Academy Stanalone Application on Amazon EC2 (Red Hat)

This is a Spring Boot–based Java web application built with Maven, deployable on Amazon EC2 (Red Hat) and Docker.

---

## ✅ 1. SSH into your EC2 instance

```bash
ssh ec2-user@<your-ec2-public-ip>
````

---

## ✅ 2. Clone the repository

```bash
git clone [https://github.com/m-pasima/maven-stanalone-application.git](https://github.com/m-pasima/maven-main-stanalone-app)
cd maven-stanalone-application
```

---

## ✅ 3. Build the project with Maven

```bash
mvn clean package
```

This will generate:

* Spring Boot fat JAR → `target/devops-standalone-app-1.0.0.jar`

---

## ✅ 4. Run the application on EC2

```bash
java -jar target/devops-standalone-app-1.0.0.jar
```

✅ By default, the app runs on port **8080**.

---

## ✅ 5. Access the web app in your browser

```
http://<your-ec2-public-ip>:8080/
```

⚠ **IMPORTANT:** Ensure your EC2 Security Group allows inbound TCP traffic on port `8080`.

---

## ✅ 6. (Optional) Run in Docker

### a. Build Docker image

```bash
docker build -t devops-standalone-app .
```

### b. Run Docker container

```bash
docker run -d -p 8080:8080 --name devops-app devops-standalone-app
```

### c. Check logs

```bash
docker logs devops-app
```

---

## ✅ 7. Manage Docker containers

* List all containers:

```bash
docker ps -a
```

* Stop container:

```bash
docker stop devops-app
```

* Remove container:

```bash
docker rm devops-app
```

* Prune stopped containers:

```bash
docker container prune -f
```

---

## 🔥 Summary

✅ SSH to EC2
✅ Clone → `[git clone https://github.com/m-pasima/maven-stanalone-application.git](https://github.com/m-pasima/maven-main-stanalone-app)`
✅ Build → `mvn clean package`
✅ Run → `java -jar target/devops-standalone-app-1.0.0.jar`
✅ Access → `http://<your-ec2-public-ip>:8080/`
✅ Docker → `docker build && docker run`

---

**Built with ❤️ for DevOps Academy**

```





