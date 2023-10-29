package level1.level1_different;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_제일작은수제거하기 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(solution(arr)));				
	}
	
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int a : arr) {
                arrayList.add(a);
            }
            Integer minimum = Collections.min(arrayList);
            arrayList.remove(minimum);
            int[] resultArray = new int[arr.length - 1];
            for (int i = 0; i < arrayList.size(); ++i) {
                resultArray[i] = arrayList.get(i);
            }
            return resultArray;
        }
    }
}
