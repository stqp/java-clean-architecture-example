package jp.co.myapp.useCases.user.create;

public class UserCreateOutputData {
	protected String userId;
	public UserCreateOutputData(String userId) {
		this.userId = userId;
	}
	public String userId() {
		return this.userId;
	}
}

