package Broze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJoon1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 시험 본 과목의 개수
		List <Double> list = new ArrayList<>();
		Double Check = (double) 0;
		Double result = 0.0;
		
		for(int i = 0; i < N; i++) {
			list.add((double) sc.nextInt());
			if(Check == 0 || (Check < list.get(i) && list.size() > 0)) {
				Check = list.get(i);
			} 
		}

		for(int i = 0; i < N; i++) {
			//list.add((double)((list.get(0)*100)/Check));
			result += (double)list.get(i)*100/Check;
		}	
		System.out.println((result/N));	
	}
}
