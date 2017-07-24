import java.io.*;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;class Data extends HttpServlet
{
   // String fname,lname,email,date,time,topic,location;
    List<String> datalist=new ArrayList<String>();
 public void doGet(HttpServletRequest request, HttpServletResponse response)
                  throws ServletException, IOException {

          
            try {
                    response.setContentType("text/html");
            PrintWriter out = response.getWriter();
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");
                  Statement st=con.createStatement();
                ResultSet r=st.executeQuery("select * from eventform");
                while(r.next())
                {
                     datalist.add(r.getString("firstname"));
                     datalist.add(r.getString("lastname"));
                      datalist.add(r.getString("email"));
                       datalist.add(r.getString("date"));
                        datalist.add(r.getString("time"));
                         datalist.add(r.getString("topic"));
                          datalist.add(r.getString("location"));
                }
                r.close();
                st.close();

                 request.setAttribute("data","datalist"); 
                RequestDispatcher dispatcher = request.getRequestDispatcher("eventregister.jsp");
               
                dispatcher.forward( request, response );
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
}
}