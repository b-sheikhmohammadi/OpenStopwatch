package com.behnams.openstopwatch.view.mainform;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import com.behnams.openstopwatch.util.Util;
import com.behnams.openstopwatch.util.font.FontName;
import com.behnams.openstopwatch.util.font.Fonts;
import com.behnams.openstopwatch.view.controller.event.AboutFormEvent;

public class AboutForm extends Stage {
	private Scene scenes;
	private Group group;
	private AnchorPane anchorPane;
	private ImageView imageViewIcon;
	private Label lblAppName;
	private Label lblVersion;
	private Label lblReleaseDate;
	private Label lblLicense;
	private Label lblDeveloper;
	private Button btnClose;
	private Util util;

	public AboutForm() {
		init();
	}

	private void init() {
		super.setTitle("About");
		super.setScene(getScenes());
		super.setResizable(false);
		super.initModality(Modality.APPLICATION_MODAL);
		super.show();
	}

	public Scene getScenes() {
		if (scenes == null) {
			scenes = new Scene(getGroup(), getUtil().getWidthPercentageScreen(
					25f), getUtil().getHeightPercentageScreen(25f),
					Color.web("e5e5e5"));
		}
		return scenes;
	}

	public Group getGroup() {
		if (group == null) {
			group = new Group(getAnchorPane());
		}
		return group;
	}

	@SuppressWarnings("static-access")
	public AnchorPane getAnchorPane() {
		if (anchorPane == null) {
			anchorPane = new AnchorPane();
			anchorPane.getChildren().addAll(getImageViewIcon(),
					getLblAppName(),getLblVersion(), getLblReleaseDate(),
					getLblLicense(), getLblDeveloper(),getBtnClose());
			

			anchorPane.setLeftAnchor(getImageViewIcon(), getUtil()
					.getWidthPercentageScreen(0.4f).doubleValue());
			anchorPane.setTopAnchor(getImageViewIcon(), getUtil()
					.getHeightPercentageScreen(4.5f).doubleValue());
			
			
			anchorPane.setLeftAnchor(getLblAppName(), getUtil()
					.getWidthPercentageScreen(9.5f).doubleValue());
			anchorPane.setTopAnchor(getLblAppName(), getUtil()
					.getHeightPercentageScreen(1f).doubleValue());

			anchorPane.setLeftAnchor(getLblVersion(), getUtil()
					.getWidthPercentageScreen(9.5f).doubleValue());
			anchorPane.setTopAnchor(getLblVersion(), getUtil()
					.getHeightPercentageScreen(5f).doubleValue());

			anchorPane.setLeftAnchor(getLblReleaseDate(), getUtil()
					.getWidthPercentageScreen(9.5f).doubleValue());
			anchorPane.setTopAnchor(getLblReleaseDate(), getUtil()
					.getHeightPercentageScreen(8f).doubleValue());
			
			anchorPane.setLeftAnchor(getLblLicense(), getUtil()
					.getWidthPercentageScreen(9.5f).doubleValue());
			anchorPane.setTopAnchor(getLblLicense(), getUtil()
					.getHeightPercentageScreen(11f).doubleValue());
			
			anchorPane.setLeftAnchor(getLblDeveloper(), getUtil()
					.getWidthPercentageScreen(9.5f).doubleValue());
			anchorPane.setTopAnchor(getLblDeveloper(), getUtil()
					.getHeightPercentageScreen(14f).doubleValue());
			
			anchorPane.setLeftAnchor(getBtnClose(), getUtil()
					.getWidthPercentageScreen(9.5f).doubleValue());
			anchorPane.setTopAnchor(getBtnClose(), getUtil()
					.getHeightPercentageScreen(20f).doubleValue());
			
			
		}
		return anchorPane;
	}

	public void setAnchorPane(AnchorPane anchorPane) {
		this.anchorPane = anchorPane;
	}
	
	public ImageView getImageViewIcon() {
		if (imageViewIcon == null) {
			imageViewIcon = new ImageView(
					new Image(
							this.getClass()
									.getResource(
											"/com/behnams/openstopwatch/view/resources/image/icon.png")
									.toString()));
			imageViewIcon.setFitWidth(getUtil().getWidthPercentageScreen(8f));
			imageViewIcon.setFitHeight(getUtil().getWidthPercentageScreen(8f));

		}
		return imageViewIcon;
	}

	public Label getLblAppName() {
		if (lblAppName == null) {
			lblAppName = new Label("Open Stopwatch");
			lblAppName.setTextFill(Color.NAVY);
			lblAppName.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_BOLD), getUtil()
					.getWidthPercentageScreen(1.5f)));
		}
		return lblAppName;
	}

	public void setLblAppName(Label lblAppName) {
		this.lblAppName = lblAppName;
	}

	public Label getLblVersion() {
		if (lblVersion == null) {
			lblVersion = new Label("Version : 1 (Beta)");
			lblVersion.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1f)));
		}
		return lblVersion;
	}

	public void setLblVersion(Label lblVersion) {
		this.lblVersion = lblVersion;
	}

	public Label getLblReleaseDate() {
		if (lblReleaseDate == null) {
			lblReleaseDate = new Label("Release Date : 2014 Jan 03");
			lblReleaseDate.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1f)));

		}
		return lblReleaseDate;
	}

	public void setLblReleaseDate(Label lblReleaseDate) {
		this.lblReleaseDate = lblReleaseDate;
	}

	public Label getLblLicense() {
		if (lblLicense == null) {
			lblLicense = new Label("License : GPL3");
			lblLicense.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1f)));

		}
		return lblLicense;
	}

	public void setLblLicense(Label lblLicense) {
		this.lblLicense = lblLicense;
	}

	public Label getLblDeveloper() {
		if (lblDeveloper == null) {
			lblDeveloper = new Label("Developer :\nBehnam Sheikhmohammadi");
			lblDeveloper.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1f)));
		}
		return lblDeveloper;
	}

	public void setLblDeveloper(Label lblDeveloper) {
		this.lblDeveloper = lblDeveloper;
	}

	public Button getBtnClose() {
		if (btnClose == null) {
			btnClose = new Button("Close");
			btnClose.setOnAction(AboutFormEvent.btnCloseAbout);
			btnClose.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1.15f)));
			btnClose.setPrefWidth(getUtil().getWidthPercentageScreen(6.5f));
			btnClose.setPrefHeight(getUtil().getHeightPercentageScreen(3f));
		}
		return btnClose;
	}

	public Util getUtil() {
		if (util == null) {
			util = new Util();
		}
		return util;
	}

}
