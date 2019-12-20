package jp.co.myapp.application.user.create;

import jp.co.myapp.application.user.IUserRepository;
import jp.co.myapp.domain.entities.user.User;

public class UserCreateUseCaseInteractor implements IUserCreateUseCase {

	private IUserRepository repo;
	private IUserCreatePresentor presentor;

	public UserCreateUseCaseInteractor(IUserRepository repo, IUserCreatePresentor presentor) {
		this.repo = repo;
		this.presentor = presentor;
	}

	public void handle(UserCreateInputData inputData) {
		String userId = inputData.userName();

		User user = new User(userId);
		repo.save(user);

		UserCreateOutputData outputData = (new UserCreateOutputData()).userId(user.userId());
		presentor.complete(outputData);
	}

}
