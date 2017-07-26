package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.UserService;

@Stateless
public class Main {

	private UserService db = new UserService();
	
	@PersistenceContext
	static
	EntityManager em;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		User user = new User();
		user.setPassword("xx");
		user.setUsername("lols");
		
		em.persist(user);
		
		
	}

}
