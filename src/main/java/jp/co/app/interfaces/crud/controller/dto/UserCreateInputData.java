package jp.co.app.interfaces.crud.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class UserCreateInputData {

	private String userName;

}
