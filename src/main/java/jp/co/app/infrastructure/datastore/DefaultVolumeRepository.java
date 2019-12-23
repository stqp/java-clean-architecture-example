package jp.co.app.infrastructure.datastore;

import org.springframework.stereotype.Component;

import jp.co.app.domain.model.volume.Volume;
import jp.co.app.domain.model.volume.VolumeRepository;

@Component
public class DefaultVolumeRepository implements VolumeRepository {

	public void save(Volume volume) {
		// TODO Auto-generated method stub

	}

	public Volume findByVolumeId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
