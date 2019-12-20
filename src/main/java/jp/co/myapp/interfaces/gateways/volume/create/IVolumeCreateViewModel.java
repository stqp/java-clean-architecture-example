package jp.co.myapp.interfaces.gateways.volume.create;

public interface IVolumeCreateViewModel {

	public String id();

	public void id(String id);

	public int capacityByte();

	public void capacityByte(int capacityByte);

	public int usedPercentage();

	public void usedPercentage(int usedPercentage);

	public String owner();

	public void owner(String owner);

	public String error();

	public void error(String error);

	public IVolumeCreateViewModel addObserver(IVolumeCreateView observer);

	public void notifyObservers();

}
