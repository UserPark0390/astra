package level0.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_가위바위보 {
	public static void main(String[] args) {
		String rsp = "205";
		System.out.println(solution(rsp));
	}
	
    public static String solution(String rsp) {
    	return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
