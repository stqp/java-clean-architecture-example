package jp.co.myapp.useCases.user.create;

import jp.co.myapp.domain.entities.user.User;

public class UserCreateUseCaseInteractor implements IUserCreateUseCase{
	
	private IUserRepository repo;
	private IUserCreatePresentor presentor;
	
	public UserCreateUseCaseInteractor(IUserRepository repo,IUserCreatePresentor presentor ) {
		this.repo = repo;
		this.presentor = presentor;
	}

	
	public void handle(UserCreateInputData inputData) {
		String userId = inputData.userId();
		
		User user = new User(userId);
		repo.save(user);
		
		UserCreateOutputData outputData = new UserCreateOutputData(user.userId()); 
		presentor.complete(outputData);
	}

}
