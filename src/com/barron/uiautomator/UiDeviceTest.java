package com.barron.uiautomator;

import java.io.File;

import android.graphics.Point;
import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UiDeviceTest extends UiAutomatorTestCase{
	public void testPressBack(){
		UiDevice.getInstance().pressBack();
	}
	public void testPressKeyCode(){
		UiDevice.getInstance().pressKeyCode(8);
		UiDevice.getInstance().pressKeyCode(7);
		UiDevice.getInstance().pressKeyCode(7);
		UiDevice.getInstance().pressKeyCode(15);
		UiDevice.getInstance().pressKeyCode(13);
	}
	public void testGetDisplayH(){
		int H = UiDevice.getInstance().getDisplayHeight();
		System.out.println(H);
	}
	public void testGetDisplaySize(){
		UiDevice.getInstance().getDisplaySizeDp();
		System.out.println(UiDevice.getInstance().getDisplaySizeDp());
	}
	public void testDrag(){
		UiDevice.getInstance().drag(200, 160, 400, 500, 200);
	}
	public void testSwipe() throws RemoteException{
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		Point p5 = new Point();
		
		p1.x = 154;p1.y = 573;
		p2.x = 360;p2.y = 573;
		p3.x = 563;p3.y = 573;
		p4.x = 563;p4.y = 777;
		p5.x = 563;p5.y = 978;
		
		Point[] p = {p1,p2,p3,p4,p5};
		
		if (UiDevice.getInstance().isScreenOn()){
			UiDevice.getInstance().sleep();	
		}
		sleep(1000);
		UiDevice.getInstance().wakeUp();
		sleep(1000);
		UiDevice.getInstance().swipe(100,300,500,300,50);
		sleep(1000);
		UiDevice.getInstance().swipe(p,100);
	
	}
	public void testSwipe2(){
		UiDevice.getInstance().swipe(100,300,500,300,50);
	}
	public void testScreenShot(){
		File filePath = new File("/data/local/tmp/");
		UiDevice.getInstance().takeScreenshot(filePath);
	}
	public void testScreenShot2(){
		File filePath = new File("/data/local/tmp/");
		UiDevice.getInstance().takeScreenshot(filePath,0.9f,95);
	}
	public void testGetPackageName(){
		String packageName = UiDevice.getInstance().getCurrentPackageName();
		System.out.println("packageName is : " + packageName);
	}
	public void testOpenNotification(){
		UiDevice.getInstance().openNotification();
	}
	public void testOpenQuickSetting(){
		UiDevice.getInstance().openQuickSettings();
	}
	public void testDumpHierarchy(){
		String fileName = "Hierarchy";
		UiDevice.getInstance().dumpWindowHierarchy(fileName);
	}
	public void testWaitforUpdate(){
		String packageName = UiDevice.getInstance().getCurrentPackageName();
		boolean isUpdate = UiDevice.getInstance().waitForWindowUpdate(packageName,15000L);
		if (isUpdate){
			System.out.println("Window is update!");
		}
		else System.out.println("Window has not update yet!");
	}
	public void testScreenOffAndOn() throws RemoteException{
		boolean isOn = UiDevice.getInstance().isScreenOn();
		if (isOn){
			UiDevice.getInstance().sleep();
			isOn = UiDevice.getInstance().isScreenOn();
			System.out.println(isOn);
		}
		else {
			UiDevice.getInstance().wakeUp();
			isOn = UiDevice.getInstance().isScreenOn();
			System.out.println(isOn);
		}
	}

}
