package com.mycompany.app;

public class ConnectionChecker {
	private String uri;
	
	public ConnectionChecker(String uri) {
		this.uri = uri;
	}
	
	public boolean connect() {
		return true;
	}
}
