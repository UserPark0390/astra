package backjoon.Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lotto_ps {
	public static void main(String[] args) {
		System.out.println("출력하시고 싶은 로또 장수를 선택해주세요. 1장당 총 5게임의 번호가 출력됩니다.");
		Scanner sc = new Scanner(System.in);		
		int coin = sc.nextInt();
		System.out.println(Lotto(coin));
		
	}
	
	private static String Lotto(int coin) {
		List<List<Integer>> lotto_List = new ArrayList<>(); 
		for(int x = 1; x <= coin; x++) {
			for(int i = 0; i < 5; i++) {
				List<Integer> numberList = new ArrayList<>();
				while(numberList.size() < 6) {
					int Number = (int) Math.floor(Math.random() * (46-1) + 1);   
					if(numberList.size() == 0) {
						numberList.add(Number);
					} else if(numberList.contains(Number)) {
						continue;
					} else {
						numberList.add(Number);
					}
				}
				Collections.sort(numberList);
				lotto_List.add(numberList);
			}		
		}
		Iterator<List<Integer>>iterator = lotto_List.iterator();
		int count = 1;
		while(iterator.hasNext()) {
			List<Integer> num = iterator.next();
			System.out.println(num);
			if(count % 5 == 0) {
				System.out.println("\n*****" + count/5 + "장 출력했습니다. *****\n");
			}
			count++;
		}
		return "감사합니다. 꼭 당첨되세요~~";
	}
	
}
