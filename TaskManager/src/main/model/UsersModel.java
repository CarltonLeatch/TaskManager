package model;

import entities.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;



public class UsersModel extends AbstractModel<Users>{
	
	public UsersModel() {
		super(Users.class);
	}
	
	
	public void add(Users user){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			sessionFactory.getCurrentSession().save(user);
			
			sessionFactory.getCurrentSession().getTransaction().commit();
		}catch(Exception e){
			
		}
		
	}
	
	
	public void update(Users user){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			sessionFactory.getCurrentSession().update(user);
			
			sessionFactory.getCurrentSession().getTransaction().commit();
		}catch(Exception e){
			
		}
		
	}
	
	public Users searchByUsername(String username){
				try{
		
					if(!sessionFactory.getCurrentSession().getTransaction().isActive())
						sessionFactory.getCurrentSession().getTransaction().begin();
					Users u = (Users)sessionFactory.getCurrentSession().getNamedQuery("searchByUsername")
						.setParameter("username", username)
						.uniqueResult();
					return u;
		}catch(Exception e)
		{
			return null;
		}
	}
	
	public Users login(String username, String password){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			Users u  = (Users)sessionFactory.getCurrentSession().getNamedQuery("loginAndPassword")
					.setParameter("username", username)
					.setParameter("password", password)
					.uniqueResult();
			/*Query q = this.sessionFactory
					.getCurrentSession()
					.createSQLQuery("Select * from users where username = :username and password = :password")
					.setParameter("username", username)
					.setParameter("password", password);
			*/
			
			
		//	q.setString("password", password);
			return u;
			
		}catch(Exception e){
			return null;
		}			
	}
	
	public Users register(String username, String email){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			
			Users u = (Users) sessionFactory.getCurrentSession().getNamedQuery("loginOrEmail")
					.setParameter("username", username)
					.setParameter("email", email)
					.uniqueResult();
				return u;
		}catch(Exception e){
			return null;
		}
	}


}
