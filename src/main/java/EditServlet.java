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