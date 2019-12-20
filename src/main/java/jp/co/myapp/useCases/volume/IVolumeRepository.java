package jp.co.myapp.usecases.volume;

import jp.co.myapp.domain.entities.volume.Volume;

public interface IVolumeRepository {

	public void save(Volume volume);

	public Volume findByVolumeId(String id);
}
