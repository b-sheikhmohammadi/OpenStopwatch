package com.behnams.openstopwatch.view.mainform;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

import com.behnams.openstopwatch.util.Util;
import com.behnams.openstopwatch.util.font.FontName;
import com.behnams.openstopwatch.util.font.Fonts;
import com.behnams.openstopwatch.view.controller.event.MainFormEvent;

public class Form extends AnchorPane {

	private AnchorPane anchorPaneTime;
	private Label lblHour;
	private Label lblMinute;
	private Label lblSecond;
	private Label lblHundredthsOfSeconds;

	private ToolBar toolBar;
	private AnchorPane anchorPaneButton;
	private Button btnStart;
	private Button btnStop;
	private Button btnRestart;
	private Button btnReset;
	private Button btnHide;

	private Util util;

	public Form() {
		init();
	}

	private void init() {
		super.getChildren().addAll(getAnchorPaneTime(), getToolBar());

		super.setLeftAnchor(getAnchorPaneTime(), getUtil()
				.getHeightPercentageScreen(5f).doubleValue());
		super.setTopAnchor(getAnchorPaneTime(), getUtil()
				.getHeightPercentageScreen(4.3f).doubleValue());

		super.setTopAnchor(getToolBar(),
				getUtil().getHeightPercentageScreen(12.9f).doubleValue());
	}

	@SuppressWarnings("static-access")
	public AnchorPane getAnchorPaneTime() {
		if (anchorPaneTime == null) {
			anchorPaneTime = new AnchorPane();
			anchorPaneTime.getChildren().addAll(getLblHour(), getLblMinute(),
					getLblSecond(), getLblHundredthsOfSeconds());

			anchorPaneTime.setLeftAnchor(getLblHour(), getUtil()
					.getWidthPercentageScreen(0.5f).doubleValue());

			anchorPaneTime.setLeftAnchor(getLblMinute(), getUtil()
					.getWidthPercentageScreen(4.5f).doubleValue());

			anchorPaneTime.setLeftAnchor(getLblSecond(), getUtil()
					.getWidthPercentageScreen(8.5f).doubleValue());

			anchorPaneTime.setLeftAnchor(getLblHundredthsOfSeconds(), getUtil()
					.getWidthPercentageScreen(12.5f).doubleValue());

		}
		return anchorPaneTime;
	}

	public Label getLblHour() {
		if (lblHour == null) {
			lblHour = new Label("00");
			lblHour.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(2.5f)));
			lblHour.getStylesheets()
					.add(this
							.getClass()
							.getResource(
									"/com/behnams/openstopwatch/view/resources/css/style.css")
							.toString());
			lblHour.getStyleClass().add("form-lbltime");
		}
		return lblHour;
	}

	public void setLblHour(Label lblHour) {
		this.lblHour = lblHour;
	}

	public Label getLblMinute() {
		if (lblMinute == null) {
			lblMinute = new Label("00");
			lblMinute.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(2.5f)));
			lblMinute
					.getStylesheets()
					.add(this
							.getClass()
							.getResource(
									"/com/behnams/openstopwatch/view/resources/css/style.css")
							.toString());
			lblMinute.getStyleClass().add("form-lbltime");
		}
		return lblMinute;
	}

	public void setLblMinute(Label lblMinute) {
		this.lblMinute = lblMinute;
	}

	public Label getLblSecond() {
		if (lblSecond == null) {
			lblSecond = new Label("00");
			lblSecond.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(2.5f)));
			lblSecond
					.getStylesheets()
					.add(this
							.getClass()
							.getResource(
									"/com/behnams/openstopwatch/view/resources/css/style.css")
							.toString());
			lblSecond.getStyleClass().add("form-lbltime");
		}
		return lblSecond;
	}

	public void setSecond(Label second) {
		this.lblSecond = second;
	}

	public Label getLblHundredthsOfSeconds() {
		if (lblHundredthsOfSeconds == null) {
			lblHundredthsOfSeconds = new Label("00");
			lblHundredthsOfSeconds.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(2.5f)));
			lblHundredthsOfSeconds
					.getStylesheets()
					.add(this
							.getClass()
							.getResource(
									"/com/behnams/openstopwatch/view/resources/css/style.css")
							.toString());
			lblHundredthsOfSeconds.getStyleClass().add("form-lbltime");
		}
		return lblHundredthsOfSeconds;
	}

	public void setLblHundredthsOfSeconds(Label lblHundredthsOfSeconds) {
		this.lblHundredthsOfSeconds = lblHundredthsOfSeconds;
	}

	public ToolBar getToolBar() {
		if (toolBar == null) {
			toolBar = new ToolBar();
			toolBar.getItems().add(getAnchorPaneButton());
			toolBar.setPrefSize(getUtil().getWidthPercentageScreen(22f),
					getUtil().getHeightPercentageScreen(6.5f));
		}
		return toolBar;
	}

	@SuppressWarnings("static-access")
	public AnchorPane getAnchorPaneButton() {
		if (anchorPaneButton == null) {
			anchorPaneButton = new AnchorPane();
			anchorPaneButton.getChildren().add(getBtnStart());
			anchorPaneButton.setLeftAnchor(getBtnStart(), getUtil()
					.getWidthPercentageScreen(2.8f).doubleValue());
			anchorPaneButton.setTopAnchor(getBtnStart(), getUtil()
					.getWidthPercentageScreen(0.2f).doubleValue());

		}
		return anchorPaneButton;
	}

	public Button getBtnStart() {
		if (btnStart == null) {
			btnStart = new Button("Start");
			btnStart.setOnAction(MainFormEvent.btnStartClick);
			btnStart.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1.5f)));
			btnStart.setPrefSize(getUtil().getWidthPercentageScreen(15.0f)
					.doubleValue(), getUtil().getHeightPercentageScreen(2.5f)
					.doubleValue());

	
			btnStart.getStylesheets()
					.add(this
							.getClass()
							.getResource(
									"/com/behnams/openstopwatch/view/resources/css/style.css")
							.toString());
			btnStart.getStyleClass().add("form-btnStart");
		}
		return btnStart;
	}

	public void setBtnStart(Button btnStart) {
		this.btnStart = btnStart;
	}

	public Button getBtnStop() {
		if (btnStop == null) {
			btnStop = new Button("Stop");
			btnStop.setOnAction(MainFormEvent.btnStopClick);
			btnStop.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1.2f)));
			btnStop.setPrefSize(getUtil().getWidthPercentageScreen(7.0f)
					.doubleValue(), getUtil().getHeightPercentageScreen(2.5f)
					.doubleValue());
		}
		return btnStop;
	}

	public void setBtnStop(Button btnStop) {
		this.btnStop = btnStop;
	}

	public Button getBtnRestart() {
		if (btnRestart == null) {
			btnRestart = new Button("Restart");
			btnRestart.setOnAction(MainFormEvent.btnRestart);
			btnRestart.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1.2f)));
			btnRestart.setPrefSize(getUtil().getWidthPercentageScreen(6.5f)
					.doubleValue(), getUtil().getHeightPercentageScreen(2.5f)
					.doubleValue());
		}
		return btnRestart;
	}

	public void setBtnRestat(Button btnRestat) {
		this.btnRestart = btnRestat;
	}

	public Button getBtnReset() {
		if (btnReset == null) {
			btnReset = new Button("Reset");
			btnReset.setOnAction(MainFormEvent.btnReset);
			btnReset.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1.2f)));
			btnReset.setPrefSize(getUtil().getWidthPercentageScreen(6.5f)
					.doubleValue(), getUtil().getHeightPercentageScreen(2.5f)
					.doubleValue());

		}
		return btnReset;
	}

	public void setBtnReset(Button btnReset) {
		this.btnReset = btnReset;
	}

	public Button getBtnHide() {
		if (btnHide == null) {
			btnHide = new Button("Hide");
			btnHide.setOnAction(MainFormEvent.btnHide);
			btnHide.setFont(Font.loadFont(Fonts
					.getFont(FontName.OPEN_SANS_REGULAR), getUtil()
					.getWidthPercentageScreen(1.2f)));
			btnHide.setPrefSize(getUtil().getWidthPercentageScreen(7.0f)
					.doubleValue(), getUtil().getHeightPercentageScreen(2.5f)
					.doubleValue());
		}
		return btnHide;
	}

	public void setBtnHide(Button btnHide) {
		this.btnHide = btnHide;
	}

	public void setLblSecond(Label lblSecond) {
		this.lblSecond = lblSecond;
	}

	public Util getUtil() {
		if (util == null) {
			util = new Util();
		}
		return util;
	}

}
