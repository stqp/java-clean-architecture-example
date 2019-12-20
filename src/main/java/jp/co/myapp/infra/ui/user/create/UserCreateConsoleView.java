package jp.co.myapp.infra.ui.user.create;

import jp.co.myapp.interfaces.gateways.user.create.IUserCreateView;
import jp.co.myapp.interfaces.gateways.user.create.UserCreateViewModel;

public class UserCreateConsoleView implements IUserCreateView{
	
	public void update(UserCreateViewModel viewModel) {
		System.out.println("USER-ID is '" + viewModel.userId() + "'");
	}
	
	
}
