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

            String n = request.getParameter("firstname");
            String p = request.getParameter("lastname");
            String e = request.getParameter("email");
            String c = request.getParameter("date");
            String f = request.getParameter("time");
            String g = request.getParameter("topic");
            String h = request.getParameter("location");

            try {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");
                  PreparedStatement ps = con.prepareStatement("insert into eventform values(?,?,?,?,?,?,?)");

                  ps.setString(1, n);
                  ps.setString(2, p);
                  ps.setString(3, e);
                  ps.setString(4, c);
                  ps.setString(5, f);
                  ps.setString(6, g);
                  ps.setString(7, h);

                  int i = ps.executeUpdate();
                  if (i > 0)
                        out.print("You are successfully Completed the Event Registration...");
                  response.sendRedirect("eventregister.jsp");

            } catch (Exception e2) {
                  System.out.println(e2);
            }
            out.close();
      }
}