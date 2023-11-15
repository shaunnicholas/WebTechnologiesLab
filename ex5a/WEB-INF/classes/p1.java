// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class p1 extends HttpServlet {
   private String message;
   public void init() throws ServletException {
      // Do required initialization
      message = "Welcome Back";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
      out.println("<p> This is Kanyakumari </p>");
      out.println("<p style = \"font-family: Verdana, Geneva, Tahoma, sans-serif;\">Kanniyakumari, also known as Cape Comorin, is a city in Kanniyakumari district in the state of Tamil Nadu, India.</p>");
   }
   public void destroy() {
      // do nothing.
   }
}
