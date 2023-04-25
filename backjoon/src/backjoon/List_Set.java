package backjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Set {
	public static void main(String[] args) {
		// list
		List<String> list = Arrays.asList("A", "B", "C", "A");
		
		// list -> set으로
		Set<String> set = new HashSet<String>(list);
		
		// set -> 새로운 list로 or 기존의 list로 다시 바꾸는 방법도 가능
		//List<String> newList = new ArrayList<String>(set);
		list = new ArrayList<String>(set);
		
		//System.out.println(newList);
		System.out.println(list);
	}
}
