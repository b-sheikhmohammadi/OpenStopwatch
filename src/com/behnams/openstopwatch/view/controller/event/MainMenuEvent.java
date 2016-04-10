package com.behnams.openstopwatch.view.controller.event;

import com.behnams.openstopwatch.view.mainform.AboutForm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MainMenuEvent {
	private static AboutForm aboutForm;
	// Filemenu Event
	public static EventHandler<ActionEvent> menuItemExitClick = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			System.exit(0);
		}
	};
	// Helpmenu Event
	public static EventHandler<ActionEvent> menuItemAboutClick = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			getAboutForm();
		}
	};

	public static AboutForm getAboutForm() {
		if (aboutForm == null) {
			aboutForm = new AboutForm();
		}
		return aboutForm;
	}
	
	public static void setAboutForm(AboutForm aboutForm) {
		MainMenuEvent.aboutForm = aboutForm;
	}

}
