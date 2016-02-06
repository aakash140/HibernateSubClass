package com.hibernate.storage;

/**
 * 
 * @author aakash.gupta
 *
 */
public class CompactDisk extends StorageDevice {

	private boolean is_reWritable;
	private String multimediaType;
	public boolean getIs_reWritable() {
		return is_reWritable;
	}
	public void setIs_reWritable(boolean is_reWritable) {
		this.is_reWritable = is_reWritable;
	}
	public String getMultimediaType() {
		return multimediaType;
	}
	public void setMultimediaType(String multimediaType) {
		this.multimediaType = multimediaType;
	}
}