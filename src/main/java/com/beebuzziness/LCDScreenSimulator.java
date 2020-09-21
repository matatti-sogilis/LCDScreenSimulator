package com.beebuzziness;

public class LCDScreenSimulator {

	public static void main(String[] args) {
		System.out.println("Hello World!");
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
