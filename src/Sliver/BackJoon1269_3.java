package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BackJoon1269_3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);			
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		boolean check = true;
		List<Integer> list = new ArrayList<Integer>();

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		for (int i = 0; i < N; i++) {
			int insertA = sc.nextInt();

			String A = "A";
			map.put(insertA, A+i);
		}


		for (int i = 0; i < M; i++) {
			int insertB = sc.nextInt();
			
			String B = "B";
			map.put(insertB, B+i);
		}
		

		System.out.println(map);
	}
}
