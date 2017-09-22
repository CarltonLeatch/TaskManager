package model;

import java.util.List;

import org.hibernate.SessionFactory;

import entities.*;

@SuppressWarnings("unchecked")
public class AbstractModel<T> {
	
	private Class<T> entityClass;
	protected final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	
	public AbstractModel(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	public AbstractModel(){
		
	}
	
	public List<T> findAll(){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			return sessionFactory.getCurrentSession().createQuery("from" + entityClass.getName()).list();
			
			
		}catch(RuntimeException re){
			return null;
		}
		
	}
	
	public T findById(int id){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			return (T) sessionFactory.getCurrentSession().createQuery("from" + entityClass.getName() + "where id =" + id).list();
		}catch(RuntimeException re){
			return null;
		}
		
	}
	
	public void add(T entity){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			sessionFactory.getCurrentSession().persist(entity);
		}catch(RuntimeException re){
			System.out.println(re);
		}
		
	}
	
	public void delete(T entity){
		try{
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			sessionFactory.getCurrentSession().delete(entity);
		}catch(RuntimeException re){
			System.out.println(re);
		}
}
}