package level2.level2_differnt;

// 다른 사람의 quick sort 풀이 / 보고 참고
public class Programmers_최솟값만들기 {
	public static void main(String[] args) {
		Programmers_최솟값만들기 test = new Programmers_최솟값만들기();
        int []A = {2,1};
        int []B = {4,3};
        System.out.println(test.solution(A,B));
	}

	public static int solution(int[] A, int[] B) {
		 int answer = 0;
	        int length = A.length;


	        quickSort(A, 0, A.length-1);
	        quickSort(B, 0, B.length-1);

	        //System.out.println(A[0]);
	        //System.out.println(B[0]);

	        for(int i = 0 ; i < length ; i++)
	        {
	            answer += A[i] * B[length-1-i];
	        }



	        return answer;
	    }

	    public static void quickSort(int[] arr, int left, int right)
	    {
	        int i, j, pivot, tmp;

	        if (left < right) {
	            i = left;
	            j = right;
	            pivot = arr[left];
	            //분할 과정
	            while (i < j) {
	                while (arr[j] > pivot) j--;
	                while (i < j && arr[i] <= pivot) i++;

	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	            arr[left] = arr[i];
	            arr[i] = pivot;
	            //정렬 과정
	            quickSort(arr, left, i - 1);
	            quickSort(arr, i + 1, right);
	        }
	    }
}
