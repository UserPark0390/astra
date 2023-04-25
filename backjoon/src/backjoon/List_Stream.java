package backjoon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_Stream {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C", "A");
		
		// 중복 제거 (distinct()를 이용)
		//List<String> newList = list.stream().distinct().collect(Collectors.toList());
		list = list.stream().distinct().collect(Collectors.toList());
		
		//System.out.println(newList);
		System.out.println(list);
	}
}
