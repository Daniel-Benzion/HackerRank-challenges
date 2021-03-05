public class DayOfTheProgrammer {

	static String dayOfProgrammer(int year) {

		boolean julian = false;
		boolean is1918 = (year == 1918);
		boolean isLeapYear = false;

		if (is1918) {
			return "26.09.1918";
		}

		if (year < 1918) {
			julian = true;
		}

		if (julian) {
			if (year % 4 == 0) {
				isLeapYear = true;
			}
		} else {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				isLeapYear = true;
			}
		}

		if (julian && isLeapYear) {
			return "12.09." + year;
		} else if (julian) {
			return "13.09." + year;
		} else if (isLeapYear) {
			return "12.09." + year;
		}
		return "13.09." + year;
	}
}
