package com.barron.uiautomator;

import android.graphics.Rect;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class UiObjectTest extends UiAutomatorTestCase{
	public void testClickAndWaitForNewWindow() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().text("Multi-gesture settings");
		UiObject ob = new UiObject(se);
		ob.clickAndWaitForNewWindow(5);
	}
	public void testClickBottomRight() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.lewaos.launcher:id/widget_time");
		UiObject ob = new UiObject(se);
		ob.clickBottomRight();
	}
	public void testDragToObject() throws UiObjectNotFoundException{
		UiSelector se1 = new UiSelector().text("Camera");
		UiSelector se2 = new UiSelector().text("Gallery");
		UiObject ob1 = new UiObject(se1);
		UiObject ob2 = new UiObject(se2);
		ob1.dragTo(ob2, 50);
	}
	public void testDragToCoordinate() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().text("Settings");
		UiObject ob = new UiObject(se);
		ob.dragTo(620,670, 50);
	}
	public void testSwipeRight() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.lewa.player:id/player_status");
		UiObject ob = new UiObject(se);
		ob.swipeRight(50);
	}
	public void testSwipeLeft() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.lewa.player:id/player_status");
		UiObject ob = new UiObject(se);
		ob.swipeLeft(50);
	}
	public void testSwipeDown() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().text("Messaging");
		UiObject ob = new UiObject(se);
		ob.swipeDown(5);
	}
	public void testSwipeUp() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().text("Messaging");
		UiObject ob = new UiObject(se);
		ob.swipeUp(5);
	}
	public void testSetText() throws UiObjectNotFoundException{
		String content = "Ha Ha Ha!";
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/embedded_text_editor");
		UiObject ob = new UiObject(se);
		ob.setText(content);
	}
	public void testClearTextField() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/embedded_text_editor");
		UiObject ob = new UiObject(se);
		ob.clearTextField();
	}
	public void testGetBounds() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/embedded_text_editor");
		UiObject ob = new UiObject(se);
		Rect rec = ob.getBounds();
		int CenterX = rec.centerX();
		int CenterY = rec.centerY();
		System.out.println("Bounds : " + rec);
		System.out.println("CenterX : " + CenterX);
		System.out.println("CenterY : " + CenterY);
	}
	public void testGetClassName() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/embedded_text_editor");
		UiObject ob = new UiObject(se);
		String className = ob.getClassName();
		System.out.println(className);
	}
	public void testGetPackageName() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/embedded_text_editor");
		UiObject ob = new UiObject(se);
		String packageName = ob.getPackageName();
		System.out.println(packageName);
	}
	public void testGetDescription() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/send_button_sms");
		UiObject ob = new UiObject(se);
		String description = ob.getContentDescription();
		System.out.println(description);
	}
	public void testGetText() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/embedded_text_editor");
		UiObject ob = new UiObject(se);
		String contentText = ob.getText();
		System.out.println(contentText);
	}
	public void testGetChildCount() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().resourceId("com.android.mms:id/button_with_counter");
		UiObject ob = new UiObject(se);
		int childCount = ob.getChildCount();
		System.out.println("childCount : " + childCount);
	}
	public void testGetChild() throws UiObjectNotFoundException{
		UiObject ob = new UiObject(new UiSelector().resourceId("com.android.settings:id/category_content"));
		int count = ob.getChildCount();
		for (int i=0;i<count;i++){
			System.out.println("i : " + i);
			UiObject child = ob.getChild(new UiSelector().clickable(true).instance(i));
			child.clickAndWaitForNewWindow();
			UiDevice.getInstance().pressBack();
		}
	}
	public void testGetFromParent() throws UiObjectNotFoundException{
		UiObject ob = new UiObject(new UiSelector().text(""));
		UiObject brother = ob.getFromParent(new UiSelector().clickable(true).instance(1));
		brother.clickAndWaitForNewWindow();
	}

}
