package com.beebuzziness;

public class LCDScreenSimulator {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public String getLCDOutput(String number) {
		StringBuilder output = new StringBuilder();
		String[] inputDigit = LCDDigit.getLcdDigitRepresentation(Integer.parseInt(number));

		output.append(inputDigit[0]);
		output.append("\n");
		output.append(inputDigit[1]);
		output.append("\n");
		output.append(inputDigit[2]);

		return output.toString();
	}

}
