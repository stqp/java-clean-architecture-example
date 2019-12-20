package jp.co.myapp.interfaces.presentation.user.create;

import jp.co.myapp.application.user.create.IUserCreatePresentor;
import jp.co.myapp.application.user.create.UserCreateOutputData;
import jp.co.myapp.interfaces.gateways.user.create.IUserCreateViewModel;

public class UserCreatePresentor implements IUserCreatePresentor {

	private IUserCreateViewModel viewModel;

	public UserCreatePresentor(IUserCreateViewModel viewModel) {
		this.viewModel = viewModel;
	}

	public void complete(UserCreateOutputData outputData) {
		String userId = outputData.userId();
		viewModel.userId(userId);
		viewModel.notifyObservers();
	}

}
