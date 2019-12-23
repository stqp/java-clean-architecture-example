package jp.co.app.interfaces.crud.controller.internal;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.co.app.application.CrudResourceService;
import jp.co.app.domain.model.user.User;
import jp.co.app.domain.model.user.UserRepository;
import jp.co.app.interfaces.crud.controller.CrudResourceServiceController;

@RestController
public class DefaultCrudResourceServiceController implements CrudResourceServiceController {

	@Autowired
	private CrudResourceService crudResourceService;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String healthcheck() {
		return "I am healthy";
	}

	@RequestMapping(value = "/rest/api/1/users", method = RequestMethod.GET)
	public List<User> listAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@RequestMapping(value = "/rest/api/1/usersstr", method = RequestMethod.GET)
	public String listAllUsersStr() {
		List<User> users = userRepository.findAll();
		Iterator<User> it = users.iterator();
		String text = "";
		while (it.hasNext()) {
			text += ((User) it.next()).userName() + ":";
		}
		return text;
	}

	@RequestMapping(value = "/rest/api/1/user", method = RequestMethod.POST)
	public void createUser(@RequestParam String userName) {
		crudResourceService.createUser(userName);
	}

	@RequestMapping(value = "/rest/api/1/user/dummy", method = RequestMethod.POST)
	public String createUserDummy(@RequestParam String userName) {
		return "user name:" + userName;
	}

	@RequestMapping(value = "/rest/api/1/volume", method = RequestMethod.POST)
	public void createVolume(int wantBytes, String userName) {
		crudResourceService.createVolume(wantBytes, userName);
	}

}
