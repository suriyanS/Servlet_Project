# Servlet_Project


# Event Registration Form

## Description :

 This is the simple Web Project using Servlet and Jsp Pages developed for Event registration Form.
 Here I Use simple Email function to send mail to the registered Users and I have used Filter and Session Concepts for authentication purpose.

### Requirements

### JSP
___
* Login
* Login_EX
* Log_Error
* eventregister
* userEventRegistration
* Home

### JAVA
___
* pojoEvent
* EventDao
* LoginDao
* Login_NewStore
* Logout
* SaveServlet
* EditServlet
* EditServlet2
* ViewServlet
* DeletServlet
* admin_SaveServlet
* WelcomeServlet
* MyFilter

### SQL
___
#### Db
* adminlogin
* event_form
#### Tables
* admin_login
* ex_user_login
* eventform

## Code:

## 1.Login.jsp :

 
```sh
  <html>
<head>
<title>New User Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.signup{
  margin-left:400px;
  margin-top:135px;
  padding:25px;
  width:500px;
  border: 10px solid skyblue;
}
	label {
			display: inline-block;
			width: 500px;
			text-align: center;
		}
  .bts{
    margin-left:190px;
  }
  .btc{
    margin-left:15px;
  }
</style>
</head>


<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><img src="fav.jpg" width="50" height="50"></a>
    </div>
    
      <a href="Home.jsp"> <button class="btn btn-success">Home</button></a></li>
     

   <a href="Login_Ex.jsp" <button class="btn btn-info navbar-btn">Sign In</button></a>
  </div>
</nav>

<div class="signup">
<form method="POST" action="Login_NewStore" onsubmit="return checkForm(this);">


<label>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Username: <input title="Enter your username" required type="text" required pattern="\w+" name="username" placeholder="Create Username"></label>
<br/>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<label>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Password: <input title="Password must contain at least 6 characters, including UPPER/lowercase and numbers" placeholder="Create Password"type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd1" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
  if(this.checkValidity()) form.pwd2.pattern = this.value;
"></label>
<br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<label>Confirm Password: <input title="Please enter the same Password as above" placeholder="Confirm Password"type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd2" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
"></label> </br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<br/>
<button type="submit" class="btn btn-success btn-md bts">Sign Up</button>

<button type="reset" class="btn btn-danger btn-md btc">Cancel</button>

</form>
</div>

</body>
</html> 
```

___

## 2.Login_EX.jsp :


```sh
    <html>
   <head>
<title>Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.login{
    
    border: 10px solid skyblue;
    margin-top:150px;
    margin-left:400px;
    padding:50px;
    width:600px;
    background-color:white;
}
.bt{
    width:150px;
}
body {
    background-image: url("http://www.whizjuniors.com/Content/img/banner.jpg");
}
select{
    width:150px;
}
</style>

   </head>

<body>
<div class="login" align="center">

    <form action="eventregister.jsp" method="post">  
    <label for="username">User Name:</label>
   <input type="text" name="username" id="username"/><br/><br/> 
   <label for="username">Password:</label> 
    <input type="password" name="userpass"/><br/><br/>  

    <br/><br/>
      <button type="submit" class="btn btn-primary bt">Sign in</button> 
    
    </form>  

    </div>
    </body>
    </html>
```
___

## 3.Log_Error.jsp :


 ```sh
    <html>
   <head>
<title>Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.login{
    
    border: 10px solid skyblue;
    margin-top:150px;
    margin-left:400px;
    padding:50px;
    width:600px;
    background-color:white;
}
.bt{
    width:150px;
}
body {
    background-image: url("http://www.whizjuniors.com/Content/img/banner.jpg");
}
select{
    width:150px;
}
h5{color:red;}
</style>

   </head>

<body>
<div class="login" align="center">

    <form action="eventregister.jsp" method="post">  
    <label for="username">User Name:</label>
   <input type="text" name="username" id="username"/><br/><br/> 
   <label for="username">Password:</label> 
    <input type="password" name="userpass"/><br/><br/>  
<h5 >User Name or password error</h5>
    <br/><br/>
      <button type="submit" class="btn btn-primary bt">Sign in</button> 
    
    </form>  

    </div>
    </body>
    </html>
```
___

## 4.eventregister.jsp :


```sh


<!Doctype html>
<html>

<head>
	<title> Event Registration </title>

	<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

	<style>
		.well {
			background-color: #3d40db;
			padding-left:400px;
			font-size: 30px;
			color: white;
		}

		.jumbotron {
			color: #db443d;
			background-color: #e4e8dc;
		}

		label {
			display: inline-block;
			width: 140px;
			text-align: center;
		}
	.out{
		margin-left:300px;
	}
	</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<script>
function onload()
{
document.getElementById('if').src="http://localhost:9090/ViewServlet";
}
</script>

</head>

<body onload='onload();'>
	<div class='container-fluid'>
		<br/>
		<div class='well'>Event Registration-Admin Home
		
	
		<a href="/Logout"><button class="btn btn-danger out">Sign Out</button></a>
		
		</div>
		<br/>

		<div class='jumbotron'>
			<form action='admin_SaveServlet' class='form-inline' method='post'>
				<div class='row'>

					<div class='col-sm-4'>
						<label>First Name:</label> <input type='text' required placeholder='First Name' name='firstname'/><br/><br/>  
    <label>Last Name:</label> <input type='text'  placeholder='Initial'  name='lastname' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Email Id:</label> <input type='email' placeholder='Email' required name='email' /><br/><br/>
						<label>Date:</label> <input type='date' required placeholder='Date' name='date' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Time:</label> <input type='time' placeholder='Time' required name='time' /><br/><br/>
						<label>Topic:</label> <input type='text' placeholder='Topic' required name='topic' /><br/><br/>
					</div>

					<label>Location: </label>
					<select name='location'>  
    <option>Coimbatore</option>  
    <option>Bangalore</option>  
    <option>other</option>  
    </select>
					<br/><br/>

					<div class='span12'>
						<button  name="Register" class='btn btn-primary' type='submit'>Register <span class='glyphicon glyphicon-save'></span></button>

						<button  class='btn btn-danger' type='reset'>Cancel <span class='glyphicon glyphicon-remove'></span></button>
						
					</div>
				</div>
			</form>
		</div>


<iframe name='if' id="if"  height="300px" width="1330px">

</iframe>

		

	</div>

</body>

</html>
```
___

## 5.userEventRegistration :


```sh


<!Doctype html>
<html>

<head>
	<title> Event Registration </title>

	<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

	<style>
		.well {
			background-color: #3d40db;
			padding-left:400px;
			font-size: 30px;
			color: white;
		}

		.jumbotron {
			color: #db443d;
			background-color: #e4e8dc;
		}

		label {
			display: inline-block;
			width: 140px;
			text-align: center;
		}
	.out{
		margin-left:300px;
	}
	</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<script>
function onload()
{
document.getElementById('if').src="http://localhost:9090/ViewServlet";
}
</script>

</head>

<body onload='onload();'>
	<div class='container-fluid'>
		<br/>
		<div class='well'>Event Registration-Admin Home
		
	
		<a href="/Logout"><button class="btn btn-danger out">Sign Out</button></a>
		
		</div>
		<br/>

		<div class='jumbotron'>
			<form action='admin_SaveServlet' class='form-inline' method='post'>
				<div class='row'>

					<div class='col-sm-4'>
						<label>First Name:</label> <input type='text' required placeholder='First Name' name='firstname'/><br/><br/>  
    <label>Last Name:</label> <input type='text'  placeholder='Initial'  name='lastname' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Email Id:</label> <input type='email' placeholder='Email' required name='email' /><br/><br/>
						<label>Date:</label> <input type='date' required placeholder='Date' name='date' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Time:</label> <input type='time' placeholder='Time' required name='time' /><br/><br/>
						<label>Topic:</label> <input type='text' placeholder='Topic' required name='topic' /><br/><br/>
					</div>

					<label>Location: </label>
					<select name='location'>  
    <option>Coimbatore</option>  
    <option>Bangalore</option>  
    <option>other</option>  
    </select>
					<br/><br/>

					<div class='span12'>
						<button  name="Register" class='btn btn-primary' type='submit'>Register <span class='glyphicon glyphicon-save'></span></button>

						<button  class='btn btn-danger' type='reset'>Cancel <span class='glyphicon glyphicon-remove'></span></button>
						
					</div>
				</div>
			</form>
		</div>


<iframe name='if' id="if"  height="300px" width="1330px">

</iframe>

		

	</div>

</body>

</html>
```
___


### JAVA

___


## 1.pojoEvent.java:


```sh
    public class pojoEvent {  
    private int id;  
    private String firstname,lastname,email,date,time,topic,location;  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getFirstName() {  
        return firstname;  
    }  
    public void setFirstName(String firstname) {  
        this.firstname = firstname;  
    }  
    public String getLastName() {  
        return lastname;  
    }  
    public void setLastName(String lastname) {  
        this.lastname = lastname;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public String getDate() {  
        return date;  
    }  
    public void setDate(String date) {  
        this.date = date;  
    }  
      
       public String getTime() {  
        return time;  
    }  
    public void setTime(String time) {  
        this.time = time;  
    }  
     public String getTopic() {  
        return topic;  
    }  
    public void setTopic(String topic) {  
        this.topic = topic;  
    }  
     public String getLocation() {  
        return location;  
    }  
    public void setLocation(String location) {  
        this.location = location;  
    }  
    
    }  
```

___


## 2.EventDao.jsp


```sh
    import java.util.*;  
    import java.sql.*;  
      
    public class EventDao {  
      
        public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");  
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }  
        public static int save(pojoEvent e){  
            int status=0;  
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                              "insert into eventform(firstname,lastname,email,date,time,topic,location) values(?,?,?,?,?,?,?)");  
                ps.setString(1,e.getFirstName());  
                ps.setString(2,e.getLastName());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getDate());  
                ps.setString(5,e.getTime()); 
                ps.setString(6,e.getTopic()); 
                ps.setString(7,e.getLocation()); 
               
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int update(pojoEvent e){  
            int status=0;  
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "update eventform set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where id=?");  
                 ps.setString(1,e.getFirstName());  
                ps.setString(2,e.getLastName());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getDate());  
                ps.setString(5,e.getTime()); 
                ps.setString(6,e.getTopic()); 
                ps.setString(7,e.getLocation());   
                ps.setInt(8,e.getId());  
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int delete(int id){  
            int status=0;  
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("delete from eventform where id=?");  
                ps.setInt(1,id);  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return status;  
        }  
        public static pojoEvent getUsersById(int id){  
            pojoEvent e=new pojoEvent();  
              
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from eventform where id=?");  
                ps.setInt(1,id);  
                ResultSet rs=ps.executeQuery();  
                if(rs.next()){  
                    e.setId(rs.getInt(1));  
                    e.setFirstName(rs.getString(2));  
                    e.setLastName(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setDate(rs.getString(5));
                    e.setTime(rs.getString(6)); 
                    e.setTopic(rs.getString(7));   
                    e.setLocation(rs.getString(8));    
                }  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return e;  
        }  
        public static List<pojoEvent> getAllUsers(){  
            List<pojoEvent> list=new ArrayList<pojoEvent>();  
              
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from eventform");  
                ResultSet rs=ps.executeQuery();  
                while(rs.next()){  
                   pojoEvent e=new pojoEvent();  
                    e.setId(rs.getInt(1));  
                    e.setFirstName(rs.getString(2));  
                    e.setLastName(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setDate(rs.getString(5));
                    e.setTime(rs.getString(6)); 
                    e.setTopic(rs.getString(7));   
                    e.setLocation(rs.getString(8)); 
                    list.add(e);  
                }  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return list;  
        }  
    }  
```

___


## 3.LoginDao.java


```sh
import java.sql.*;  
  
public class LoginDao {  
 public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin", "root", "");  
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }  
 
public static boolean validateAdmin(String username,String userpass){  
boolean status=false;  
try{  
     
  Connection con=LoginDao.getConnection();     
PreparedStatement ps=con.prepareStatement(  
"select * from admin_login where username=? and userpass=? ");  
ps.setString(1,username);  
ps.setString(2,userpass);  
//ps.setString(3,user);
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
public static boolean validateUser(String username,String userpass){  
boolean status=false;  
try{  
     
  Connection con=LoginDao.getConnection();     
PreparedStatement ps=con.prepareStatement(  
"select * from ex_user_login where username=? and userpass=? ");  
ps.setString(1,username);  
ps.setString(2,userpass);  
//ps.setString(3,user);
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}
```

___


## 4.Login_NewStore.java


```sh
import java.io.*;  
import java.sql.*;  
import java.sql.Connection;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;  
  @WebServlet("/Login_NewStore")
public class Login_NewStore extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("username");  
String p=request.getParameter("pwd1");  
 
          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/adminlogin", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into ex_user_login (username,userpass)values(?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully Signed Up...");  
       
}catch (Exception e2) {System.out.println(e2);}  
    
    
String name=null;
String ID=null;
 HttpSession session=request.getSession();  
name = (String)session.getAttribute("username");
ID = (String)session.getId();
System.out.println("name is = :"+name);

   request.setAttribute("message", name);
RequestDispatcher dispatcher = request.getRequestDispatcher("userEventRegistration.jsp");
dispatcher.forward(request, response);         
out.close();  
}  
  
}
```

___


## 5.Logout.java


```sh
    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession; 
    import javax.servlet.annotation.WebServlet; 
    @WebServlet("/Logout")
    public class Logout extends HttpServlet {  
            protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                    throws ServletException, IOException {  
                response.setContentType("text/html");  
                PrintWriter out=response.getWriter();  
                  
                request.getRequestDispatcher("Login.jsp").include(request, response);  
                  
                HttpSession session=request.getSession();  
                session.invalidate();  
                  
                out.print("You are successfully Signed out!");  
                  
                out.close();  
        }  
    }  
```

___


## 6.SaveServlet.java


```sh
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@WebServlet("/SaveServlet")  
public class SaveServlet extends HttpServlet {  
    SaveServlet javaEmail=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String firstname=request.getParameter("firstname");  
        String lastname=request.getParameter("lastname");  
        String email=request.getParameter("email");  
        String date=request.getParameter("date"); 
        String time=request.getParameter("time");  
        String topic=request.getParameter("topic");  
        String location=request.getParameter("location");   
          
       pojoEvent e=new pojoEvent();  
        e.setFirstName(firstname);  
        e.setLastName(lastname);  
        e.setEmail(email);  
        e.setDate(date);
         e.setTime(time);  
          e.setTopic(topic);  
           e.setLocation(location);  
          
        int status=EventDao.save(e);  
        if(status>0){  
            out.print("<p align=\"center\">Record saved successfully!</p>");  
            request.getRequestDispatcher("WelcomeServlet").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
        response.setContentType("text/html;charset=UTF-8");

String toMail = request.getParameter("email");


try {
SaveServlet javaEmail = new SaveServlet();
final String username = "Your Username";
final String password = "Your Password";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "Your Host");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("Your Internet Address"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(toMail));

message.setSubject("Event Registration Succesful");
message.setContent("<h1>Hi "+firstname+"</h1><br><br><h2>Your Registration Is Succesful</h2><br><br><h3>Event Details:<br><br>Date:"+date+"<br>"+"<br>Time:"+time+"<br>"+"<br>Topic:"+topic+"<br>"+"<br>Location:"+location+"<br>","text/html" );
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e2)
{
throw new RuntimeException(e2);
}

//javaEmail.sendEmail(toMail);
out.println("Process Completed\n");
} catch (Exception e1) {
e1.printStackTrace();
}
out.println("event registered successfully");
}


    }  
  

```

___


## 7.EditServlet.java:


```sh
    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/EditServlet")  
    public class EditServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            out.println("<h1>Update Users</h1>");  
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
              
           pojoEvent e=EventDao.getUsersById(id);  
              
            out.print("<form action='EditServlet2' method='post'>");  
            out.print("<table>");  
            out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
            out.print("<tr><td>FirstName:</td><td><input type='text' name='firstname' value='"+e.getFirstName()+"'/></td></tr>");  
            out.print("<tr><td>LastName:</td><td><input type='text' name='lastname' value='"+e.getLastName()+"'/></td></tr>");  
            out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>"); 
             out.print("<tr><td>Date:</td><td><input type='date' name='date' value='"+e.getDate()+"'/></td></tr>");  
              out.print("<tr><td>Time:</td><td><input type='time' name='time' value='"+e.getTime()+"'/></td></tr>");  
               out.print("<tr><td>Topic:</td><td><input type='text' name='topic' value='"+e.getTopic()+"'/></td></tr>");  
                 
            out.print("<tr><td>Location:</td><td>");  
            out.print("<select name='location' style='width:150px'>");  
            out.print("<option>Coimbatore</option>");  
            out.print("<option>Bangalore</option>");  
            
            out.print("</select>");  
            out.print("</td></tr>");  
            out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
            out.print("</table>");  
            out.print("</form>");  
              
            out.close();  
        }  
    }  
```

___


## 8.EditServlet2.java :


```sh
    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/EditServlet2")  
    public class EditServlet2 extends HttpServlet {  
        protected void doPost(HttpServletRequest request, HttpServletResponse response)   
              throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
            String firstname=request.getParameter("firstname");  
            String lastname=request.getParameter("lastname");  
            String email=request.getParameter("email");  
            String date=request.getParameter("date");  
              String time=request.getParameter("time");  
                String topic=request.getParameter("topic");  
                String location=request.getParameter("location"); 
            pojoEvent e=new pojoEvent();  
            e.setId(id);  
            e.setFirstName(firstname);  
            e.setLastName(lastname);  
            e.setEmail(email);  
            e.setDate(date); 
            e.setTime(time);
            e.setTopic(topic);
            e.setLocation(location);

              
            int status=EventDao.update(e);  
            if(status>0){  
                response.sendRedirect("ViewServlet");  
            }else{  
                out.println("Sorry! unable to update record");  
            }  
              
            out.close();  
        }  
      
    }  
```

___


## 9.ViewServlet.java :


```sh
    import java.io.IOException;  
    import java.io.PrintWriter;  
    import java.util.List;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/ViewServlet")  
    public class ViewServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
                   throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
           // out.println("<a href='eventregister.jsp'>Add New User</a>");  
            out.println("<h1>Users List</h1>");  
              
            List<pojoEvent> list=EventDao.getAllUsers();  
              out.print("<html>" );
              out.print("<head>               <meta name='viewport' content='width=device-width, initial-scale=1'>	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script></head>");
            out.print("<table border='2' width='100%'");  
            out.print("<tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Email</th><th>Date</th><th>Time</th><th>Topic</th><th>Location</th><th>Edit</th><th>Delete</th></tr>");  
            for(pojoEvent e:list){  
             out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFirstName()+"</td><td>"+e.getLastName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td><td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td>   <td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");  
            }  
            out.print("</table>");  
              
            out.close();  
        }  
    }  
```

___


## 10.DeletServlet.java


```sh
    import java.io.IOException;  
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/DeleteServlet")  
    public class DeleteServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
                 throws ServletException, IOException {  
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
            EventDao.delete(id);  
            response.sendRedirect("ViewServlet");  
        }  
    }  
```

___


## 11.admin_SaveServlet.java 


```sh
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@WebServlet("/admin_SaveServlet")  
public class admin_SaveServlet extends HttpServlet {  
    SaveServlet javaEmail=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String firstname=request.getParameter("firstname");  
        String lastname=request.getParameter("lastname");  
        String email=request.getParameter("email");  
        String date=request.getParameter("date"); 
        String time=request.getParameter("time");  
        String topic=request.getParameter("topic");  
        String location=request.getParameter("location");   
          
       pojoEvent e=new pojoEvent();  
        e.setFirstName(firstname);  
        e.setLastName(lastname);  
        e.setEmail(email);  
        e.setDate(date);
         e.setTime(time);  
          e.setTopic(topic);  
           e.setLocation(location);  
          
        int status=EventDao.save(e);  
        if(status>0){  
            out.print("<p align=\"center\">Record saved successfully!</p>");  
            request.getRequestDispatcher("eventregister.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
        response.setContentType("text/html;charset=UTF-8");

String toMail = request.getParameter("email");


try {
SaveServlet javaEmail = new SaveServlet();
final String username = "your Username";
final String password = "Your Password";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "Your host");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("Your inernet address"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(toMail));

message.setSubject("Event Registration Succesful");
message.setContent("<h1>Hi "+firstname+"</h1><br><br><h2>Your Registration Is Succesful</h2><br><br><h3>Event Details:<br><br>Date:"+date+"<br>"+"<br>Time:"+time+"<br>"+"<br>Topic:"+topic+"<br>"+"<br>Location:"+location+"<br>","text/html" );
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e2)
{
throw new RuntimeException(e2);
}

//javaEmail.sendEmail(toMail);
out.println("Process Completed\n");
} catch (Exception e1) {
e1.printStackTrace();
}
out.println("event registered successfully");
}


    }  
  
```

___


## 12.WelcomeServlet.java :


```sh
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
 import javax.servlet.annotation.WebServlet; 
 @WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("username");  
    out.print("Welcome To Our Event <a href='Home.jsp'>Home</a><br/><a href='Login.jsp'>Logout</a>");  
          
    out.close();  
    }  
  
}
```


___


## 13.MyFilter.java


```sh
    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.*;  
    import javax.servlet.http.HttpSession; 
    import javax.servlet.annotation.WebFilter;
    import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
      @WebFilter(filterName="MyFilter", urlPatterns="/eventregister.jsp")
    public class MyFilter implements Filter{  
      
    public void init(FilterConfig arg0) throws ServletException {}  
          
    public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {  

          HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;    
        PrintWriter out=response.getWriter();  
              
              String n=request.getParameter("username");  
        String p=request.getParameter("userpass");  
        String u=request.getParameter("user"); 
         
        if(LoginDao.validateAdmin(n,p)){  
            out.print("Welcome Admin, "+n);  
        HttpSession session=req.getSession();  
        session.setAttribute("name",n);  
        chain.doFilter(request, response);//sends request to next resource  
    }  
   else if(LoginDao.validateUser(n,p)){  
       out.print("Welcome , "+n);  
        HttpSession session=req.getSession();  
        session.setAttribute("name",n);  
            RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
            rd.forward(request,response);  
        } 
        else{  
        out.print("username or password error!");  
        RequestDispatcher rd=request.getRequestDispatcher("Log_Error.jsp");  
        rd.forward(request, response);  
        }  
              
    }  
        public void destroy() {}  
      
    }  
```

___


## Screen Shots:
## Sign up
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Sign%20up.png "Logo Title Text 1")

___
___

## User Registration Form:
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/User%20Registration%20Form.png "Logo Title Text 1")

___
___


## Record saved:
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Record%20Saved.png "Logo Title Text 1")

___
___


## Email Send to the Registered User:
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/email.png "Logo Title Text 1")


___
___



## Sign out:
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Sign%20out.png "Logo Title Text 1")


___
___



## Sign in :
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Sign%20in.png "Logo Title Text 1")


___
___


## Sign in Error :
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Log%20Error.png "Logo Title Text 1")

___
___


## Record manage by admin :
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Record%20management-Admin.png "Logo Title Text 1")

___
___


## Edit by admin :
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Edit%20by%20Admin.png "Logo Title Text 1")

___
___


## Delete by admin :
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/After%20Delete%20by%20Admin.png "Logo Title Text 1")

___
___



## Home :
![alt text](https://raw.githubusercontent.com/suriyanS/Servlet_Project/master/ScreenShots/Home.png "Logo Title Text 1")

___
___


## Future Enhancements:
___

* Add Forgot Password Option

* Add Change Password Option

* Enhance  Email Function in more secured manner

* Enhance Web Pages 


