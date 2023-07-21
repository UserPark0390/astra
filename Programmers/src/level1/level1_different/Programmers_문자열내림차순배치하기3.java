package level1.level1_different;

import java.util.Arrays;

public class Programmers_문자열내림차순배치하기3 {
	 public String reverseStr(String str){
	        char[] sol = str.toCharArray();
	    Arrays.sort(sol);
	    return new StringBuilder(new String(sol)).reverse().toString();
	    }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String[] args) {
	    	Programmers_문자열내림차순배치하기3 rs = new Programmers_문자열내림차순배치하기3();
	        System.out.println( rs.reverseStr("Zbcdefg") );
	    }
}
