package at.runaway.splinedemo.utils;

import java.awt.Color;
import java.text.DecimalFormat;

public class CommonConstants {

	// --------------------------------------------------------------------------
	// S T A T I C - V a r i a b l e s
	// --------------------------------------------------------------------------
	
	public static final int MAX_POINTS = 25;

	public static final int BASIS_START_X = 20;
	
	public static final int BASIS_START_Y = 30;
	
	public static final int BASIS_LENGTH_X = 300;
	
	public static final int BASIS_LENGTH_Y = 150;
	
 	public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0.0");
 	
 	public static final DecimalFormat KNOT_FORMAT = new DecimalFormat("#0.00");
 	
	public static final Color COLOR_CURVES = Color.BLUE;

 	public static final Color COLOR_BASIS_BACKGROUND = new Color(250, 250, 255);
 	
 	public static final Color COLOR_BASIS_BOX = new Color(210, 210, 210);

	public static final Color COLOR_HELPER_LINE = Color.RED;

	public static final Color BACKGROUND_COLOR = Color.WHITE;
}
