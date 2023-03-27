package Broze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJoon2798_블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int best = 0;
		int tmp = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		for (int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					tmp = list.get(i)+list.get(j)+list.get(k);
					System.out.println("1 : " + list.get(i) + " 2 : "+ list.get(j) + " 3 :" + list.get(k));
					if(tmp == M) {
						best = tmp; // M이랑 값 일치
					} else if(tmp <= best) {  // best랑 비교해서 tmp가 같거나 작을 때
						tmp = 0;
					} else if(tmp > M){
						tmp = 0;
					} else {
						best = tmp;
					}
					
				}
			}
		}
		System.out.println(best);
	}
}
