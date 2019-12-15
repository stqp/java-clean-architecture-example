package jp.co.myapp.interfaces.gateways;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UserCreateViewModel implements IUserCreateViewModel{
	String userId;
	
	private List<IUserCreateView> observers;
	
	public UserCreateViewModel() {
		this.observers = new ArrayList<IUserCreateView>();
	}
	
	public UserCreateViewModel(String userId){
		this.userId  = userId;
	}
	
	public String userId (){
		return userId;
	}

	public void userId(String userId) {
		this.userId = userId;
	}
	
	public void addObserver(IUserCreateView observer) {
		this.observers.add(observer);
	}

	public void notifyObservers() {
		Iterator<IUserCreateView> it = this.observers.iterator();
		while(it.hasNext()) {
			IUserCreateView observer = it.next();
			observer.update(this);
		}
	}
}
