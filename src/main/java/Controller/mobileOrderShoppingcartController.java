package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.mobileOrderDao;
import Model.mobileOrder;
import Model.mobilemember;

/**
 * Servlet implementation class mobileOrderShoppingcartController
 */
@WebServlet("/mobileOrderShoppingcartController")
public class mobileOrderShoppingcartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public mobileOrderShoppingcartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		mobilemember m=(mobilemember)session.getAttribute("M");
		mobileOrder mo=null;
		int iphome13=Integer.parseInt(request.getParameter("iphome13"));
		int airpads=Integer.parseInt(request.getParameter("airpads"));
		int phonecable=Integer.parseInt(request.getParameter("phonecable"));
		int phonecase=Integer.parseInt(request.getParameter("phonecase"));
		int protector=Integer.parseInt(request.getParameter("protector"));
		mo=new mobileOrder(m.getName(),iphome13,airpads,phonecable,phonecase,protector);
		session.setAttribute("mo",mo);
		new mobileOrderDao().shoppingcart(mo);
		response.sendRedirect("mobileOrder/Confirm.jsp");
	}

}
