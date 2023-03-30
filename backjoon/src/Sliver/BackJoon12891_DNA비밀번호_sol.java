package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon12891_DNA비밀번호_sol {
	
	static int myArr[];
	static int checkArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int result = 0;
		checkArr = new int[4]; // 비밀번호 유효성 검사
		myArr = new int[4]; // 내가 만들 비밀번호 체크
		char a[] = new char[S];
		checkSecret = 0; // 몇 개가 요건에 맞는지 체크

		a = br.readLine().toCharArray(); // 배열넣기
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) { // 비밀번호 체크 배열에 요구 값이 0일 경우
				checkSecret++; // 0일 경우 해당 문자가 있다면 변수를 하나 올려주자
			}
		}
		for (int i = 0; i < P; i++) {
			Add(a[i]);
		}
		if(checkSecret == 4) {
			result++;
		} 
		// 슬라이딩 윈도우
		for(int i = P; i < S; i++) {   // 오른쪽으로 한 칸 슬라이딩 
			int j = i-P;
			Add(a[i]);
			Remove(a[j]);
		}
		if(checkSecret == 4) {
			result++;
		}
		System.out.println(result);
	}

	private static void Remove(char c) {
		switch (c) {
		case 'A':
			if(myArr[0] >= checkArr[0]) {
				checkSecret--;
			}
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1] >= checkArr[1]) {
				checkSecret--;
			}
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2] >= checkArr[2]) {
				checkSecret--;//;
			}
			myArr[2]--;
			break;
		case 'T':
			if(myArr[3] >= checkArr[3]) {
				checkSecret--;
			}
			myArr[3]--;
			break;
		}
		
	}

	private static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if(myArr[0] >= checkArr[0]) {
				checkSecret++;
			}
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1] >= checkArr[1]) {
				checkSecret++;
			}
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2] >= checkArr[2]) {
				checkSecret++;
			}
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3] >= checkArr[3]) {
				checkSecret++;
			}
			break;
		}

	}
}
