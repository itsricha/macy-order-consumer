package com.zensar.training.dto.xml;

public class Contact {

	private String custID;
	private User name;
	private Address address;
	private String daytimePhoneNbr;
	private String homePhoneNbr;
	private String alternatePhoneNbr;
	private String sendSMSMessage;
	private String emailAddress;
	private String seperatorContact0;

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public User getName() {
		return name;
	}

	public void setName(User name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDaytimePhoneNbr() {
		return daytimePhoneNbr;
	}

	public void setDaytimePhoneNbr(String daytimePhoneNbr) {
		this.daytimePhoneNbr = daytimePhoneNbr;
	}

	public String getHomePhoneNbr() {
		return homePhoneNbr;
	}

	public void setHomePhoneNbr(String homePhoneNbr) {
		this.homePhoneNbr = homePhoneNbr;
	}

	public String getAlternatePhoneNbr() {
		return alternatePhoneNbr;
	}

	public void setAlternatePhoneNbr(String alternatePhoneNbr) {
		this.alternatePhoneNbr = alternatePhoneNbr;
	}

	public String getSendSMSMessage() {
		return sendSMSMessage;
	}

	public void setSendSMSMessage(String sendSMSMessage) {
		this.sendSMSMessage = sendSMSMessage;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSeperatorContact0() {
		return seperatorContact0;
	}

	public void setSeperatorContact0(String seperatorContact0) {
		this.seperatorContact0 = seperatorContact0;
	}

}
