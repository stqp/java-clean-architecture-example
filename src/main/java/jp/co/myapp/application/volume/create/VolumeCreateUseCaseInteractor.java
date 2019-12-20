package jp.co.myapp.application.volume.create;

import java.nio.charset.Charset;
import java.util.Random;

import jp.co.myapp.application.volume.IVolumeRepository;
import jp.co.myapp.domain.entities.volume.Volume;
import jp.co.myapp.domain.exceptions.volume.InvalidVolumeException;

public class VolumeCreateUseCaseInteractor implements IVolumeCreateUseCase {

	private IVolumeRepository repo;
	private IVolumeCreatePresentor presentor;

	public VolumeCreateUseCaseInteractor(IVolumeRepository repo, IVolumeCreatePresentor presentor) {
		this.repo = repo;
		this.presentor = presentor;
	}

	public void handle(VolumeCreateInputData input) {

		VolumeCreateOutputData output = new VolumeCreateOutputData();

		try {

			Volume volume = buildVolume(input);
			repo.save(volume);

			output.id(volume.id());
			output.owner(volume.owner());
			output.usedPercentage(volume.usedPercentage());
			output.capacityByte(volume.capacityByte());
			presentor.complete(output);

		} catch (InvalidVolumeException e) {

			e.printStackTrace();

			output.error(e.toString());
			output.id("");
			output.owner("");
			output.usedPercentage(0);
			output.capacityByte(-1);
			presentor.complete(output);

		}

	}

	private Volume buildVolume(VolumeCreateInputData input) throws InvalidVolumeException {
		Volume volume = (new Volume()).id("test").capacityByte(assignedVolumeSize(input.userWantByte()))
				.usedPercentage(0).owner(input.userName());
		volume.validate();
		return volume;
	}

	public String generateId() {
		byte[] array = new byte[20];
		new Random().nextBytes(array);
		return new String(array, Charset.forName("UTF-8"));
	}

	public int assignedVolumeSize(int wantByte) {
		if (wantByte < 100000) {
			return wantByte;
		}
		return 10;
	}

}