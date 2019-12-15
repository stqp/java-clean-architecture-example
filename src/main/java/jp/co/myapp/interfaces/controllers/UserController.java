package jp.co.myapp.interfaces.controllers;

import jp.co.myapp.useCases.user.create.IUserCreateUseCase;
import jp.co.myapp.useCases.user.create.UserCreateInputData;

public class UserController {
	
	IUserCreateUseCase useCase;
	
	public UserController(IUserCreateUseCase useCase) {
		this.useCase = useCase;
	}
	public void createUser(String userId) {
		UserCreateInputData inputData = new UserCreateInputData(userId);
		useCase.handle(inputData);
	}
}
