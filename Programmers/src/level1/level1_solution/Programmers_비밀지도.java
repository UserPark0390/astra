package level1.level1_solution;

public class Programmers_비밀지도 {
	public static void main(String[] args) {
		int n  = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};

		System.out.println(solution(n, arr1, arr2));
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean [][] check_arr = new boolean[n][n];
        for(int i = 0; i < n; i++) {
        	String change_arr1 = Integer.toString(arr1[i], 2);
        	String tmp_arr1 = "";
        	String change_arr2 = Integer.toString(arr2[i], 2);
        	String tmp_arr2 = "";
        	if(change_arr1.length() < n) {
        		for(int m = 0; m < n-change_arr1.length(); m++) {
        			tmp_arr1 += "0";
        		}
        		change_arr1 = tmp_arr1 + change_arr1;
        	}
        	if(change_arr2.length() < n) {
        		for(int m = 0; m < n-change_arr2.length(); m++) {
        			tmp_arr2 += "0";
        		}
        		change_arr2 = tmp_arr2 + change_arr2;
        	}        	
        	for(int j = 0; j < n; j++) {
        		if((change_arr1.charAt(j)+"").equals("1")) {
        			check_arr[i][j] = true;
        		}
        		if((change_arr2.charAt(j)+"").equals("1")) {
        			check_arr[i][j] = true;
        		}        		
        	}      	        
        }
        
        for(int k = 0; k < n; k++) {
        	String check = "";
        	for(int l = 0; l < n; l++) {
        		if(check_arr[k][l] == true) {
        			check += "#";
        		}else {
        			check += " ";
        		}
        	}      	        
        	answer[k] = check;
        }
        
        return answer;
    }
}
