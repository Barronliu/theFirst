package com.barron.uiautomator;

import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;

public class UiSelectorTest extends UiAutomatorTestCase{
	
	public void testText01() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().text("联系人");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testText02() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().textContains("提醒");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testText03() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().textStartsWith("通知");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testDescription01() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().description("更多选项");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testDescription02() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().descriptionContains("更多选项");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testDescription03() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().descriptionStartsWith("更");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testClassName() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().className("android.widget.ImageButton");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testPackageName() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().packageName("com.mediatek.backuprestore");
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testIndex() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().packageName("com.mediatek.backuprestore").index(1);
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testInstance() throws UiObjectNotFoundException{
		UiSelector se = new UiSelector().className("android.app.ActionBar$Tab").instance(0);
		UiObject ob = new UiObject(se);
		ob.click();
	}
	public void testChildSelector() throws UiObjectNotFoundException{
		UiSelector parent = new UiSelector().resourceId("com.android.settings:id/category_content");
		UiSelector target = new UiSelector().className("android.widget.FrameLayout").index(0);
		UiSelector se = parent.childSelector(target);
		UiObject ob = new UiObject(se);
		ob .click();
	}
	public void testFromParent() throws UiObjectNotFoundException{
		UiSelector brother = new UiSelector().resourceId("com.android.settings:id/category_content").childSelector(new UiSelector().className("android.widget.FrameLayout").index(0));
		UiSelector target = new UiSelector().className("android.widget.FrameLayout").index(1);
		UiSelector se = brother.fromParent(target);
		UiObject ob = new UiObject(se);
		ob .click();
	}
}
