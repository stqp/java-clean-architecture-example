package jp.co.app.domain.model.volume;

@SuppressWarnings("serial")
public class InvalidVolumeException extends Exception{

	public InvalidVolumeException(String error) {
		super(error);
	}
	public InvalidVolumeException() {
		super();
	}
	
}
