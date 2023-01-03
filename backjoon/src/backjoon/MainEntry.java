package backjoon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
	static int AnswerN;
	static int N = 10;

	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int T = sc.nextInt(); // testcase 입력
		int sum = 0;
		int msum = 0;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();  // 선수의 수
			for(int i = 0; i < N; i++ ) {
				list.add(sc.nextInt()); // 리스트에 값 넣기
			}  // 값 넣기 for end
						
			for(int i = 0; i< N; i++) {
				if(list.get(i) <= -1) {  // 비교
					msum += list.get(i);
				} else if(list.get(i) >= 0) { // 비교
					sum += list.get(i);
				}
				
				if(sum >= Math.abs(msum)) { // 최대값 비교
					AnswerN += sum;
				} else {
					AnswerN += msum;
				}
				
				AnswerN = (AnswerN % 1000000007);
			}
			
			
			System.out.println("#"+test_case+" "+AnswerN);
		} // for end
	} // main end
}
