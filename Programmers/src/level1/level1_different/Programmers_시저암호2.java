package level1.level1_different;

public class Programmers_시저암호2 {
	   String caesar(String s, int _n) {
	        return s.chars().map(c -> {
	            int n = _n % 26;
	            if (c >= 'a' && c <= 'z') {
	                return 'a' + (c - 'a' + n) % 26;
	            } else if (c >= 'A' && c <= 'Z') {
	                return 'A' + (c - 'A' + n) % 26;
	            } else {
	                return c;
	            }
	        }).mapToObj(c -> String.valueOf((char)c))
	        .reduce((a, b) -> a + b).orElse("");
	    }
	public static void main(String[] args) {
		Programmers_시저암호2 c = new Programmers_시저암호2();
	     System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}

}
