package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobileOrderDao;

/**
 * Servlet implementation class StatusController
 */
@WebServlet("/StatusController")
public class StatusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public StatusController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID=Integer.parseInt(request.getParameter("id"));
		new mobileOrderDao().updateStatus(ID);
		response.sendRedirect("statuschange.jsp");
	}

}
