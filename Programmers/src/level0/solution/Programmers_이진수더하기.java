package level0.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_이진수더하기 {
	static int sum;
	static String answer;

	public static void main(String[] args) {
		String bin1 = "1001";
		String bin2 = "1111";
		System.out.println(solution(bin1, bin2));
	}

	public static String solution(String bin1, String bin2) {
		change(bin1);
		change(bin2);
		System.out.println("sum : " + sum);
		str_change(sum);
		return answer;
	}

	private static int change(String str) {
		Integer[] Int_arr = new Integer[str.length()];
		for (int i = 0; i < str.length(); i++) {
			Int_arr[i] = str.charAt(i) - '0';
		}
		List<Integer> list = Arrays.asList(Int_arr);
		Collections.reverse(list);
		Integer[] reverse_arr = list.toArray(Int_arr);
		for (int j = 0; j < reverse_arr.length; j++) {
			if (j == 0) {
				sum += reverse_arr[j];
				continue;
			}
			int num = 1;
			for (int k = 1; k < 2; k++) {
				num = num * 2;
			}
			sum += Int_arr[j] * num;
		}
		System.out.println("sum~ : " + sum);
		return sum;
	}
	
	private static String str_change(int n) {
		answer = "";
		int count = 0;
		List<String> str_list = new ArrayList<>();
		while(true) {
			int d = 0;
			if(n%2 != 0) {
				d = (n/2)*2;
				str_list.add(String.valueOf(n-d));
				n = n - Integer.parseInt(str_list.get(count));
				count++;
			} else {
				if(n/2 > 1) {
					d = n/2;
					if(d > 1) {
						str_list.add("0");
						count++;
						n = n-d;
					} else {
						str_list.add("1");
						count++;
						n = n-d;
					}
				} else {
					str_list.add("1");
					n = 0;
				}
			}
			if(n == 0) {
				Collections.reverse(str_list);
				for(int k = 0; k < str_list.size(); k++) {
					answer += str_list.get(k);
				}
				break;
			}
		}
		return answer;
	}

}
