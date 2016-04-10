package com.behnams.openstopwatch.util.font;

import java.util.HashMap;
import java.util.Map;

public class Fonts {
	public static String getFont(FontName FontName) {
	    	Map<String, String> map = new HashMap<>();
	    	map.put("OPEN_SANS_REGULAR" ,Fonts.class.getResource("/com/behnams/openstopwatch/view/resources/font/OpenSans-Regular.ttf").toString());
	    	map.put("OPEN_SANS_BOLD", Fonts.class.getResource("/com/behnams/openstopwatch/view/resources/font/OpenSans-Bold.ttf").toString());
	    	return map.get(FontName.name());
	}
}
