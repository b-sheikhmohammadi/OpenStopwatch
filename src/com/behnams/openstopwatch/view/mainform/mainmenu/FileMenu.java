package com.behnams.openstopwatch.view.mainform.mainmenu;

import com.behnams.openstopwatch.view.controller.event.MainMenuEvent;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

public class FileMenu extends Menu {

	private MenuItem menuItemExit;

	public FileMenu() {
		init();
	}

	private void init() {
		super.getItems().add(getMenuItemExit());
	}

	public MenuItem getMenuItemExit() {
		if (menuItemExit == null) {
			menuItemExit = new MenuItem("Exit");
			menuItemExit.setOnAction(MainMenuEvent.menuItemExitClick);
			menuItemExit.setAccelerator(new KeyCodeCombination(KeyCode.F4 ,KeyCombination.ALT_DOWN));
		}
		return menuItemExit;
	}
}
