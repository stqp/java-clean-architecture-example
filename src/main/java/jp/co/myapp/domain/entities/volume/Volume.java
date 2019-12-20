package jp.co.myapp.domain.entities.volume;

import jp.co.myapp.domain.exceptions.volume.InvalidVolumeException;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class Volume {
	private String id;
	private int capacityByte;
	private int usedPercentage;
	private String owner;

	public Boolean validate() throws InvalidVolumeException {
		if (this.id == "") {
			throw new InvalidVolumeException("id must not be empty");
		}
		if (this.capacityByte < 0) {
			throw new InvalidVolumeException("capacity must not be less than zero");
		}
		if (this.usedPercentage < 0 || this.usedPercentage > 100) {
			throw new InvalidVolumeException("used size must not be less than zero");
		}
		return false;
	}
}
