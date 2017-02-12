package com.nhb.api.competitive.player;

import org.springframework.data.annotation.Id;

public class Player {
	@Id
	private String id;
	private String nick;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", nick=" + nick + "]";
	}
	
}
