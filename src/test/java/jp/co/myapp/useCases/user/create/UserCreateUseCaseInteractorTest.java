package jp.co.myapp.usecases.user.create;

import org.junit.Test;

import jp.co.myapp.application.user.create.UserCreateUseCaseInteractor;

public class UserCreateUseCaseInteractorTest {
	@Test
	public void testHandle() {
		UserCreateUseCaseInteractor useCase = new UserCreateUseCaseInteractor(null, null);
		useCase.handle(null);
	}
}
