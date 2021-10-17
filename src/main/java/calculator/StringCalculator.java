package calculator;

class StringCalculator {
	public int add(String input) {
		// if string is empty it returns 0
		int sum = 0;
		if (input.isEmpty())
			return 0;
		else {
			if (input.length() == 1)
				return Integer.parseInt(input); // if string length is 1 it returns first element converted to integer
			else {
				// these will check for 2 more elements
				String[] nums = StringCalculator.split(input);

				for (String num : nums) {
					sum += Integer.parseInt(num);
				}
				return sum;
			}
		}
	}

	private static String[] split(String str) {
        if (str.startsWith("//")) {
            String delimiter = str.substring(2, 3);
            return str.substring(4).split(delimiter);
        }
		String[] nums = str.split(",|\n");
		return nums;
	}
	
	
}
