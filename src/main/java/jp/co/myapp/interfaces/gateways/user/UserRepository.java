package jp.co.myapp.interfaces.gateways.user;

import java.util.ArrayList;
import java.util.Iterator;

import jp.co.myapp.application.user.IUserRepository;
import jp.co.myapp.domain.entities.user.User;

public class UserRepository implements IUserRepository {

	private ArrayList<User> db;

	public UserRepository() {
		this.db = new ArrayList<User>();
	}

	public void save(User user) {
		db.add(user);
	}

	public User findByUserId(String userId) {
		Iterator<User> it = db.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			if (user.userId() == userId) {
				return user;
			}
		}
		return null;
	}

}