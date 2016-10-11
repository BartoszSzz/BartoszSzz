package com.capgemini.stringCalculator;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator implements IStringCalculator {

	@Override
	public int stringCalculator(String input) {
		int resultOfCalculation = 0;

		if (input == "" || StringUtils.isNumeric(input) || input.contains("+")) {

			// input is empty string
			if (input == "") {
				resultOfCalculation = 0;

				// input is a number
			} else if (StringUtils.isNumeric(input)) {
				resultOfCalculation = Integer.parseInt(input);

				// input is numbers with another char(s) or only plus
			} else {
				// input is only plus
				if (input == "+") {
					throw new ArrayIndexOutOfBoundsException("String contains only +");
				} else {
					String[] parts = input.split("\\+");
					// if sprawdzajace czy wszystkie elementy tablicy to plus
					// lub liczba
					for (int i = 0; i < parts.length; i++) {
						int partNumber = Integer.parseInt(parts[i]);
						resultOfCalculation += partNumber;
					}
					// } else {
					// throw new NumberFormatException("String contains numbers,
					// + and/or another char(s)");
				}
			}

		} else {
			throw new IllegalArgumentException("String doesn't contain numbers and +");
		}

		return resultOfCalculation;
	}
}
