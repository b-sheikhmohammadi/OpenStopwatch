package com.behnams.openstopwatch.util;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Util {
	private static Dimension dimension;

	public Float getWidthPercentageScreen(Float percent) {
		return (getDimension().width * percent) / 100;
	}

	public Float getHeightPercentageScreen(Float percent) {
		return (getDimension().height * percent) / 100;
	}

	private static Dimension getDimension() {
		if (dimension == null) {
			dimension = Toolkit.getDefaultToolkit().getScreenSize();
		}
		return dimension;
	}
}
