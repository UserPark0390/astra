package level0.solution;

public class Programmers_영어가싫어요 {
	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		System.out.println(solution(numbers));
	}

	public static long solution(String numbers) {
		long answer = 0;
		String str = "";
		String number = "";
		for (int i = 0; i < numbers.length(); i++) {
			char ch = numbers.charAt(i);
			str += ch;
			switch (str) {
			case "zero":
				number += 0;
				str = "";
				break;
			case "one":
				number += 1;
				str = "";
				break;
			case "two":
				number += 2;
				str = "";
				break;
			case "three":
				number += 3;
				str = "";
				break;
			case "four":
				number += 4;
				str = "";
				break;
			case "five":
				number += 5;
				str = "";
				break;
			case "six":
				number += 6;
				str = "";
				break;
			case "seven":
				number += 7;
				str = "";
				break;
			case "eight":
				number += 8;
				str = "";
				break;
			case "nine":
				number += 9;
				str = "";
				break;
			}
		}
		answer = Long.parseLong(number);
		return answer;
	}

}
