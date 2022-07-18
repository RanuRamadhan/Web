package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<section class=\"jumbo\" id=\"jumbo\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-md-6\">\n");
      out.write("\n");
      out.write("        <h1>LOGIN</h1>\n");
      out.write("        <form action=\"weblogout.jsp\" method=\"post\">\n");
      out.write("            <table style=\"with: 100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username:</td>\n");
      out.write("                            <td><input type=\"text\" placeholder=\"Username\" name=\"username\" required/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                            <td><input type=\"password\" Placeholder=\"Password\" name=\"password\" required/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <br>\n");
      out.write("                            <p>Don't have an account? <a href=\"adduserform.jsp\">Register Here</a>.<p>\n");
      out.write("                        </table>\n");
      out.write("                            <button name=\"submit\" class=\"btn\">Login</button><a href=\"/logout.jsp\"></a>\n");
      out.write("                         </form>\n");
      out.write("                        </body>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-6\">\n");
      out.write("                        <img src=\"img/4401287.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section> \n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
