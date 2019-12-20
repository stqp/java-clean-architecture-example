package jp.co.myapp.interfaces.gateways.volume.create;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VolumeCreateViewModel implements IVolumeCreateViewModel {

	private String id;
	private int capacityByte;
	private int usedPercentage;
	private String owner;
	private String error;
	private List<IVolumeCreateView> observers;

	public VolumeCreateViewModel() {
		observers = new ArrayList<IVolumeCreateView>();
	}

	public String id() {
		return id;
	}

	public int capacityByte() {
		return capacityByte;
	}

	public int usedPercentage() {
		return usedPercentage;
	}

	public String owner() {
		return owner;
	}

	public String error() {
		return error;
	}

	public void id(String id) {
		this.id = id;
	}

	public void capacityByte(int capacityByte) {
		this.capacityByte = capacityByte;
	}

	public void usedPercentage(int usedPercentage) {
		this.usedPercentage = usedPercentage;
	}

	public void owner(String owner) {
		this.owner = owner;
	}

	public void error(String error) {
		this.error = error;
	}

	public IVolumeCreateViewModel addObserver(IVolumeCreateView observer) {
		observers.add(observer);
		return this;
	}

	public void notifyObservers() {
		Iterator<IVolumeCreateView> it = observers.iterator();
		while (it.hasNext()) {
			IVolumeCreateView observer = it.next();
			observer.update(this);
		}
	}

}
