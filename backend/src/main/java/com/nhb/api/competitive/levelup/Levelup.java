package com.nhb.api.competitive.levelup;

import org.springframework.data.annotation.Id;

public class Levelup {
	@Id
	protected String id;
	protected String signing;
	protected Integer price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSigning() {
		return signing;
	}
	public void setSigning(String signing) {
		this.signing = signing;
	}
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Levelup [id=" + id + ", signing=" + signing + ", price=" + price + "]";
	}
	
	
	
	
}
