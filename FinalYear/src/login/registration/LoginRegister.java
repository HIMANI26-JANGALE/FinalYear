package login.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegister() {
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao cd=new CustomerDaoImpl();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String submitType=request.getParameter("submit");
		Customer c=cd.getCustomer(username, password);
		if(submitType.equals("Login") && c!=null && c.getFirstName()!=null){
			System.out.println("login");
			request.setAttribute("message",c.getFirstName());
			request.getRequestDispatcher("dashboard.html").forward(request,response);

		}
		else if(submitType.equals("Register")){
			c.setUsername(username);
			c.setPassword(password);
			c.setFirstName(request.getParameter("FirstName"));
			c.setLastName(request.getParameter("LastName"));
			cd.insertCustomer(c);
			request.setAttribute("successmessage","Registration done,please login to continue !!!");
			request.getRequestDispatcher("Login.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("message","Data Not Found,Click On Registration");
			request.getRequestDispatcher("Login.jsp").forward(request,response);
		}
	}

}
