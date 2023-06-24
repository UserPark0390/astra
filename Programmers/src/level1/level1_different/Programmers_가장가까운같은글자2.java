package level1.level1_different;

import java.util.*;

public class Programmers_가장가까운같은글자2 {
	public static void main(String[] args) {
		String str = "banana";		
		System.out.println(Arrays.toString(solution(str)));
	}
	
    public static int[] solution(String str) {
    	  int[] result = new int[str.length()];

          for(int i=0;i<str.length();i++){

              String subStr = str.substring(0,i);
              if(subStr.indexOf(str.charAt(i))==-1) {
                  result[i] = -1;
              }else {
                  result[i] = i-subStr.lastIndexOf(str.charAt(i));
              }
          }
          return result;
    }
}	
