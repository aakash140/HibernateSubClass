package com.hibernate.storage;

/**
 * 
 * @author aakash.gupta
 *
 */
public class StorageDevice {
	
	private int id; 		//Hibernate ID
	
	private int capacity;
	private double transferRate;
	private String fileSystem;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getTransferRate() {
		return transferRate;
	}
	public void setTransferRate(double transferRate) {
		this.transferRate = transferRate;
	}
	public String getFileSystem() {
		return fileSystem;
	}
	public void setFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
	}
}