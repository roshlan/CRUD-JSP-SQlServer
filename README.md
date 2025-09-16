**JSP CRUD Application**

This is a simple CRUD (Create, Read, Update, Delete) web application built using JSP and JDBC.
It allows users to add, view, edit, and delete records from a database directly through JSP pages.


**🚀 Features:**
➕ Add New User

✅ Success & Error Messages (adduser-success.jsp, adduser-error.jsp)

📋 View All Users

✏️ Edit / Update User Details (editform.jsp, edituser.jsp)

❌ Delete User

🏠 Home Page (index.jsp, userform.html)

**🛠️ Technologies Used"**
Java (JSP)

JDBC (Database connectivity)

MySQL / Any RDBMS

Apache Tomcat (Web Server)

**📂 Project Structure:**
JSP-CRUD/
│── src/
│   ├── User.java            # Model (POJO)
│   ├── UserDao.java         # Data Access Object (JDBC operations)
│
│── WebContent/
│   ├── index.jsp            # Home page
│   ├── userform.html        # Static form entry
│   ├── adduser.jsp          # Add user page
│   ├── adduserform.jsp      # User input form
│   ├── adduser-success.jsp  # Success page
│   ├── adduser-error.jsp    # Error page
│   ├── viewusers.jsp        # View all users
│   ├── editform.jsp         # Form to edit user details
│   ├── edituser.jsp         # Update user in DB
│   ├── deleteuser.jsp       # Delete user page
│
│── README.md

**📦 Dependencies**
1.Make sure the following JAR files are added to your project’s lib/ folder (inside WEB-INF/lib):
a,JSTL JARs (for JSP tag libraries)
    javax.servlet.jsp.jstl-1.2.jar (or equivalent)
    
b,MySQL Connector JAR (for database connection)
     mysql-connector-java-x.x.x.jar
     
c,Apache Tomcat JARs (for JSP/Servlet API support if not provided by server)
    servlet-api.jar
    jsp-api.jar

👉 Without these, the project will throw errors for database connection or JSTL tags.

**⚙️ Setup Instructions:**
1.Clone the repository:
    git clone https://github.com/roshlan/CRUD-JSP-SQLServer.git
    
2.Import the project into Eclipse / IntelliJ IDEA as a Dynamic Web Project.

3.Configure Tomcat server in your IDE.

**Setup Database:**
_CREATE DATABASE register;
USE register;
CREATE TABLE user123 (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    country VARCHAR(100)
);
4.Update database credentials in UserDao.java.

5.Run the project on Tomcat and open:
      http://localhost:3306/jsp-crud/


🔮 Future Improvements
1.Add validations for forms

2.Improve UI with Bootstrap

3.Add search and pagination for users

**📜 License**
This project is licensed under the MIT License – you are free to use, modify, and distribute this project with proper credit.
