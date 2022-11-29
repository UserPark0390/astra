package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class BackJoon1269_2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int sum = 0;
		boolean check = true;
		List<Integer> list = new ArrayList<Integer>();

		HashMap<Integer, String> A = new HashMap<Integer, String>();
		HashMap<Integer, String> B = new HashMap<Integer, String>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int insertA = Integer.parseInt(st.nextToken());
			A.put(insertA , "A");
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int insertB = Integer.parseInt(st.nextToken());
			B.put(insertB, "B");
		}

		
		for (int i = 0; i < N; i++) {
			if()
		}

		sum += list.size();
		list.removeAll(list);

		for (int i = 0; i < M; i++) {
			map.get("B" + i);
			for (int j = 0; j < N; j++) {
				if (!map.get("B" + i).equals(map.get("A" + j))) {
					check = false;
				} else {
					check = true;
					break;
				}
			}
			if (check == false && !list.contains(map.get("B" + i))) {
				list.add(map.get("B" + i));
			}
		}
		sum += list.size();
		sb.append(sum);
		System.out.println(sb);

	}
}
