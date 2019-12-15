package jp.co.myapp.infra.ui;

import jp.co.myapp.interfaces.gateways.IUserCreateView;
import jp.co.myapp.interfaces.gateways.UserCreateViewModel;

public class UserCreateConsoleView implements IUserCreateView{
	
	public void update(UserCreateViewModel viewModel) {
		System.out.println("UserId : " + viewModel.userId());
	}
	
	
}
