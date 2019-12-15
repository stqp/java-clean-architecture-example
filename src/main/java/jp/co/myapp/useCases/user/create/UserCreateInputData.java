package jp.co.myapp.useCases.user.create;

public class UserCreateInputData {
	private String userName;
	public UserCreateInputData(String userName) {
		this.userName = userName;
	}
	
	public String userId() {
		return this.userName;
	}

}
