# HelloWorldApp — Java Servlet Web Application

A beginner-friendly Java web application built with a **Java Servlet** and deployed on **Apache Tomcat**. This project demonstrates the basic structure of a Dynamic Web Project and how a Servlet handles HTTP requests to display a response in the browser.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [How It Works](#how-it-works)

---

## ✨ Features

- ✅ Simple **Hello World** response from a Java Servlet
- ✅ Static **index.html** as the welcome page
- ✅ Servlet mapped via **web.xml**
- ✅ Deployed and hosted on **Apache Tomcat 9**
- ✅ Demonstrates the **Dynamic Web Project structure**

---

## 🛠 Tech Stack

| Layer        | Technology                    |
|--------------|-------------------------------|
| Frontend     | HTML                          |
| Backend      | Java Servlet (javax.servlet)  |
| Server       | Apache Tomcat 9.x             |
| Language     | Java 17                       |

---

## 📁 Project Structure

```
HelloWorldApp/
├── src/
│   └── com/app/
│       └── HelloServlet.java       # Servlet that returns Hello World
│
└── WebContent/
    ├── index.html                  # Static welcome page with link
    └── WEB-INF/                    # Protected folder (not browser accessible)
        ├── web.xml                 # Servlet mapping configuration
        └── classes/
            └── com/app/
                └── HelloServlet.class  # Compiled servlet
```

> 💡 **WEB-INF/** is a special protected directory — users cannot access it directly from the browser. Only the Tomcat server uses it internally.

---

## ✅ Prerequisites

Make sure you have the following installed:

- [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/)
- [Apache Tomcat 9.x](https://tomcat.apache.org/download-90.cgi)


Set the following **Environment Variables**:

| Variable        | Value                              |
|-----------------|------------------------------------|
| `JAVA_HOME`     | `C:\Program Files\Java\jdk-17`     |
| `CATALINA_HOME` | `C:\tomcat9`                       |
| `PATH`          | Add `C:\tomcat9\bin`               |

---

##  Usage

| URL | Description |
|-----|-------------|
| `http://localhost:8080/HelloWorldApp/` | Opens `index.html` welcome page |
| `http://localhost:8080/HelloWorldApp/hello` | Servlet responds with **Hello World** |

1. Open `http://localhost:8080/HelloWorldApp/`
2. You will see the welcome page with a link
3. Click the link — it sends a **GET request** to the Servlet
4. The Servlet responds with a **Hello World** HTML page

---

## 🌐 How It Works

```
Browser                            Tomcat Server
   |                                     |
   |--- GET /HelloWorldApp/hello ------->|
   |                              HelloServlet.doGet()
   |                              builds HTML response
   |<-- 200 OK + HTML page --------------|
   |                                     |
```

### Request Flow:
1. Browser sends `GET /HelloWorldApp/hello`
2. Tomcat checks `web.xml` → maps `/hello` to `HelloServlet`
3. `HelloServlet.doGet()` is called
4. Servlet writes HTML response using `PrintWriter`
5. Browser renders the HTML

---

## Key Concepts Demonstrated

| Concept | Description |
|---|---|
| **Servlet** | Java class that handles HTTP requests |
| **doGet()** | Method called on HTTP GET requests |
| **web.xml** | Deployment descriptor mapping URLs to Servlets |
| **WEB-INF/** | Protected directory — server use only |
| **PrintWriter** | Used to write HTML output from Servlet |
| **Tomcat** | Servlet container that runs the application |

---


