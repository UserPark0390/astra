package level1.level1_stream;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programmers_문자열내림차순배치하기2 {
    public String reverseStr(String str){
        return Stream.of(str.split(""))
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.joining());
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	Programmers_문자열내림차순배치하기2 rs = new Programmers_문자열내림차순배치하기2();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}
