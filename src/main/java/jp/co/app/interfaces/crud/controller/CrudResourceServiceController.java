package jp.co.app.interfaces.crud.controller;

import java.util.List;

import jp.co.app.domain.model.user.User;

public interface CrudResourceServiceController {

	public String healthcheck();

	public List<User> listAllUsers();

	public void createUser(String userName);

	public void createVolume(int wantBytes, String userName);
}
