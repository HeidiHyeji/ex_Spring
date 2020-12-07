package com.koreait.ex19_profile_java;

public class ServerInfo {
	private String ip;
	private String port;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getInfo(){
		return "ip:"+ip+"\tport:"+port;
	}
	
}
