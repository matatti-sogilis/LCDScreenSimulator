package com.beebuzziness;

public class LCDScreenSimulator {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public String getLCDOutput(String number) {
		if ("0".equals(number)) {
			return " _ \n| |\n|_|";
		} else {
			return "   \n  |\n  |";
		}

	}

}
