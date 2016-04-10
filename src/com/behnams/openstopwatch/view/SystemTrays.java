package com.behnams.openstopwatch.view;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

import javafx.application.Platform;

import com.behnams.openstopwatch.view.controller.MainController;
import com.behnams.openstopwatch.view.controller.event.SystemTraysEvent;
import com.behnams.openstopwatch.view.systemtrays.SyatemTrayPopupMenu;

public class SystemTrays {
	private static SystemTray systemTray;
	private static TrayIcon trayIcon;
	private static SyatemTrayPopupMenu popupMenu;

	public static void showApp() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				MainController.getMainForm().show();
				getSystemTray().remove(getTrayIcon());
				setSystemTray(null);
			}
		});
	}

	@SuppressWarnings("static-access")
	public static void hideApp() {
		if (getSystemTray().isSupported()) {
			try {
				getSystemTray().add(getTrayIcon());
			} catch (AWTException e) {
				e.printStackTrace();
			}
			Platform.setImplicitExit(false);
			MainController.getMainForm().hide();
		}
	}

	private static SystemTray getSystemTray() {
		if (systemTray == null) {
			systemTray = SystemTray.getSystemTray();
		}
		return systemTray;
	}

	private static void setSystemTray(SystemTray systemTray) {
		SystemTrays.systemTray = systemTray;
	}

	private static TrayIcon getTrayIcon() {
		if (trayIcon == null) {
			trayIcon = new TrayIcon(getTrayIconImage());
			trayIcon.setImageAutoSize(true);
			trayIcon.setToolTip("open stopwatch");
			trayIcon.addMouseListener(SystemTraysEvent.systemTrayIconClick);
			trayIcon.setPopupMenu(getPopupMenu());
		}
		return trayIcon;
	}

	public static SyatemTrayPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new SyatemTrayPopupMenu();
		}
		return popupMenu;
	}

	private static Image getTrayIconImage() {
		return Toolkit
				.getDefaultToolkit()
				.getImage(
						SystemTrays.class
								.getResource("/com/behnams/openstopwatch/view/resources/image/systemTrayIcon.png"));
	}

}
