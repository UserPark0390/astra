package level0.different;

import java.util.Map;
import java.util.HashMap;

public class Programmers_평행 {
	public static void main(String[] args) {
		int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		System.out.println(solution(dots));
	}
	
    public static int solution(int[][] dots) {
    	   Map<Double, Double> straightInfoMap = new HashMap<>();

           for (int i = 0; i < dots.length - 1; i++) {
               for (int j = i + 1; j < dots.length; j++) {
                   double slope = Math.abs((double) (dots[j][1] - dots[i][1]) / (double) (dots[j][0] - dots[i][0]));
                   double y_intercept =  ((double) (dots[j][1]) - slope * dots[j][0]);
                   if (straightInfoMap.containsKey(slope) && straightInfoMap.get(slope) != y_intercept)
                       return 1;
                   straightInfoMap.put(slope, y_intercept);
               }
           }

           System.out.println(straightInfoMap);

           return 0;
    }
}
