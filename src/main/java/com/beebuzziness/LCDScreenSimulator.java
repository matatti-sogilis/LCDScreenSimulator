package com.beebuzziness;

import org.apache.commons.lang3.StringUtils;

public class LCDScreenSimulator {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.print("USAGE: argument 1 is needed");
			return;
		}

		if (!StringUtils.isNumeric(args[0])) {
			System.out.print("USAGE: argument 1 must be an integer");
			return;
		}

		int inputNumber = Integer.parseInt(args[0]);
		LCDScreenSimulator lcdScreenSimulator = new LCDScreenSimulator();
		System.out.println(lcdScreenSimulator.getLCDOutput(inputNumber));
	}

	public String getLCDOutput(int inputNumber) {
		String inputNumberAsString = Integer.toString(inputNumber);

		StringBuilder output = new StringBuilder();
		StringBuilder lcdLine1 = new StringBuilder();
		StringBuilder lcdLine2 = new StringBuilder();
		StringBuilder lcdLine3 = new StringBuilder();

		for (int i = 0; i < inputNumberAsString.length(); i++) {
			int inputDigit = Integer.parseInt(inputNumberAsString.substring(i, i + 1));
			String[] inputDigitRepresentation = LCDDigit.getLcdDigitRepresentation(inputDigit);
			lcdLine1.append(inputDigitRepresentation[0]);
			lcdLine2.append(inputDigitRepresentation[1]);
			lcdLine3.append(inputDigitRepresentation[2]);

			if (i != inputNumberAsString.length() - 1) {
				lcdLine1.append(" ");
				lcdLine2.append(" ");
				lcdLine3.append(" ");
			}
		}

		output.append(lcdLine1);
		output.append("\n");
		output.append(lcdLine2);
		output.append("\n");
		output.append(lcdLine3);

		return output.toString();
	}

}
