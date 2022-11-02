package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Dao.mobilememberDao;
import Model.mobilemember;
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/mobileLoginController")
public class mobileLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public mobileLoginController() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		List<Object> l=new mobilememberDao().query(username, password);
		mobilemember m=null;
		if(l.size()!=0)
		{
			Object[] o=l.toArray();
			m=(mobilemember) o[0];
			session.setAttribute("M",m);
			response.sendRedirect("member/loginSuccess.jsp");
			
		}
		else
		{
			response.sendRedirect("member/loginError.jsp");
		}
		
	}

}
