package level2.level2_differnt;

import java.util.Arrays;

public class Programmers_최댓값과최솟값 {
	public static void main(String[] args) {
        String str = "1 2 3 4";
        Programmers_최댓값과최솟값 minMax = new Programmers_최댓값과최솟값();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(minMax.getMinMaxString(str));
	}
	
	 public String getMinMaxString(String str) {
	        String[] arrStr = str.split(" ");
	        int[] arrInt = new int[arrStr.length];
	        int i=0;
	        for(String part : arrStr){
	          arrInt[i] = Integer.parseInt(part);
	          i++;
	        }
	        StringBuffer sb = new StringBuffer();
	        sb.append(Arrays.stream(arrInt).min().getAsInt());
	        sb.append(" ");
	        sb.append(Arrays.stream(arrInt).max().getAsInt());

	        return sb.toString();
	    }
}
