import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받음
		int a = 3; // 3kg 봉지
		int b = 5; // 5kg 봉지
		
		if(n==4||n==7) {
			System.out.println(-1);
			System.exit(0);
		}
		if(n%5==0) {
			System.out.println(n/5);
		}else if(n%5==1||n%5==3) {
			System.out.println((n/5)+1);
		}else if(n%5==2||n%5==4) {
			System.out.println((n/5)+2);
		}
	}
}
