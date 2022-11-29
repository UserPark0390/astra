package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BackJoon1269 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
//		int N = sc.nextInt();
//		int M = sc.nextInt();
		int sum = 0;
		boolean check = true;
		List<Integer> list = new ArrayList<Integer>();

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
//			int insertA = sc.nextInt();
			int insertA = Integer.parseInt(st.nextToken());
			String A = "A";
			map.put(A + i, insertA);
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			//int insertB = sc.nextInt();
			int insertB = Integer.parseInt(st.nextToken());
			String B = "B";
			map.put(B + i, insertB);
		}

		for (int i = 0; i < N; i++) {
			map.get("A" + i);
			for (int j = 0; j < M; j++) {
				if (!map.get("A" + i).equals(map.get("B" + j))) {
					check = false;
				} else {
					check = true;
					break;
				}
			}
			if (check == false && !list.contains(map.get("A" + i))) {
				list.add(map.get("A" + i));
			}
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
