package cognizant;
// just GET
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class MyServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MyServletLogin() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String u = (String) request.getParameter("u");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("hello from GET");
		response.getWriter().println("<h2>Simple Login Servlet "+u+"</h2>");
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		response.getWriter().println("your email: "+email);
		response.getWriter().println("your pass: "+password);
	}


}
