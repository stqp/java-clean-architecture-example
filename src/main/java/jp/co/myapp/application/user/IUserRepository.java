package jp.co.myapp.application.user;

import jp.co.myapp.domain.entities.user.User;

public interface IUserRepository {

	public void save(User user);

	public User findByUserId(String id);

}