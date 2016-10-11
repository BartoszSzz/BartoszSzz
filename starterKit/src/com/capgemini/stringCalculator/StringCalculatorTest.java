package com.capgemini.stringCalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	private String stringToCheck;
	StringCalculator calculations = new StringCalculator();

	@Test
	public void shouldReturnZero() {
		// given
		stringToCheck = "";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldReturnThisNumberZero() {
		// given
		stringToCheck = "0";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldReturnThisNumber() {
		// given
		stringToCheck = "1";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then
		Assert.assertEquals(1, result);
	}

	@Test
	public void shouldReturnSumOfTwoNumbers() {
		// given
		stringToCheck = "1+2";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then
		Assert.assertEquals(3, result);
	}

	@Test
	public void shouldReturnSumOfNumbers() {
		// given
		stringToCheck = "1+2+3";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then
		Assert.assertEquals(6, result);
	}

	@Test
	public void shouldThrowIllegalArgumentException() {
		// given
		stringToCheck = "abcd";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then

	}

	@Test
	public void shouldThrowNumberFormatException() {
		// given
		stringToCheck = "++";

		// when
		int result = calculations.stringCalculator(stringToCheck);

		// then

	}
}
