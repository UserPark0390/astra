package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int []a = new int[V+A+B];
		
		a[0]=A; //초기 값 입력
	
		for(int i=1; i>0; i++) { //거짓조건
			a[i]= -B+a[i-1]+A;
			
			if(a[i]>=V) {
				System.out.println(i+1);
				break;
			}
		}//END FOR
	}
}// END MAIN
