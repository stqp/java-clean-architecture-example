package jp.co.myapp.domain.entities.user;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class User {
	private String userId;

	public User(String userId) {
		this.userId = userId;
	}
}