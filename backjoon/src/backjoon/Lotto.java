package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int cash = sc.nextInt();
		int lotto[] = new int[6];
		List<Integer> list = new ArrayList<>();

			// 번호 생성
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;

				// 중복 번호 제거
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
				list.add(lotto[i]);
			}
			Collections.sort(list);

			// 번호 출력
			for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i] + " ");
				System.out.print("오늘의 행운의 숫자 : " + list.get(i));
				sb.append(list.get(i) + " ");
			}
			System.out.print("오늘의 행운의 숫자 : " + sb);
			list.clear();
			sb.delete(1, 6);
		
	}
}
