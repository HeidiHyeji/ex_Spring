package com.koreait.ex08_xml_namespace;

public class Family {
	private String papaName;
	private String mamaName;
	private String sisterName;
	private String brotherName;
	
	public Family() {
		// TODO Auto-generated constructor stub
	}
	public Family(String papaName, String mamaName) {
		super();
		this.papaName = papaName;
		this.mamaName = mamaName;
	}
	
	public String getPapaName() {
		return papaName;
	}
	public String getMamaName() {
		return mamaName;
	}
	public String getSisterName() {
		return sisterName;
	}
	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}
	public String getBrotherName() {
		return brotherName;
	}
	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}
	
}
