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
public void doPost(HttpServletRequest request, HttpServletResponse response)  
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
    
    
String name=n;
String ID=null;
long time;
 HttpSession session=request.getSession();  
//name = (String)session.getAttribute("username");
  Date lastAccessTime = new Date(session.getLastAccessedTime());
ID = (String)session.getId();
time=session.getCreationTime();
 out.print("Welcome , "+n);
System.out.println("Session User name is = :"+name);
System.out.println("Session ID is = :"+ID);
System.out.println("Session creation Time is = :"+time);
System.out.println("Session LastAccessd Time is = :"+lastAccessTime);
    session.setAttribute("name",n); 
  // out.print("Session ID:"+ID);
RequestDispatcher dispatcher = request.getRequestDispatcher("userEventRegistration.jsp");
dispatcher.include(request, response);         
out.close();  
}  
  
}