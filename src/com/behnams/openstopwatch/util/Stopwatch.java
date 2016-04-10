package com.behnams.openstopwatch.util;

import java.util.TimerTask;

import javafx.application.Platform;

import com.behnams.openstopwatch.view.controller.MainController;

public class Stopwatch {
	private TimerTask timerTask;
	private Integer second = 0;
	private Integer minute = 0;
	private Integer hour = 0;

	public TimerTask start() {
		if (timerTask == null) {
			timerTask = new TimerTask() {
				@Override
				public void run() {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							second++;
							MainController.getMainForm().getForm()
									.getLblSecond()
									.setText(String.format("%02d", second));
							if (second == 60) {
								second = 0;
								MainController.getMainForm().getForm()
										.getLblSecond()
										.setText(String.format("%02d", second));
								minute++;
								MainController.getMainForm().getForm()
										.getLblMinute()
										.setText(String.format("%02d", minute));
								if (minute == 60) {
									minute = 0;
									MainController.getMainForm().getForm()
											.getLblMinute()
											.setText(String.format("%02d", minute));
									hour++;
									MainController.getMainForm().getForm()
											.getLblHour()
											.setText(String.format("%02d", hour));
								}
							}
						}
					});
				}
			};
		}
		return timerTask;
	}

	public Integer getSecond() {
		return second;
	}

	public void setSecond(Integer second) {
		this.second = second;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}


	
	
}
