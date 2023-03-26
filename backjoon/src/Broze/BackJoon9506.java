package Broze;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJoon9506 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int N = sc.nextInt();
			int checkNum = 0;
			if(N == -1) {
				break;
			}			
			bw.write(N + " = ");
			for(int i = 1 ; i < N; i++) {
				if(N%i == 0) {
					list.add(i);
				}
			}
			for(int i = 0; i < list.size(); i++) {
				if(list.size()-1 == i) {
					bw.write(list.get(i) + "\n");
					
				} else {
					bw.write(list.get(i)+ " + ");
				}				
				checkNum += list.get(i);
			}
			if(checkNum != N) {
				System.out.println(N + " is NOT perfect.");
			} else {
				bw.flush();
			}
			list.clear();
		}
	}
}
