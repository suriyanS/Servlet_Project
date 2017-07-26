    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.*;  
    import javax.servlet.http.HttpSession; 
    import javax.servlet.annotation.WebFilter;
    import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
      @WebFilter(filterName="MyFilter", urlPatterns="/eventregister.jsp")
    public class MyFilter implements Filter{  
      
    public void init(FilterConfig arg0) throws ServletException {}  
          
    public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {  

          HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;    
        PrintWriter out=response.getWriter();  
              
              String n=request.getParameter("username");  
        String p=request.getParameter("userpass");  
        String u=request.getParameter("user"); 
         
        if(LoginDao.validateAdmin(n,p)){  
            out.print("Welcome Admin, "+n);  
        HttpSession session=req.getSession();  
        session.setAttribute("name",n);  
        chain.doFilter(request, response);//sends request to next resource  
    }  
   else if(LoginDao.validateUser(n,p)){  
       out.print("Welcome , "+n);  
        HttpSession session=req.getSession();  
        session.setAttribute("name",n);  
            RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
            rd.forward(request,response);  
        } 
        else{  
        out.print("username or password error!");  
        RequestDispatcher rd=request.getRequestDispatcher("Log_Error.jsp");  
        rd.forward(request, response);  
        }  
              
    }  
        public void destroy() {}  
      
    }  