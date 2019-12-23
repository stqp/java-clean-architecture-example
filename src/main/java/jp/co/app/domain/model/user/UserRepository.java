package jp.co.app.domain.model.user;

import java.util.List;

public interface UserRepository {

	public void save(User user);

	public User findByUserId(String id);

	public List<User> findAll();

}