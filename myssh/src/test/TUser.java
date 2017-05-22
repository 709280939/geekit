package test;

import java.io.Serializable;

public class TUser implements Serializable {
	private String username;
	private String allname;
	private String address;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAllname() {
		return this.allname;
	}

	public void setAllname(String allname) {
		this.allname = allname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
