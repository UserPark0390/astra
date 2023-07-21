package level1.level1_different;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_문자열내림차순배치하기 {
	public static void main(String[] args) {
		Programmers_문자열내림차순배치하기 rs = new Programmers_문자열내림차순배치하기();
        System.out.println( rs.reverseStr("Zbcdefg") );
	}
    public String reverseStr(String str){
        String[] arry = str.split("");
        Arrays.sort(arry,  Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for( String s : arry )
        {
            sb.append(s);
        }
        return sb.toString();
    }
}
