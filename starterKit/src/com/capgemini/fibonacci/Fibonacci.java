package com.capgemini.fibonacci;

/**
 * F1 F2 F3 F4 F5 F6 F7 F8 F9 1 1 2 3 5 8 13 21 34
 * 
 * F10 F11 F12 F13 F14 F15 F16 F17 F18 F19 55 89 144 233 377 610 987 1597 2584
 * 4181 …
 */

public class Fibonacci {
	public static long fib(int n) {
		// n is a place
		// n = np. 2.5????
		long fn;
		if (n <= 0) {
			fn = 0;
		} else {
			long[] arrayF = new long[n + 1];
			arrayF[0] = 0; // n = 0
			arrayF[1] = 1; // n = 1
			fn = 1;

			for (int number = 2; number <= n; number++) {
				fn = arrayF[number - 1] + arrayF[number - 2];
				arrayF[number] = fn;

			}
		}
		return fn;
	}
}
