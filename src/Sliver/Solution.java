package Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
//	static int AnswerN;
//	static int N = 10;

	public static void main(String args[]) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
//		int T = Integer.parseInt(st.nextToken()); // testcase 입력
		int T = sc.nextInt(); // testcase 입력
		int N = 0;
		int AnswerN = 0;
		int sum = 0;
		int msum = 0;
		boolean check = false;
		
//		st = new StringTokenizer(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
//			N = Integer.parseInt(st.nextToken()); // 선수의 수
			N = sc.nextInt(); // 선수의 수

			for (int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine());
//				list.add(Integer.parseInt(st.nextToken())); // 리스트에 값 넣기
				list.add(sc.nextInt()); // 리스트에 값 넣기
				if(list.size() > 1) {
					if (list.get(0) == list.get(i) && list.get(i) == list.get(i-1)) {
						check = true;
					}
				}
			} // 값 넣기 for end

			for (int i = 0; i < N; i++) {
				if (check == true) {
					for (int j = 0; j < N; j++) {
						sum += list.get(i);
					}
				} else if (check == false) {
					if (list.get(0) <= -1) { // 비교
						msum += list.get(0);
						list.remove(0);
						for (int j = 0; j < list.size(); j++) {
							if (0 > list.get(0)) {
								msum += list.get(0);
								list.add(list.remove(0));
							} else if (2 == list.size()) {
								msum += list.get(0) + list.get(1);
								list.add(list.remove(0));
							} else {
								list.add(list.remove(0));
							}
						} // for end

					} else if (list.get(0) >= 0) { // 비교
						sum += list.get(0);
						list.remove(0);
						for (int j = 0; j < list.size(); j++) {
							if (0 < list.get(0)) {
								sum += list.get(0);
								list.add(list.remove(0));
							} else if (2 == list.size()) {
								sum += list.get(0) + list.get(1);
								list.add(list.remove(0));
							} else {
								list.add(list.remove(0));
							}
						} // for end
					} // if end
				}
				msum = Math.abs(msum);

				if (sum >= msum) { // 최대값 비교
					AnswerN += sum;
				} else {
					AnswerN += msum;
				}

				AnswerN = (AnswerN % 1000000007);
				sum = 0;
				msum = 0;
			}
			System.out.println("#" + test_case + " " + AnswerN);
			AnswerN = 0;
		} // for end
	} // main end
}
