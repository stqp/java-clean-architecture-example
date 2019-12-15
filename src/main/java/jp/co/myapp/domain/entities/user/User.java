package jp.co.myapp.domain.entities.user;


public class User {
	String userId;
    
    public User(String userId) {
    	this.userId = userId;
    }
	public void userId(String userId) {
		this.userId = userId;
	}
	public String userId() {
		return this.userId;
	}
}