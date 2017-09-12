package model;

import entities.*;




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
	
	public Users login(String username, String password){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			Query q = this.sessionFactory
					.getCurrentSession()
					.createQuery("SELECT u FROM users u WHERE u.username=:username AND u.password=:password")
					.setParameter("username", username)
					.setParameter("password", password);
		
			
		//	q.setString("password", password);
			return (Users) q.uniqueResult();
			
		}catch(Exception e){
			return null;
		}
	
	}

}
