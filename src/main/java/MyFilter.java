    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.*;  
    import javax.servlet.annotation.WebFilter;
      
      @WebFilter(filterName="MyFilter", urlPatterns="/eventregister.jsp")
    public class MyFilter implements Filter{  
      
    public void init(FilterConfig arg0) throws ServletException {}  
          
    public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {  
              
        PrintWriter out=response.getWriter();  
              
              String n=request.getParameter("username");  
        String p=request.getParameter("userpass");  
        String u=request.getParameter("user"); 
         
        if(LoginDao.validateAdmin(n,p)){  
            
        chain.doFilter(request, response);//sends request to next resource  
    }  
   else if(LoginDao.validateUser(n,p)){  
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