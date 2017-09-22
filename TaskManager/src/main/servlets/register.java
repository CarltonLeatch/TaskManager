package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import dao.DBConnection;

import entities.Users;
import model.UsersModel;


/**
 * Servlet implementation class register
 */
@WebServlet("/register")
@Stateless
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	HttpSession session = request.getSession();
	
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String passwordConfi = request.getParameter("passwordConfi");
		
		UsersModel UM = new UsersModel();
		if(UM.register(request.getParameter("username"), request.getParameter("email")) == null){
		PasswordConfirm(password,passwordConfi);
		
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
		
		session.setAttribute("RegisterConfirm", "true");
		session.setAttribute("RegisterError", "false");
		
		UM.add(user);
		
		
	
		}else{
		session.setAttribute("RegisterConfirm", "false");
		session.setAttribute("RegisterError", "true");
		}
		response.sendRedirect("register.jsp");
	}
	
	
	private boolean PasswordConfirm(String password, String PasswordConfirm){
		if(password.equals(PasswordConfirm))
			return true;
		return false;
	}

}


