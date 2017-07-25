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