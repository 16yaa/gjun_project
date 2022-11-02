package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.*;
import Model.*;

/**
 * Servlet implementation class addEmployeeController
 */
@WebServlet("/addEmployeeController")
public class addEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addEmployeeController() {
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
		request.setCharacterEncoding("UTF-8");
		String userName=request.getParameter("username");
		List<Object> l=new employeeDao().query(userName);
		
		if(l.size()!=0)
		{
			response.sendRedirect("employee/addEmployeeError.jsp");
		}
		else
		{
			String passWord=request.getParameter("password");
			Employee emp=new Employee(userName,passWord);
			
			new employeeDao().addemployee(emp);
			response.sendRedirect("employee/addEmployeeSuccess.jsp");
		}
	}

}
