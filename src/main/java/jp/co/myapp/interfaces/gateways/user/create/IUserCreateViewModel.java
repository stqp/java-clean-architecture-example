package jp.co.myapp.interfaces.gateways.user.create;

public interface IUserCreateViewModel {

	public String userId();

	public void userId(String userId);

	public IUserCreateViewModel addObserver(IUserCreateView observer);

	public void notifyObservers();

}
