package level1.level1_different;

public class Programmers_p와y의개수3 {
	public static void main(String[] args) {
		String s = "Pyy";
		System.out.println(solution(s));
	}
	
    static boolean solution(String s) {
    	 s = s.toLowerCase();
         int count = 0;

         for (int i = 0; i < s.length(); i++) {

             if (s.charAt(i) == 'p')
                 count++;
             else if (s.charAt(i) == 'y')
                 count--;
         }

         if (count == 0)
             return true;
         else
             return false;
    }
}
