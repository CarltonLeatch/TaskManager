package services;

import java.util.ArrayList;
import java.util.List;

import dao.User;

public class UserService {
	
	private static List<User> db = new ArrayList<User>();
	private static int currentId = 1;
	
	public List<User> getAll(){
		return db;
	}
	
	public User get(int id){
		for(User u : db)
			if(u.getUSER_ID() == id)
				return u;
		return null;
	}
	
	public void add(User u){
		u.setUSER_ID(++currentId);
		db.add(u);
	}
	
	public void update(User user){
		for(User u : db){
			if(u.getUSER_ID() == user.getUSER_ID()){
				u.setUsername(user.getUsername());
				u.setPassword(user.getPassword());
			}
		}
	}
	

}
