package jp.co.myapp.useCases.user.create;

import org.junit.Test;

public class UserCreateUseCaseInteractorTest {
	@Test
	public void testHandle() {
		UserCreateUseCaseInteractor useCase = new UserCreateUseCaseInteractor(null, null);
		useCase.handle(null);
	}
}
