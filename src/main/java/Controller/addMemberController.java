package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobilememberDao;

import Model.mobilemember;


@WebServlet("/addMemberController")
public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("BIG5");
		String userName=request.getParameter("username");
		List<Object> l=new mobilememberDao().query(userName);
		
		if(l.size()!=0)
		{
			response.sendRedirect("member/addMemberError.jsp");
		}
		else
		{
			String Name=request.getParameter("name");
			String passWord=request.getParameter("password");
			String addRess=request.getParameter("address");
			String Mobile=request.getParameter("mobile");
			
			
			mobilemember m=new mobilemember(Name,userName,passWord,addRess,Mobile);
			
			new mobilememberDao().addmember(m);
			response.sendRedirect("member/addMemberSuccess.jsp");
		}
	}

}
