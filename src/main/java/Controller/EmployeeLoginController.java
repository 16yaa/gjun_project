package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.*;
import Model.*;

/**
 * Servlet implementation class EmployeeLoginController
 */
@WebServlet("/EmployeeLoginController")
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		List<Object> l=new employeeDao().query(username, password);
		Employee emp=null;
		if(l.size()!=0)
		{
			Object[] o=l.toArray();
			emp=(Employee) o[0];
			session.setAttribute("emp",emp);
			response.sendRedirect("employee/loginSuccess.jsp");
			
		}
		else
		{
			response.sendRedirect("employee/loginError.jsp");
		}
	}

}
