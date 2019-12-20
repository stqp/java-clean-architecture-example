package jp.co.myapp.interfaces.controllers.user;

import jp.co.myapp.application.user.create.IUserCreateUseCase;
import jp.co.myapp.application.user.create.UserCreateInputData;

public class UserController {

	IUserCreateUseCase useCase;

	public UserController(IUserCreateUseCase useCase) {
		this.useCase = useCase;
	}

	public void createUser(String userName) {
		UserCreateInputData inputData = (new UserCreateInputData()).userName(userName);
		useCase.handle(inputData);
	}
}
