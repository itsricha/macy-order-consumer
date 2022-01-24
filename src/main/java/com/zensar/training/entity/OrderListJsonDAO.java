package com.zensar.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "orderlist_json")
public class OrderListJsonDAO {
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name="message")
	private String messageName;
	
	@Column(name="command")
	private String command;
	
	@Column(name="i_name")
	private String itemName;
	
	@Column(name="i_description")
	private String itemDescription;
	
	@Column(name="i_length")
	private double itemLength;
	
	@Column(name="i_width")
	private double itemWidth;
	
	@Column(name="i_height")
	private double itemHeight;
	
	@Column(name="i_weight")
	private double itemWeight;
	
	@Column(name="image_path")
	private String imagePathname;
	
	@Column(name="rfid_tag")
	private boolean rfidTagged;
	
	@Column(name="storage_attr")
	private int storageAttribute;
	
	@Column(name="pick_type")
	private String pickType;
	
	@Column(name="upclist")
	private String upcList;
	
	@Column(name = "status")
	private String status;
	
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public double getItemLength() {
		return itemLength;
	}
	public void setItemLength(double itemLength) {
		this.itemLength = itemLength;
	}
	public double getItemWidth() {
		return itemWidth;
	}
	public void setItemWidth(double itemWidth) {
		this.itemWidth = itemWidth;
	}
	public double getItemHeight() {
		return itemHeight;
	}
	public void setItemHeight(double itemHeight) {
		this.itemHeight = itemHeight;
	}
	public double getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getImagePathname() {
		return imagePathname;
	}
	public void setImagePathname(String imagePathname) {
		this.imagePathname = imagePathname;
	}
	public boolean isRfidTagged() {
		return rfidTagged;
	}
	public void setRfidTagged(boolean rfidTagged) {
		this.rfidTagged = rfidTagged;
	}
	public int getStorageAttribute() {
		return storageAttribute;
	}
	public void setStorageAttribute(int storageAttribute) {
		this.storageAttribute = storageAttribute;
	}
	public String getPickType() {
		return pickType;
	}
	public void setPickType(String pickType) {
		this.pickType = pickType;
	}
	public String getUpcList() {
		return upcList;
	}
	public void setUpcList(String upcList) {
		this.upcList = upcList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
