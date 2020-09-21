package com.beebuzziness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LCDScreenSimulatorTest {

	private LCDScreenSimulator lcdScreenSimulator = new LCDScreenSimulator();

	@Test
	public void WhenInputNumberIs0_LCDOutputMustBe0LCDRepresentation() {
		assertEquals(" _ \n| |\n|_|", lcdScreenSimulator.getLCDOutput(0));
	}

	@Test
	public void WhenInputNumberIs1_LCDOutputMustBe1LCDRepresentation() {
		assertEquals("   \n  |\n  |", lcdScreenSimulator.getLCDOutput(1));
	}

	@Test
	public void WhenInputNumberIs2_LCDOutputMustBe2CDRepresentation() {
		assertEquals(" _ \n _|\n|_ ", lcdScreenSimulator.getLCDOutput(2));
	}

	@Test
	public void WhenInputNumberIs3_LCDOutputMustBe3CDRepresentation() {
		assertEquals(" _ \n _|\n _|", lcdScreenSimulator.getLCDOutput(3));
	}

	@Test
	public void WhenInputNumberIs4_LCDOutputMustBe4CDRepresentation() {
		assertEquals("   \n|_|\n  |", lcdScreenSimulator.getLCDOutput(4));
	}

	@Test
	public void WhenInputNumberIs5_LCDOutputMustBe5CDRepresentation() {
		assertEquals(" _ \n|_ \n _|", lcdScreenSimulator.getLCDOutput(5));
	}

	@Test
	public void WhenInputNumberIs6_LCDOutputMustBe6CDRepresentation() {
		assertEquals(" _ \n|_ \n|_|", lcdScreenSimulator.getLCDOutput(6));
	}

	@Test
	public void WhenInputNumberIs7_LCDOutputMustBe7CDRepresentation() {
		assertEquals(" _ \n  |\n  |", lcdScreenSimulator.getLCDOutput(7));
	}

	@Test
	public void WhenInputNumberIs8_LCDOutputMustBe8CDRepresentation() {
		assertEquals(" _ \n|_|\n|_|", lcdScreenSimulator.getLCDOutput(8));
	}

	@Test
	public void WhenInputNumberIs9_LCDOutputMustBe9CDRepresentation() {
		assertEquals(" _ \n|_|\n  |", lcdScreenSimulator.getLCDOutput(9));
	}

	@Test
	public void WhenInputNumberIs10_LCDOutputMustBe10CDRepresentation() {
		assertEquals("     _ \n  | | |\n  | |_|", lcdScreenSimulator.getLCDOutput(10));
	}

	@Test
	public void WhenInputNumberIs910_LCDOutputMustBe910CDRepresentation() {
		assertEquals(" _       _ \n|_|   | | |\n  |   | |_|", lcdScreenSimulator.getLCDOutput(910));
	}

}
