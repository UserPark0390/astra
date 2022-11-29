package Sliver;

import java.util.Scanner;

public class BackJoon1476_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt(); // 지구
		int S = sc.nextInt(); // 태양
		int M = sc.nextInt(); // 달	
		int result = 0; // 연도 결과
		
		int E_count = 0;
		int S_count = 0;
		int M_count = 0;
		//int E_count, S_count, M_count, result = 0;
		
		while(true) {
			if(E_count != E) {
				if(E_count < 16) {
					E_count++;
				} else if(E_count == 16) {
					E_count = 1;
				}
			} // e end
			
			if(S_count != S) {
				if(S_count < 29) {
					S_count++;
				} else if(S_count == 29) {
					S_count = 1;
				}
			} // S end
			
			if(M_count != M) {
				if(M_count < 20) {
					M_count++;
				} else if(M_count == 20) {
					M_count = 1;
				}
			} // M end
			
			result++;
			
			if(E == E_count && S == S_count && M == M_count) {
				System.out.println(result);
				System.exit(0);
			}else {
				if(E_count == E) {
					if(E_count < 16) {
						E_count++;
					} else if(E_count == 16) {
						E_count = 1;
					}
				} // e end
				
				if(S_count == S) {
					if(S_count < 29) {
						S_count++;
					} else if(S_count == 29) {
						S_count = 1;
					}
				} // S end
				
				if(M_count == M) {
					if(M_count < 20) {
						M_count++;
					} else if(M_count == 20) {
						M_count = 1;
					}
				} // M end
				result++;
				continue;
			} // 3개 비교 end
			
		} // while end
		
	} // main end
}
