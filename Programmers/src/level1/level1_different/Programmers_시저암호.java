package level1.level1_different;

public class Programmers_시저암호 {
	   String caesar(String s, int n) {
	   String result = "";
	    n = n % 26;
	    for (int i = 0; i < s.length(); i++) {
	      char ch = s.charAt(i);
	      if (Character.isLowerCase(ch)) {
	        ch = (char) ((ch - 'a' + n) % 26 + 'a');
	      } else if (Character.isUpperCase(ch)) {
	        ch = (char) ((ch - 'A' + n) % 26 + 'A');
	      }
	      result += ch;
	    }
	        return result;
	    }
	   
	public static void main(String[] args) {
		Programmers_시저암호 c = new Programmers_시저암호();
	     System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}

}
