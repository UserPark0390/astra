package level0.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Programmers_캐릭터의좌표 {
	
	public static void main(String[] args) {
		String[] keyinput =  {"down", "down", "down", "down", "down", "up"};
		int[] board = {7, 9};		
		System.out.println(Arrays.toString(solution(keyinput, board)));
	}
    public static int[] solution(String[] keyinput, int[] board) {
        return Arrays.stream(keyinput).map(s -> getMap().get(s)).reduce((ints1, ints2) -> new int[] {
                Math.abs(ints1[0] + ints2[0]) > board[0] / 2 ? board[0] / 2 * (ints1[0] < 0 ? -1 : 1) : ints1[0] + ints2[0],
                Math.abs(ints1[1] + ints2[1]) > board[1] / 2 ? board[1] / 2 * (ints1[1] < 0 ? -1 : 1) : ints1[1] + ints2[1]
        }).orElse(new int[]{0, 0});
    }

    private static Map<String, int[]> getMap() {
        Map<String, int[]> map = new HashMap<>();

        map.put("up", new int[] {0, 1});
        map.put("down", new int[] {0, - 1});
        map.put("left", new int[] {-1, 0});
        map.put("right", new int[] {1, 0});
        return map;
    }
}
