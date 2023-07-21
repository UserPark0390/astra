package level1.level1_different;

import java.util.Arrays;

public class Programmers_문자열내림차순배치하기2 {
    public String reverseStr(String str){
    char[] ch = str.toCharArray();
        String lower = "";
        String upper = "";

        for(int i = 0; i < ch.length; i++) {
            int chnum = ch[i];

            if(chnum >= 65 && chnum <= 90)
                upper += ch[i];
            else
                lower += ch[i];
        }

        char[] chUpper = upper.toCharArray();
        char[] chLower = lower.toCharArray();
        upper = ""; lower = "";

        Arrays.sort(chUpper);
        Arrays.sort(chLower);

        for(int i = chUpper.length - 1; i >= 0; i--)
            upper += chUpper[i];
        for(int i = chLower.length - 1; i >= 0; i--)
            lower += chLower[i];

        return lower + upper;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	Programmers_문자열내림차순배치하기2 rs = new Programmers_문자열내림차순배치하기2();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}

