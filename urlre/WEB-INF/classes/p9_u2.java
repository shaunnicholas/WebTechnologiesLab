import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class p9_u2 extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();            
        //getting value from the query string  
        String n=request.getParameter("uname");  
        out.print("Welcome to the Anime Express "+n);  
        out.close();  
        }catch(Exception e){System.out.println(e);}  
    } 
}