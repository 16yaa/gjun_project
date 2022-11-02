package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobilememberDao;

/**
 * Servlet implementation class deleteMemberController
 */
@WebServlet("/deleteMemberController")
public class deleteMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Id=Integer.parseInt(request.getParameter("id"));
		new mobilememberDao().delete(Id);
		

		response.sendRedirect("mobileOrder/deletemember.jsp");
	}

}
