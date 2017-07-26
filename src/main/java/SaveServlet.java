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
final String username = "suriyan.s@kggroup.com";
final String password = "Suriyan@4321";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("suriyan.s@kggroup.com"));
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
/*public static void sendEmail(String to)
{
final String username = "suriyan.s@kggroup.com";
final String password = "Suriyan@1234";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("suriyan.s@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(to));

message.setSubject("Event Registration Succesful");
message.setContent("<h1>sending html mail check</h1>","text/html" );
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e)
{
throw new RuntimeException(e);
}
}*/

    }  
  

