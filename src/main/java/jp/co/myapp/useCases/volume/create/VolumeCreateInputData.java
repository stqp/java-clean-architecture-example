package jp.co.myapp.usecases.volume.create;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class VolumeCreateInputData {
	private int userWantByte;
	private String userName;
}
