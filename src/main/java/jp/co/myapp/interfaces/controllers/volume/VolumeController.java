package jp.co.myapp.interfaces.controllers.volume;

import jp.co.myapp.application.volume.create.IVolumeCreateUseCase;
import jp.co.myapp.application.volume.create.VolumeCreateInputData;

public class VolumeController {
	IVolumeCreateUseCase useCase;

	public VolumeController(IVolumeCreateUseCase useCase) {
		this.useCase = useCase;
	}

	public void createVolume(String userName, int userWantByte) {
		VolumeCreateInputData input = new VolumeCreateInputData();
		input.userName(userName);
		input.userWantByte(userWantByte);
		useCase.handle(input);
	}
}
