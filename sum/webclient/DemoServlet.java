import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import  my.*;
public class DemoServlet extends HttpServlet
{

public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
 {

  res.setContentType("text/html");
  PrintWriter   out = res.getWriter();
int x=Integer.parseInt(req.getParameter("firstno"));
int y=Integer.parseInt(req.getParameter("secondno"));
out.println("<html><body>");
 HelloWorldImplService hm=new HelloWorldImplService();
try {
HelloWorldImpl ht=hm.getHelloWorldImplPort();
ht.setValue(x,y);
out.println(ht.sum());
			
} catch (Exception e) 
{
		
e.printStackTrace();
}
out.println("</body></html>");
}


}





