package Controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobilememberDao;
import Model.mobilemember;

/**
 * Servlet implementation class updatemobilememberControlle
 */
@WebServlet("/updatemobilememberController")
public class updatemobilememberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public updatemobilememberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
		int ID=Integer.parseInt(request.getParameter("id"));
		String Name=request.getParameter("name");
		String UserName=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		
		
		List l=new mobilememberDao().queryId(ID);
		Object[] o=l.toArray();
		mobilemember m=(mobilemember) o[0];
		
		m.setId(ID);
		m.setName(Name);
		m.setUsername(UserName);
		m.setPassword(password);
		m.setAddress(address);
		m.setMobile(mobile);
		LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=null;
        f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        m.setTime(now.format(f));
        
        new mobilememberDao().update(m);
        response.sendRedirect("mobileOrder/updatemember.jsp");
		
	}

}
