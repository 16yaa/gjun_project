package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.mobileOrderDao;
import Model.Shoppingcart;
import Model.mobileOrder;



@WebServlet("/addmobileOrderController")
public class addmobileOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addmobileOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		mobileOrder mo=(mobileOrder) session.getAttribute("mo");
		List<Object> l=new mobileOrderDao().queryShoppingcart();
		Shoppingcart[] sc=l.toArray(new Shoppingcart[l.size()]);
		mo.setIphome13(sc[0].getSciphome13());
		mo.setAirpads(sc[0].getScairpads());
		mo.setPhonecable(sc[0].getScphonecable());
		mo.setPhonecase(sc[0].getScphonecase());
		mo.setProtector(sc[0].getScprotector());
		mo.setSum(sc[0].getSum());
		new mobileOrderDao().add(mo);
		new mobileOrderDao().update1();
		new mobileOrderDao().update2();
		new mobileOrderDao().update3();
		new mobileOrderDao().update4();
		new mobileOrderDao().update5();
		
		
		response.sendRedirect("mobileOrder/finish.jsp");
	}

	
}
