package jp.co.myapp.usecases.user.create;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class UserCreateOutputData {

	private String userId;

}
