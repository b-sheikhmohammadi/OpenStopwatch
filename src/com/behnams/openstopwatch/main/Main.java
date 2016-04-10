package com.behnams.openstopwatch.main;

import javafx.application.Application;
import javafx.stage.Stage;

import com.behnams.openstopwatch.view.controller.MainController;

public class Main extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		MainController.getMainForm();
	}
}
