package jp.co.myapp.useCases.user.create;

import jp.co.myapp.domain.entities.user.User;

public interface IUserRepository{
    public void save(User user);

    public User findByUserId(String id);

}