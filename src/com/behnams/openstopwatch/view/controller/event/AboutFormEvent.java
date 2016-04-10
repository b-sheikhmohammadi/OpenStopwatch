package com.behnams.openstopwatch.view.controller.event;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AboutFormEvent {
	public static EventHandler<ActionEvent> btnCloseAbout = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			MainMenuEvent.getAboutForm().hide();
			MainMenuEvent.setAboutForm(null);
		}
	};
}
