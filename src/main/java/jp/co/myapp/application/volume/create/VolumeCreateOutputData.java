package jp.co.myapp.application.volume.create;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class VolumeCreateOutputData {
	private String id;
	private int capacityByte;
	private int usedPercentage;
	private String owner;
	private String error;
}
