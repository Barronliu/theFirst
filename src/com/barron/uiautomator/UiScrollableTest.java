package com.barron.uiautomator;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class UiScrollableTest extends UiAutomatorTestCase {

	public static void main(String[] args) throws UiObjectNotFoundException {
		testDemo01();
		// TODO Auto-generated method stub

	}
	
	public static void testDemo01() throws UiObjectNotFoundException {
		UiScrollable scroll = new UiScrollable(new UiSelector().className("android.widget.ListView"));
		double swipedead = scroll.getSwipeDeadZonePercentage();
		System.out.println(swipedead); 
	}
	
	public static void testDemo02() throws UiObjectNotFoundException {
		UiScrollable scroll = new UiScrollable(new UiSelector().className("android.widget.ListView"));
		scroll.flingBackward();
	}

}
