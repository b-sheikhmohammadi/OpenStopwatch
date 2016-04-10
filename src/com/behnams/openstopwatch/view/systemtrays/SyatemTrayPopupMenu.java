package com.behnams.openstopwatch.view.systemtrays;

import java.awt.MenuItem;
import java.awt.PopupMenu;

import com.behnams.openstopwatch.view.controller.event.SystemTraysEvent;

public class SyatemTrayPopupMenu extends PopupMenu {
	private static final long serialVersionUID = 1L;

	private MenuItem menuItemShow;
	private MenuItem menuItemExit;

	public SyatemTrayPopupMenu() {
		init();
	}

	private void init() {
		super.add(getMenuItemShow());
		super.addSeparator();
		super.add(getMenuItemExit());
	}

	public MenuItem getMenuItemShow() {
		if (menuItemShow == null) {
			menuItemShow = new MenuItem("Show");
			menuItemShow.addActionListener(SystemTraysEvent.menuItemShow);
		}
		return menuItemShow;
	}

	public MenuItem getMenuItemExit() {
		if (menuItemExit == null) {
			menuItemExit = new MenuItem();
			menuItemExit.setLabel("Exit");
			menuItemExit.addActionListener(SystemTraysEvent.menuItemClose);
		}
		return menuItemExit;
	}
}
