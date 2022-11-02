package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobileOrderDao;
import Model.Shoppingcart;
import Model.mobileOrder;

/**
 * Servlet implementation class deleteShoppingcartController1
 */
@WebServlet("/deleteShoppingcartController1")
public class deleteShoppingcartController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteShoppingcartController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		new mobileOrderDao().update1();
		
		response.sendRedirect("mobileOrder/Confirm.jsp");
	}

}
