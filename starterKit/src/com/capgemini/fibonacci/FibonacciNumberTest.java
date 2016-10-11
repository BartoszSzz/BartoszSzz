package com.capgemini.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

	// Fibonacci number must be positive and natural number

	// dopisac test na liczbe nicalkowita??

	private int numberToCheck;

	@Test
	public void shouldReturnFibonacciNumber() {

		// given
		numberToCheck = 8;

		// when
		long result = Fibonacci.fib(numberToCheck);

		// then
		Assert.assertEquals(21, result);
	}

	@Test
	public void shouldReturnZeroButThisIsError() {

		// given
		numberToCheck = -5;

		// when
		long result = Fibonacci.fib(numberToCheck);

		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldReturnZero() {

		// given
		numberToCheck = 0;

		// when
		long result = Fibonacci.fib(numberToCheck);

		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldReturnOne() {

		// given
		numberToCheck = 1;

		// when
		long result = Fibonacci.fib(numberToCheck);

		// then
		Assert.assertEquals(1, result);
	}
}
