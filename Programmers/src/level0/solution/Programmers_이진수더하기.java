package level0.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_이진수더하기 {
	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		System.out.println(solution(bin1, bin2));
	}

	public static String solution(String bin1, String bin2) {
		String answer = "";
		int sum = 0;
		Integer[] Int_arr = new Integer[bin1.length()];
		for (int i = 0; i < bin1.length(); i++) {
			Int_arr[i] = bin1.charAt(i) - '0';
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
			for (int k = 0; k > 2; k++) {
				System.out.println("왔냐");
				num = num * 2;
			}		
			sum += Int_arr[j] * num;

		}

		for (int i = 0; i < bin2.length(); i++) {
			Int_arr[i] = bin2.charAt(i) - '0';
		}
		list = Arrays.asList(Int_arr);
		Collections.reverse(list);
		reverse_arr = list.toArray(Int_arr);
		for (int j = 0; j < reverse_arr.length; j++) {
			if (j == 0) {
				sum += reverse_arr[j];
			} else {
				int num = 1;
				for (int k = 0; k > j; k++) {
					System.out.println("왔냐");
					num = num * 2;
				}
				sum += Int_arr[j] * num;
			}
		}

		return answer;
	}
}
