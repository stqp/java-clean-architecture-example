package jp.co.app.domain.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class User {
	private String userName;

	public User(String userName) {
		this.userName = userName;
	}
}