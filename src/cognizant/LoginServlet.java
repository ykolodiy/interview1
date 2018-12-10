package cognizant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		response.getWriter().println("your email: "+email);
		response.getWriter().println("your pass: "+password);
		
		System.out.println(email);
		System.out.println(password);
		Authme auth = new Authme();
		
		boolean res = auth.authme(email, password);
		
		System.out.println(res);
		if(res) {
			request.getSession().setAttribute("uname", email);
			response.sendRedirect("good.jsp");
			
			return;
			
		}
		else {response.sendRedirect("form.jsp");}
	}

}
