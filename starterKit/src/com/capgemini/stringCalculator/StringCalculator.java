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

			} else {
				String[] parts = input.split("\\+", -1);
				for (int i = 0; i < parts.length; i++) {

					// check if elements of array are numbers only
					if (StringUtils.isNumeric(parts[i])) {
						int partNumber = Integer.parseInt(parts[i]);
						resultOfCalculation += partNumber;
					} else {
						throw new NumberFormatException("String contains numbers, + and/or another char(s)");
					}
				}
			}
		} else {
			throw new IllegalArgumentException("String doesn't contain numbers and +");
		}

		return resultOfCalculation;
	}
}
