package com.hibernate.storage;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author aakash.gupta
 *
 */
public class StoreData {
	
	public void storeObject(Session session) {
		Transaction transaction=session.beginTransaction();
		
		StorageDevice strDevice=new StorageDevice();
		strDevice.setCapacity(700);
		strDevice.setFileSystem("NTFS");
		strDevice.setTransferRate(50.0);
		
		USBFlashDrive usb=new USBFlashDrive();
		usb.setCapacity(10);;
		usb.setFileSystem("FAT32");
		usb.setTransferRate(8.50);
		usb.setOperatingSystem("Linux");
		usb.setVersion(2.0f);
		
		CompactDisk cd=new CompactDisk();
		cd.setCapacity(1);
		cd.setFileSystem("FAT");
		cd.setTransferRate(2.30);
		cd.setIs_reWritable(true);
		cd.setMultimediaType("Video");
		
		session.save(strDevice);
		session.save(usb);
		session.save(cd);
		
		transaction.commit();
		System.out.println("Data has been saved");
	}

}
