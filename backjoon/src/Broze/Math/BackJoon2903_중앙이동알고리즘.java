package Broze.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2903_중앙이동알고리즘 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double tmp = 0;
		tmp = (Math.pow(2,N))+1;
		N = (int)(tmp*tmp);
		System.out.println(N);
	}
}
