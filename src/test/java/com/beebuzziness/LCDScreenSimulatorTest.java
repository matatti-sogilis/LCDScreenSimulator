package com.beebuzziness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LCDScreenSimulatorTest {

	private LCDScreenSimulator lcdScreenSimulator = new LCDScreenSimulator();

	@Test
	public void WhenInputNumberIs0_LCDOutputMustBe0LCDRepresentation() {
		assertEquals(" _ \n| |\n|_|", lcdScreenSimulator.getLCDOutput("0"));
	}

}
