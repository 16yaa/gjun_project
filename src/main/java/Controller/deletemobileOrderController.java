package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobileOrderDao;
import Model.mobileOrder;


/**
 * Servlet implementation class deletemobileOrderController
 */
@WebServlet("/deletemobileOrderController")
public class deletemobileOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deletemobileOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Id=Integer.parseInt(request.getParameter("id"));
		mobileOrder m=new mobileOrderDao().queryId(Id);
		if(m.getStatus()=="已出貨")
		{
			response.getWriter().print("<script> alert(\"此訂單已出貨，無法取消\"");
			response.sendRedirect("mobileOrder/delete.jsp");
		}
		else
		{
			new mobileOrderDao().remove(Id);
			response.sendRedirect("mobileOrder/delete.jsp");
		}
		
	}

}
