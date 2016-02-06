package com.hibernate.storage;

/**
 * 
 * @author aakash.gupta
 *
 */
public class USBFlashDrive extends StorageDevice {

	private float version;
	private String operatingSystem;
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}