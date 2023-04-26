package level0.different;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Programmers_중복된문자 {
	public static void main(String[] args) {
		String my_string = "people";
		System.out.println(solution(my_string));
	}

    public static String solution(String my_string) {
    	// 방법 1 : set 만 활용하는 방법
//        String[] answer = my_string.split("");
//        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//        return String.join("", set);
        
    	// 방법 2 : distinct() 를 이용
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}
