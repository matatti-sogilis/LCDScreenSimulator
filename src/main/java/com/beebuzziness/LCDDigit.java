package com.beebuzziness;

import java.util.HashMap;
import java.util.Map;

public class LCDDigit {

	private static final String[] DIGIT_0 = new String[] { " _ ", "| |", "|_|" };
	private static final String[] DIGIT_1 = new String[] { "   ", "  |", "  |" };
	private static final String[] DIGIT_2 = new String[] { " _ ", " _|", "|_ " };
	private static final String[] DIGIT_3 = new String[] { " _ ", " _|", " _|" };
	private static final String[] DIGIT_4 = new String[] { "   ", "|_|", "  |" };
	private static final String[] DIGIT_5 = new String[] { " _ ", "|_ ", " _|" };
	private static final String[] DIGIT_6 = new String[] { " _ ", "|_ ", "|_|" };
	private static final String[] DIGIT_7 = new String[] { " _ ", "  |", "  |" };
	private static final String[] DIGIT_8 = new String[] { " _ ", "|_|", "|_|" };
	private static final String[] DIGIT_9 = new String[] { " _ ", "|_|", "  |" };

	private static final Map<Integer, String[]> lcdDigits = new HashMap<Integer, String[]>();

	static {
		lcdDigits.put(0, DIGIT_0);
		lcdDigits.put(1, DIGIT_1);
		lcdDigits.put(2, DIGIT_2);
		lcdDigits.put(3, DIGIT_3);
		lcdDigits.put(4, DIGIT_4);
		lcdDigits.put(5, DIGIT_5);
		lcdDigits.put(6, DIGIT_6);
		lcdDigits.put(7, DIGIT_7);
		lcdDigits.put(8, DIGIT_8);
		lcdDigits.put(9, DIGIT_9);
	}

	public static String[] getLcdDigitRepresentation(int number) {
		return lcdDigits.get(number);
	}

}
