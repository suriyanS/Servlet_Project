/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-26 10:04:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userEventRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!Doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title> Event Registration </title>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset='utf-8'>\r\n");
      out.write("\t<link rel='shortcut icon' href='fav.jpg' type='image' />\r\n");
      out.write("\t<meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("\t<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>\r\n");
      out.write("\t<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>\r\n");
      out.write("\t<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.well {\r\n");
      out.write("\t\t\tbackground-color: #3d40db;\r\n");
      out.write("\t\t\tpadding-left:400px;\r\n");
      out.write("\t\t\tfont-size: 30px;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.jumbotron {\r\n");
      out.write("\t\t\tcolor: #db443d;\r\n");
      out.write("\t\t\tbackground-color: #e4e8dc;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tlabel {\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\twidth: 140px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.out{\r\n");
      out.write("\t\t\tmargin-left:300px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload='onload();'>\r\n");
      out.write("\t<div class='container-fluid'>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<div class='well'>Event Registration\r\n");
      out.write("\t\t<a href=\"/Logout\"><button class=\"btn btn-danger out\">Sign Out</button></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class='jumbotron'>\r\n");
      out.write("\t\t\t<form action='SaveServlet' class='form-inline' method='post'>\r\n");
      out.write("\t\t\t\t<div class='row'>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class='col-sm-4'>\r\n");
      out.write("\t\t\t\t\t\t<label>First Name:</label> <input type='text' required placeholder='First Name' name='firstname'/><br/><br/>  \r\n");
      out.write("    <label>Last Name:</label> <input type='text'  placeholder='Initial'  name='lastname' /><br/><br/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class='col-sm-4'>\r\n");
      out.write("\t\t\t\t\t\t<label>Email Id:</label> <input type='email' placeholder='Email' required name='email' /><br/><br/>\r\n");
      out.write("\t\t\t\t\t\t<label>Date:</label> <input type='date' required placeholder='Date' name='date' /><br/><br/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class='col-sm-4'>\r\n");
      out.write("\t\t\t\t\t\t<label>Time:</label> <input type='time' placeholder='Time' required name='time' /><br/><br/>\r\n");
      out.write("\t\t\t\t\t\t<label>Topic:</label> <input type='text' placeholder='Topic' required name='topic' /><br/><br/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label>Location: </label>\r\n");
      out.write("\t\t\t\t\t<select name='location'>  \r\n");
      out.write("    <option>Coimbatore</option>  \r\n");
      out.write("    <option>Bangalore</option>  \r\n");
      out.write("    <option>other</option>  \r\n");
      out.write("    </select>\r\n");
      out.write("\t\t\t\t\t<br/><br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class='span12'>\r\n");
      out.write("\t\t\t\t\t\t<button  name=\"Register\" class='btn btn-primary' type='submit'>Register <span class='glyphicon glyphicon-save'></span></button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button  class='btn btn-danger' type='reset'>Cancel <span class='glyphicon glyphicon-remove'></span></button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}