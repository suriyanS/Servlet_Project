
 import java.io.IOException;  
    import java.io.PrintWriter;  
    import java.util.List;  
    import java.util.*;
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/CheckServlet")  
    public class CheckServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

List<String> disneyCharacters = Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto");
request.setAttribute("disneyCharacters", disneyCharacters);
PrintWriter out = response.getWriter();
out.println(disneyCharacters);
}
    }