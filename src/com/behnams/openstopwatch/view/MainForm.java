package com.behnams.openstopwatch.view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import com.behnams.openstopwatch.util.Util;
import com.behnams.openstopwatch.view.controller.event.MainFormEvent;
import com.behnams.openstopwatch.view.mainform.Form;
import com.behnams.openstopwatch.view.mainform.MainMenu;

public class MainForm extends Stage {
	private Scene scenes;
	private Group group;
	private MainMenu mainMenu;
	private Form form;
	private Util util;

	public MainForm() {
		init();
	}

	private void init() {
		super.setTitle("open stopwatch");
		super.setScene(getScenes());
		super.setResizable(false);
		super.setOnCloseRequest(MainFormEvent.MainFromCloseClick);
		super.getIcons()
				.add(new Image(
						this.getClass()
								.getResource(
										"/com/behnams/openstopwatch/view/resources/image/icon.png")
								.toString()));
		super.show();
	}

	public Scene getScenes() {
		if (scenes == null) {
			scenes = new Scene(getGroup(), getUtil().getWidthPercentageScreen(
					22f), getUtil().getHeightPercentageScreen(19.3f),
					Color.web("e5e5e5"));
		}
		return scenes;
	}

	public Group getGroup() {
		if (group == null) {
			group = new Group();
			group.getChildren().addAll(getForm(), getMainMenu());
		}
		return group;
	}

	public MainMenu getMainMenu() {
		if (mainMenu == null) {
			mainMenu = new MainMenu();
			mainMenu.setPrefWidth(getUtil().getWidthPercentageScreen(22f));
		}
		return mainMenu;
	}

	public Form getForm() {
		if (form == null) {
			form = new Form();
		}
		return form;
	}

	public Util getUtil() {
		if (util == null) {
			util = new Util();
		}
		return util;
	}
}
