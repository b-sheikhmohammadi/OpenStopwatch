package com.behnams.openstopwatch.view.mainform;

import com.behnams.openstopwatch.view.mainform.mainmenu.FileMenu;
import com.behnams.openstopwatch.view.mainform.mainmenu.HelpMenu;

import javafx.scene.control.MenuBar;

public class MainMenu extends MenuBar {
	private FileMenu fileMenu;
	private HelpMenu helpMenu;

	public MainMenu() {
		init();
	}

	private void init() {
		super.getMenus().addAll(getFileMenu(),getHelpMenu());
	}

	public FileMenu getFileMenu() {
		if (fileMenu == null) {
			fileMenu = new FileMenu();
			fileMenu.setText("_File");
			fileMenu.setMnemonicParsing(true);
		}
		return fileMenu;
	}

	public HelpMenu getHelpMenu() {
		if (helpMenu == null) {
			helpMenu = new HelpMenu();
			helpMenu.setText("_Help");
			helpMenu.setMnemonicParsing(true);
		}
		return helpMenu;
	}

}
