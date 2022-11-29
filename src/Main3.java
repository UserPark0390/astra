import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = 1 ;
		if(x < (w-x)) {
			a=x;
			} if(x > (w-x)) {
			a=(w-x);
			}else if(x ==(w-x)) {
			a=x;
		}else if(y< (h-y)){
			a=y;
		}if(y>(h-y)) {
			a=(h-y);
		}else if(y==(h-y)) {
			a=y;
		}
		

		int b = 1;
		if((w-x)>(h-y)) {
			b=(h-y);
		}else if((w-x)<(h-y)) {
			b=(w-x);
		}else if((h-y)==(w-x)) {
			b=(h-y);
		} //end
		
		if(a<b) {
			System.out.println(a);
		}else if(a>b) {
			System.out.println(b);
		}else if(a==b) {
			System.out.println(a);
		}
	

	}

}
