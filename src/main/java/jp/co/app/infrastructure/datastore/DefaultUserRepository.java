package jp.co.app.infrastructure.datastore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.app.domain.model.user.User;
import jp.co.app.domain.model.user.UserRepository;

@Component
public class DefaultUserRepository implements UserRepository {

	private ArrayList<User> db;

	public DefaultUserRepository() {
		this.db = new ArrayList<User>();
	}

	public void save(User user) {
		db.add(user);
	}

	public User findByUserId(String userName) {
		Iterator<User> it = db.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			if (user.userName() == userName) {
				return user;
			}
		}
		return null;
	}

	public List<User> findAll() {
		return db;
	}

}