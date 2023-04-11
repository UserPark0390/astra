package level1;

import java.util.HashMap;
import java.util.Map;

public class Programmers_완주하지못한선수 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<>();
		for(String p : participant){
            map.put(p, map.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            map.put(c, map.get(c)-1);
        }
        // keySet을 하고 다시 get 하는 비효율성이 따른다. get을 할 때마다 hashmap을 search를 하기 때문
        // 효율적인 측면에서는 entrySet()
        for(String key : map.keySet()){  
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
		return answer;
	}
}
