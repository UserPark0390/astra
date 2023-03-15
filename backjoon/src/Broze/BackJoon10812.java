package Broze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BackJoon10812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list_test = new ArrayList<Integer>();
		
		// 1. list에 우선 값을 넣는다. ex) N = 10 이면 1~10까지 넣기
		for(int num = 1; num <= N; num++) {
			list.add(num);
		}
		
		// 2. M번의 횟수만큼 리스트의 값을 변화시킨다.
		for(int num = 0; num < M; num++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			int count = i-1;
			
			// 2-1. list_test에 i~j번째 숫자까지를 먼저 담는다.
			for(int a = count; a < j; a++) { // 
				list_test.add(list.get(a));					
			}
			// 2-2. list_test에서 i~j까지의 숫자중 k가 list에 가장 먼저 올 수 있게 한다.
			for(int a = 0; a < k-i; a++) {
				list_test.add(list_test.get(0));
				list_test.remove(list_test.get(0));
			}				
			// 2-3. list_test의 값을 list에 넣고 list_test는 초기화한다.
			for(int a = 0; a < list_test.size(); a++) {
				list.set(count, list_test.get(a));
				count++;
			}
			list_test.clear();
		}
		// 3. list 출력
		for(int a = 0; a < N; a++) {
			sb.append(list.get(a)).append(" ");
		}
		System.out.println(sb);
	}
}
