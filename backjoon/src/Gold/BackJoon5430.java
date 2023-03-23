package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BackJoon5430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		while (T-- > 0) {
			LinkedList<Integer> list = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(),"[],");
			for (int i = 0; i < N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'R') {
					Collections.reverse(list);

				} else if (str.charAt(i) == 'D') {
					if (list.isEmpty()) {
						bw.write("error" + "\n");
						break;
					} else {
						list.remove(0);
					}
				}
			}
			if (list.size() > 0) {
				bw.write("[");
				if (list.size() == 1) {
					bw.write(list.get(0));
				} else {
					for (int i = 0; i < list.size(); i++) {
						if (i == list.size() - 1) {
							bw.write(list.get(i) + "]"+"\n");
						} else {
							bw.write(list.get(i) + ",");
						}
					}

				}
			}
		} // while end
		bw.flush();
		br.close();
		bw.close();
	}
}
