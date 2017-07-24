import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
@WebServlet("/mainservlet")
public class mainservlet extends HttpServlet {
    private String message,message1,message3,jid,jfname,jlname,jemail,jdate,jtime,jtopic,jlocation;
 public void init() throws ServletException { 
    jfname="FirstName ";
     jlname="LastName";
     jemail="Email ";
     jdate="Date ";
     jtime="Time";
      jtopic="Topic";
       jlocation="Location";

   }
     public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {

           response.setContentType("text/html");
     // String id=request.getParameter("studentid");
      String fname=request.getParameter("firstname");
      String lname=request.getParameter("lastname");
      String email=request.getParameter("email");
      String date=request.getParameter("date");
      String time=request.getParameter("time");
      String topic=request.getParameter("topic");
      String location=request.getParameter("location");
       
      PrintWriter out = response.getWriter();
       
           
     if (request.getParameter("Register") != null)
      {
   
       
     
    
    

     
          try{
Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");
         
              PreparedStatement pre=conn.prepareStatement("insert into eventform values(?,?,?,?,?,?,?)") ; 
             
              // pre.setString(1, id);
              pre.setString(1, fname);
               pre.setString(2, lname);
                pre.setString(3, email);
                 pre.setString(4, date);
                  pre.setString(5, time);
                   pre.setString(6, topic);
                    pre.setString(7, location);
                    pre.executeUpdate();
                   
                  
       Statement stmt = conn.createStatement();
              String query="select * from eventform";
              ResultSet rs=stmt.executeQuery(query);

     
     out.println(  "<table border=2><tr><th>"+jfname+"</th><th>"+jlname+"</th><th>"+jemail+"</th><th>"+jdate+"</th><th>"+jtime+"</th><th>"+jtopic+"</th><th>"+jlocation+"</th></tr>");

   while (rs.next())
    { 
         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");

    }
          }

    catch (Exception e){
      out.println(e);
    }
    out.close();
      
      }



 else if (request.getParameter("Update") != null) {
 

     
          try{
 
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");
            PreparedStatement pre=conn.prepareStatement("update eventform set firstname=?,lastname=?,date=?,time=?,topic=?,location=? where email=?") ; 
             
               //pre.setString(1, id);
              pre.setString(1, fname);
               pre.setString(2, lname);
               // pre.setString(3, email);
                 pre.setString(3, date);
                  pre.setString(4, time);
                   pre.setString(5, topic);
                    pre.setString(6, location);
                     pre.setString(7, email);
                   pre.executeUpdate();
                   
                   
       Statement stmt = conn.createStatement();
              String query="select * from eventform";
              ResultSet rs=stmt.executeQuery(query);

     
     out.println(  "<table border=2><tr><th>"+jfname+"</th><th>"+jlname+"</th><th>"+jemail+"</th><th>"+jdate+"</th><th>"+jtime+"</th><th>"+jtopic+"</th><th>"+jlocation+"</th></tr>");

   while (rs.next())
    { 
         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");

    }
          }

    catch (Exception e){
      out.println(e);
    }
    out.close();
      
      }

      
 else if (request.getParameter("Delete") != null) {


     
          try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");
         
              PreparedStatement pre=conn.prepareStatement("delete from eventform where email=?") ; 
             pre.setString(1, email);
 pre.executeUpdate();
                   
                   
       Statement stmt = conn.createStatement();
              String query="select * from eventform";
              ResultSet rs=stmt.executeQuery(query);

     
     out.println(  "<table border=2><tr><th>"+jfname+"</th><th>"+jlname+"</th><th>"+jemail+"</th><th>"+jdate+"</th><th>"+jtime+"</th><th>"+jtopic+"</th><th>"+jlocation+"</th></tr>");

   while (rs.next())
    { 
         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");

    }
          }


 
 catch(Exception e)
 {
      out.println(e);
 }

}
/*else if (request.getParameter("Edit") != null) {
   out.println("<center><h1>" + message4+ "</h1></center>");

     
          try{
 
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");
            PreparedStatement pre=conn.prepareStatement("update eventtable set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where studentid=?") ; 
             String query = "select * from eventtable where studentid=?";
              pre.setString(1, id);

Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()){*/




      }

}

       