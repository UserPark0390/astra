package Sliver;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class BackJoon10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int num = 0;
		int N = sc.nextInt();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < N; i++) {
			num = sc.nextInt();
			if (!map.isEmpty() && map.containsKey(num)) {
				map.replace(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			num = sc.nextInt();
			if (map.containsKey(num)) {
				sb.append(map.get(num)).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);

	} // main end
}