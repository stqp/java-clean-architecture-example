package jp.co.myapp.application.volume;

import jp.co.myapp.domain.entities.volume.Volume;

public interface IVolumeRepository {

	public void save(Volume volume);

	public Volume findByVolumeId(String id);
}
