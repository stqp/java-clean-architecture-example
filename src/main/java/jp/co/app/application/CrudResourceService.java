package jp.co.app.application;

public interface CrudResourceService {

	public void createUser(String userName);

	public void createVolume(int wantBytes, String userName);
}
