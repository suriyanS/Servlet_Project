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