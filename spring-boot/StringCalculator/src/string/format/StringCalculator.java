package string.format;

public class StringCalculator {

	public static void main(String[] args) {
		String str = "0\n1,-2";

		StringCalculator sc = new StringCalculator();
		if (str.contains(",\n")) {
			System.out.println("Sun >> " + "0");
		} else if (str.contains("-")) {
			try {
				throw new NegativeException("negatives not allowed");
			} catch (NegativeException e) {
				System.out.println(e.getMessage());
				String[] s = str.split(",");
				for (int i = 0; i < s.length; i++) {
					if (s[i].contains("-")) {
						System.out.print(s[i] + "\t");
					}
				}

			}
		} else {
			System.out.println(sc.add(str));
		}
	}

	public int add(String numbers) {
		int total = 0;

		String[] s = numbers.split("\\t|,|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/");

		if (s != null && s.length > 0) {
			for (int i = 0; i < s.length; i++) {
				total += Integer.parseInt(s[i].replace("\"", ""));
			}
		}

		return total;
	}

}

class NegativeException extends Exception {
	public NegativeException(String s) {
		super(s);
	}
}
