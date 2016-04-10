package com.behnams.openstopwatch.view.controller;

import com.behnams.openstopwatch.view.MainForm;

public class MainController {
	private static MainForm mainForm;

	public static MainForm getMainForm() {
		if (mainForm == null) {
			mainForm = new MainForm();
			mainForm.getForm().getBtnStart().requestFocus();
		}
		return mainForm;
	}
}
