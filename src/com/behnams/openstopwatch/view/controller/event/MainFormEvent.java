package com.behnams.openstopwatch.view.controller.event;

import java.util.Timer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

import com.behnams.openstopwatch.util.Stopwatch;
import com.behnams.openstopwatch.util.Util;
import com.behnams.openstopwatch.view.SystemTrays;
import com.behnams.openstopwatch.view.controller.MainController;

public class MainFormEvent {
	private static Util util;
	private static Timer timer;
	private static Stopwatch stopwatch;
	private static Integer second = 0;
	private static Integer minute = 0;
	private static Integer hour = 0;

	public static EventHandler<WindowEvent> MainFromCloseClick = new EventHandler<WindowEvent>() {
		@Override
		public void handle(WindowEvent arg0) {
			getTimer().cancel();
			//
			System.exit(0);
		}
	};

	public static EventHandler<ActionEvent> btnStartClick = new EventHandler<ActionEvent>() {
		@SuppressWarnings("static-access")
		@Override
		public void handle(ActionEvent arg0) {
			// Start Timer

			getTimer().schedule(getStopwatch().start(), 0, 1000);

			// Hide btnStart
			MainController.getMainForm().getForm().getBtnStart()
					.setVisible(false);
			MainController.getMainForm().getForm().setBtnStart(null);

			// Show btnStop , btnHide
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.getChildren()
					.addAll(MainController.getMainForm().getForm().getBtnStop(),
							MainController.getMainForm().getForm().getBtnHide());

			// set Location btnStop
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setLeftAnchor(
							MainController.getMainForm().getForm().getBtnStop(),
							getUtil().getWidthPercentageScreen(2.5f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setTopAnchor(
							MainController.getMainForm().getForm().getBtnStop(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());

			// set Location btnHide
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setLeftAnchor(
							MainController.getMainForm().getForm().getBtnHide(),
							getUtil().getWidthPercentageScreen(11f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setTopAnchor(
							MainController.getMainForm().getForm().getBtnHide(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());
		}
	};
	public static EventHandler<ActionEvent> btnStopClick = new EventHandler<ActionEvent>() {
		@SuppressWarnings("static-access")
		@Override
		public void handle(ActionEvent arg0) {

			// stop Timer
			getTimer().cancel();
			second = getStopwatch().getSecond();
			minute = getStopwatch().getMinute();
			hour = getStopwatch().getHour();

			// hide btnStop , btnHide
			MainController.getMainForm().getForm().getBtnStop()
					.setVisible(false);
			MainController.getMainForm().getForm().getBtnHide()
					.setVisible(false);

			MainController.getMainForm().getForm().setBtnStop(null);
			MainController.getMainForm().getForm().setBtnHide(null);
			// show btnRestar , btnReset , bntHide
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.getChildren()
					.addAll(MainController.getMainForm().getForm()
							.getBtnRestart(),
							MainController.getMainForm().getForm()
									.getBtnReset(),
							MainController.getMainForm().getForm().getBtnHide());

			// set location btnRestart
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setLeftAnchor(
							MainController.getMainForm().getForm()
									.getBtnRestart(),
							getUtil().getWidthPercentageScreen(-0.4f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setTopAnchor(
							MainController.getMainForm().getForm()
									.getBtnRestart(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());

			// set location btnReset
			MainController
					.getMainForm()
					.getForm()
					.setLeftAnchor(
							MainController.getMainForm().getForm()
									.getBtnReset(),
							getUtil().getWidthPercentageScreen(6.85f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.setTopAnchor(
							MainController.getMainForm().getForm()
									.getBtnReset(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());
			// set location & resize btnHide
			MainController.getMainForm().getForm().getBtnHide()
					.setPrefWidth(getUtil().getWidthPercentageScreen(6.5f));

			MainController
					.getMainForm()
					.getForm()
					.setLeftAnchor(
							MainController.getMainForm().getForm().getBtnHide(),
							getUtil().getWidthPercentageScreen(14.1f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.setTopAnchor(
							MainController.getMainForm().getForm().getBtnHide(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());

		}
	};

	public static EventHandler<ActionEvent> btnRestart = new EventHandler<ActionEvent>() {
		@SuppressWarnings("static-access")
		@Override
		public void handle(ActionEvent arg0) {
			// Restart Timer
			setTimer(null);
			setStopwatch(null);
			getStopwatch().setSecond(second);
			getStopwatch().setMinute(minute);
			getStopwatch().setHour(hour);
			getTimer().schedule(getStopwatch().start(), 0, 1000);

			// hide btnRestart,btnRest,btnHide
			MainController.getMainForm().getForm().getBtnRestart()
					.setVisible(false);
			MainController.getMainForm().getForm().getBtnReset()
					.setVisible(false);
			MainController.getMainForm().getForm().getBtnHide()
					.setVisible(false);

			MainController.getMainForm().getForm().setBtnRestat(null);
			MainController.getMainForm().getForm().setBtnReset(null);
			MainController.getMainForm().getForm().setBtnHide(null);

			// Show btnStop , btnHide
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.getChildren()
					.addAll(MainController.getMainForm().getForm().getBtnStop(),
							MainController.getMainForm().getForm().getBtnHide());

			// set Location btnStop
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setLeftAnchor(
							MainController.getMainForm().getForm().getBtnStop(),
							getUtil().getWidthPercentageScreen(2.5f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setTopAnchor(
							MainController.getMainForm().getForm().getBtnStop(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());

			// set Location btnHide
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setLeftAnchor(
							MainController.getMainForm().getForm().getBtnHide(),
							getUtil().getWidthPercentageScreen(11f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setTopAnchor(
							MainController.getMainForm().getForm().getBtnHide(),
							getUtil().getHeightPercentageScreen(0.5f)
									.doubleValue());

		}
	};

	public static EventHandler<ActionEvent> btnReset = new EventHandler<ActionEvent>() {
		@SuppressWarnings("static-access")
		@Override
		public void handle(ActionEvent arg0) {
			// reset Timer
			setTimer(null);
			setStopwatch(null);
			MainController.getMainForm().getForm().getLblSecond().setText("00");
			MainController.getMainForm().getForm().getLblMinute().setText("00");
			MainController.getMainForm().getForm().getLblHour().setText("00");

			// hide btnRestart,btnRest,btnHide
			MainController.getMainForm().getForm().getBtnRestart()
					.setVisible(false);
			MainController.getMainForm().getForm().getBtnReset()
					.setVisible(false);
			MainController.getMainForm().getForm().getBtnHide()
					.setVisible(false);

			MainController.getMainForm().getForm().setBtnRestat(null);
			MainController.getMainForm().getForm().setBtnReset(null);
			MainController.getMainForm().getForm().setBtnHide(null);

			// Show btnStart
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.getChildren()
					.addAll(MainController.getMainForm().getForm()
							.getBtnStart());

			// set Location btnHide
			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setLeftAnchor(
							MainController.getMainForm().getForm()
									.getBtnStart(),
							getUtil().getWidthPercentageScreen(2.8f)
									.doubleValue());

			MainController
					.getMainForm()
					.getForm()
					.getAnchorPaneButton()
					.setTopAnchor(
							MainController.getMainForm().getForm()
									.getBtnStart(),
							getUtil().getHeightPercentageScreen(0.2f)
									.doubleValue());
		}
	};

	public static EventHandler<ActionEvent> btnHide = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {
			SystemTrays.hideApp();
		}
	};

	public static Util getUtil() {
		if (util == null) {
			util = new Util();
		}
		return util;
	}

	public static Timer getTimer() {
		if (timer == null) {
			timer = new Timer();
		}
		return timer;
	}

	public static void setTimer(Timer timer) {
		MainFormEvent.timer = timer;
	}

	public static Stopwatch getStopwatch() {
		if (stopwatch == null) {
			stopwatch = new Stopwatch();
		}
		return stopwatch;
	}

	public static void setStopwatch(Stopwatch stopwatch) {
		MainFormEvent.stopwatch = stopwatch;
	}
}
