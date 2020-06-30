package facade.design.pattern;

import java.sql.Driver;

class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generating HTML Report for Chrome Driver");
	}

	public static void generateJUnitReport(String test, Driver driver) {
		System.out.println("Generating JUNIT Report for Chrome Driver");
	}
}
