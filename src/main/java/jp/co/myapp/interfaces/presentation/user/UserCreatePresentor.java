package jp.co.myapp.interfaces.presentation.user;

import jp.co.myapp.interfaces.gateways.IUserCreateViewModel;
import jp.co.myapp.useCases.user.create.IUserCreatePresentor;
import jp.co.myapp.useCases.user.create.UserCreateOutputData;

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


