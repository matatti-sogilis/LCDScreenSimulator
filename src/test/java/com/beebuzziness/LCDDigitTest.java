package com.beebuzziness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LCDDigitTest {

	@Test
	public void ForAllNumber_GetLcdDigitRepresentationHaveALengthOf3() {
		for (int i = 0; i <= 9; i++) {
			assertEquals(3, LCDDigit.getLcdDigitRepresentation(i).length);
		}
	}
}
