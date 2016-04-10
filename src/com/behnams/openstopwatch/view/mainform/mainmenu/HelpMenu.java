package com.behnams.openstopwatch.view.mainform.mainmenu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import com.behnams.openstopwatch.view.controller.event.MainMenuEvent;

public class HelpMenu extends Menu {
	private MenuItem menuItemAbout;

	public HelpMenu() {
		init();
	}

	private void init() {
		super.getItems().add(getMenuItemAbout());
	}

	public MenuItem getMenuItemAbout() {
		if (menuItemAbout == null) {
			menuItemAbout = new MenuItem("About");
			menuItemAbout.setOnAction(MainMenuEvent.menuItemAboutClick);
		}
		return menuItemAbout;
	}

}
