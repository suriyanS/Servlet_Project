# Servlet_Project

# Event Registration Form
## 1.Registration Form :

 ### Code: 
```sh
  <html>  
    <body>  
    <form action="Event" method="post">  
    FirstName:<input type="text" name="firstname"/><br/><br/>  
   LastName:<input type="text" name="lastname"/><br/><br/>  
    Email Id:<input type="text" name="email"/><br/><br/>  
    Date: <input type="text" name="date"/><br/><br/>  
      Time: <input type="text" name="time"/><br/><br/>  
        Topic: <input type="text" name="topic"/><br/><br/>  
    Location:  
    <select name="location">  
    <option>Coimbatore</option>  
    <option>Bangalore</option>  
    <option>other</option>  
    </select>  
    <br/><br/>  
    <input type="submit" value="Register"/>  
    </form>  
    </body>  
    </html>  
```



## 2.Event.java :

### Code:
```sh
 import java.io.*;  
import java.sql.*;  
import java.sql.Connection;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Event extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("firstname");  
String p=request.getParameter("lastname");  
String e=request.getParameter("email");  
String c=request.getParameter("date");  
String f=request.getParameter("time");  
String g=request.getParameter("topic");  
String h=request.getParameter("location");  
          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/event_form", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into eventform values(?,?,?,?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
ps.setString(5,f); 
ps.setString(6,g); 
ps.setString(7,h); 
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully Completed the Event Registration...");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}
```

## Web.xml  :

### Code:
 ```sh
 <!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >
   <web-app>  
 <servlet>  
    <servlet-name>Register</servlet-name>  
    <servlet-class>Event</servlet-class>  
    </servlet>  
    <servlet-mapping>  
    <servlet-name>Register</servlet-name>  
    <url-pattern>/Event</url-pattern>  
    </servlet-mapping>  
    <welcome-file-list>  
  <welcome-file>eventregister.html</welcome-file>  
    </welcome-file-list> 
    </web-app>  
```
## Screen Shots:
### RegistrationForm
![alt text](https://raw.githubusercontent.com/suriyanS/Learning/master/Registration%20form.png "Logo Title Text 1")
## Succesful Message:
![alt text](https://raw.githubusercontent.com/suriyanS/Learning/master/Succesful%20Message.png "Logo Title Text 1")

## Database Storage:
![alt text](https://raw.githubusercontent.com/suriyanS/Learning/master/Stored%20In%20Db.png "Logo Title Text 1")
