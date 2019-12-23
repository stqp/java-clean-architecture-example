package jp.co.app.application.internal;

import java.nio.charset.Charset;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.app.application.CrudResourceService;
import jp.co.app.domain.model.user.User;
import jp.co.app.domain.model.volume.InvalidVolumeException;
import jp.co.app.domain.model.volume.Volume;
import jp.co.app.infrastructure.datastore.DefaultUserRepository;
import jp.co.app.infrastructure.datastore.DefaultVolumeRepository;

@Component
public class DefaultCrudResourceService implements CrudResourceService {

	@Autowired
	private DefaultUserRepository userRepository;

	@Autowired
	private DefaultVolumeRepository volumeRepository;

	public void createUser(String userName) {
		User user = new User(userName);
		userRepository.save(user);
	}

	public void createVolume(int wantBytes, String userName) {
		// VolumeCreateOutputData output = new VolumeCreateOutputData();

		try {

			Volume volume = buildVolume(wantBytes, userName);
			volumeRepository.save(volume);

			// output.id(volume.id());
			// output.owner(volume.owner());
			// output.usedPercentage(volume.usedPercentage());
			// output.capacityByte(volume.capacityByte());

		} catch (InvalidVolumeException e) {

			e.printStackTrace();

			// output.error(e.toString());
			// output.id("");
			// output.owner("");
			// output.usedPercentage(0);
			// output.capacityByte(-1);

		}

	}

	private Volume buildVolume(int wantBytes, String userName) throws InvalidVolumeException {
		Volume volume = (new Volume()).id("test").capacityByte(assignedVolumeSize(wantBytes)).usedPercentage(0)
				.owner(userName);
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
