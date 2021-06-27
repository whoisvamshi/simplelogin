package com.vamshi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.LoginDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String fname = request.getParameter("fname");
      String pass = request.getParameter("pass");
      
      // if(fname.equals("vamshikrishna07") &&pass.equals("vamshi@143"))
      
      LoginDao dao = new LoginDao();
      
      if(dao.check(fname, pass))
      {
    	  HttpSession session = request.getSession();
    	  session.setAttribute("username", fname);
    	  response.sendRedirect("welcome.jsp");
	}
      else
      {
          response.sendRedirect("login.jsp");
	}

}
}
