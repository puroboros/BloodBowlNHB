package com.nhb.api.competitive.player;

public class PlayerLogin extends Player{
	protected String login;
	protected String password;
	protected String email;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PlayerLogin [ Player="+super.toString()+", login=" + login + ", password=" + password + ", email=" + email + "]";
	}
	
}
