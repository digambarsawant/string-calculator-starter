package calculator;

import java.util.ArrayList;
import java.util.List;



class StringCalculator {
	static int count = 0;

	public int add(String input) throws Exception {
		// if string is empty it returns 0
		int sum = 0;
		count++;
		List<Integer>list=new ArrayList<>();
		if (input.isEmpty())
			return 0;
		else {
			if (input.length() == 1)
				return Integer.parseInt(input); // if string length is 1 it returns first element converted to integer
			else {
				// these will check for 2 more elements
				String[] nums = StringCalculator.split(input);

				for (String num : nums) {
					if (Integer.parseInt(num) < 0) {
						list.add(Integer.parseInt(num));


					}
					sum += Integer.parseInt(num);
				}
				if(list.size()>0)
                         throw new StringCalculatorException("negatives not allowed "+list.toString());
                        
					return sum;
			}
		}
	}

	private static String[] split(String str) {
		// for allow different delimiters
		if (str.startsWith("//")) {
			String delimiter = str.substring(2, 3);
			return str.substring(4).split(delimiter);
		}
		String[] nums = str.split(",|\n");
		return nums;
	}
	public int getCallCount() {
		return count;
	}


}
