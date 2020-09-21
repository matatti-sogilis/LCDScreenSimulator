package com.beebuzziness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LCDScreenSimulatorTest {

	private LCDScreenSimulator lcdScreenSimulator = new LCDScreenSimulator();

	private ByteArrayOutputStream testOut;

	@BeforeEach
	public void setUpOutput() {
		testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	@AfterAll
	public static void restoreOutput() {
		System.setOut(System.out);
	}

	@Test
	public void WhenInputNumberIs0_LCDOutputMustBe0LCDRepresentation() {
		assertEquals(" _ \n| |\n|_|", lcdScreenSimulator.getLCDOutput(0));
	}

	@Test
	public void WhenInputNumberIs1_LCDOutputMustBe1LCDRepresentation() {
		assertEquals("   \n  |\n  |", lcdScreenSimulator.getLCDOutput(1));
	}

	@Test
	public void WhenInputNumberIs2_LCDOutputMustBe2LCDRepresentation() {
		assertEquals(" _ \n _|\n|_ ", lcdScreenSimulator.getLCDOutput(2));
	}

	@Test
	public void WhenInputNumberIs3_LCDOutputMustBe3LCDRepresentation() {
		assertEquals(" _ \n _|\n _|", lcdScreenSimulator.getLCDOutput(3));
	}

	@Test
	public void WhenInputNumberIs4_LCDOutputMustBe4LCDRepresentation() {
		assertEquals("   \n|_|\n  |", lcdScreenSimulator.getLCDOutput(4));
	}

	@Test
	public void WhenInputNumberIs5_LCDOutputMustBe5LCDRepresentation() {
		assertEquals(" _ \n|_ \n _|", lcdScreenSimulator.getLCDOutput(5));
	}

	@Test
	public void WhenInputNumberIs6_LCDOutputMustBe6LCDRepresentation() {
		assertEquals(" _ \n|_ \n|_|", lcdScreenSimulator.getLCDOutput(6));
	}

	@Test
	public void WhenInputNumberIs7_LCDOutputMustBe7LCDRepresentation() {
		assertEquals(" _ \n  |\n  |", lcdScreenSimulator.getLCDOutput(7));
	}

	@Test
	public void WhenInputNumberIs8_LCDOutputMustBe8LCDRepresentation() {
		assertEquals(" _ \n|_|\n|_|", lcdScreenSimulator.getLCDOutput(8));
	}

	@Test
	public void WhenInputNumberIs9_LCDOutputMustBe9LCDRepresentation() {
		assertEquals(" _ \n|_|\n  |", lcdScreenSimulator.getLCDOutput(9));
	}

	@Test
	public void WhenInputNumberIs10_LCDOutputMustBe10LCDRepresentation() {
		assertEquals("     _ \n  | | |\n  | |_|", lcdScreenSimulator.getLCDOutput(10));
	}

	@Test
	public void WhenInputNumberIs910_LCDOutputMustBe910LCDRepresentation() {
		assertEquals(" _       _ \n|_|   | | |\n  |   | |_|", lcdScreenSimulator.getLCDOutput(910));
	}

	@Test
	public void WhenInputMainIsMissing_ReturnErrorMessage() {
		LCDScreenSimulator.main(new String[] {});
		assertEquals("USAGE: argument 1 is needed\n", testOut.toString());
	}

	@Test
	public void WhenInputMainIsNotInteger_ReturnErrorMessage() {
		LCDScreenSimulator.main(new String[] { "ABC" });
		assertEquals("USAGE: argument 1 must be an integer\n", testOut.toString());
	}

	@Test
	public void WhenInputMainHas2Argument_ReturnErrorMessage() {
		LCDScreenSimulator.main(new String[] { "1", "2" });
		assertEquals("USAGE: Only one argument is accepted. Too much argument\n", testOut.toString());
	}

}
