package jp.co.app.domain.model.volume;

public interface VolumeRepository {

	public void save(Volume volume);

	public Volume findByVolumeId(String id);
}
