package jp.co.myapp.interfaces.gateways;

public interface IUserCreateViewModel {
	public String userId ();
	public void userId (String userId);
	public void notifyObservers();
}
