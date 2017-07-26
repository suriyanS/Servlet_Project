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
            out.println("<h3>Users List</h3>");  
              
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