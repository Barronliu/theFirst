package com.barron.uiautomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiWatcher;

public class UiWatcherTest {
	public void watcherIncomingCall() throws UiObjectNotFoundException {
		String watcherName = "callComing";
		UiWatcher watcher = new UiWatcher() {
			UiSelector se1 = new UiSelector().text("com.android.deskclock:id/alarm");
			UiSelector se2 = new UiSelector().text("com.android.deskclock:id/dismiss");
			UiObject ob1 = new UiObject(se1);
			UiObject ob2 = new UiObject(se2);

			@Override
			public boolean checkForCondition() {
				if (ob1.exists()){
					try {
						ob1.dragTo(ob2, 10);
					} catch (UiObjectNotFoundException e) {
						e.printStackTrace();
					}
					System.out.println("闹钟监视已触发！");
					return true;
				}
				return false;
			}
		};
		UiDevice.getInstance().registerWatcher(watcherName,watcher);
	}
}
