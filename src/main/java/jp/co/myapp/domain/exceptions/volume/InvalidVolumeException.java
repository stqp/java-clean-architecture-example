package jp.co.myapp.domain.exceptions.volume;

@SuppressWarnings("serial")
public class InvalidVolumeException extends Exception{

	public InvalidVolumeException(String error) {
		super(error);
	}
	public InvalidVolumeException() {
		super();
	}
	
}
