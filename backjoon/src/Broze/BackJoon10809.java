package Broze;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BackJoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String str = sc.next();
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) { // 입력단어 map에 담기(단어 / 위치값)
			if(!map.containsKey(str.valueOf(str.charAt(i)))) { // 입력한 값과 같은 값이 있으면 true		
				map.put(str.valueOf(str.charAt(i)), i);
			}
		} // str length for end
		
		for(int i = 0; i < tmp.length(); i++) {
			if(map.get(tmp.valueOf(tmp.charAt(i))) != null) { // map에 있는 알파벳 유무체크
				sb.append(map.get(tmp.valueOf(tmp.charAt(i)))).append(" "); // 존재하면 키(알파켓)에 대한 value 값을
			}else {
				sb.append(-1).append(" "); // 없으면 -1
			}
		}
		System.out.println(sb);
	}
}
