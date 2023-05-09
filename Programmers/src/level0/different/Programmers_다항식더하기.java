package level0.different;

public class Programmers_다항식더하기 {
	private static String replace_charcter = " + ";
    private static String split_character = ",";
    private static char variable = 'x';
    private static int coefficientOfX = 0;
    private static int constant = 0;
    static boolean checkX = false;
    
	public static void main(String[] args) {
		String polynomial = "10x + x + 20x + 10 + 3x";
		System.out.println(solution(polynomial));

	}

	public static String solution(String polynomial) {
		if (polynomial.indexOf(variable) >= 0) {
            checkX = true;
        }
        polynomial = polynomial.replace(replace_charcter, split_character);
        String[] splitted = polynomial.split(split_character);
        for (String word : splitted) {
            setCoefficientAndConstant(word);
        }
        return getAnswer(polynomial);
	}
	   private static String getAnswer(String polynomial) {
	        String answer = "";
	        if (coefficientOfX > 1) {
	            answer = "" + coefficientOfX + variable;
	            if (constant > 0) {
	                answer += replace_charcter + constant;
	            }
	        } else {
	            if (checkX) {
	                answer += variable;
	                if (constant > 0) {
	                    answer += replace_charcter + constant;
	                }
	            } else {
	                answer += constant;
	            }
	        }
	        return answer;
	    }

	    private static void setCoefficientAndConstant(String word) {
	        char x = word.charAt(word.length() - 1);
	        String number = word.replace(String.valueOf(variable), "");
	        if (Character.compare(variable, x) == 0) {
	            coefficientOfX += getConstant(number);
	        } else {
	            constant += Integer.parseInt(number);
	        }
	    }

	    private static int getConstant(String number) {
	        if (!number.isEmpty()) {
	            return Integer.parseInt(number);
	        }
	        return 1;
	    }

}
