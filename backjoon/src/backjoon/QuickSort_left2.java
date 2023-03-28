package backjoon;

public class QuickSort_left2 {
	
	public static void sort(int [] a) {
		left_pivot_sort(a, 0, a.length -1);
	}
	/**
	 *  왼쪽 피벗 선택 방식
	 * @param a		정렬할 배열
	 * @param lo	현재 부분배열의 왼쪽
	 * @param hi	현재 부분배열의 오른쪽
	 */
	private static void left_pivot_sort(int [] a, int lo, int hi) {
		
		// lo가 hi 보다 크거나 같아면 정렬할 원소가 1개 이하이므로 정렬하지않고 리턴
		if(lo >= hi) {
			return;
		}
		int pivot = partition(a,lo,hi);
		left_pivot_sort(a, lo, pivot -1);
		left_pivot_sort(a, pivot + 1, hi);
	}
	private static int partition(int [] a, int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = a[left];  // 부분 리스트의 왼쪽요소를 피벗으로 설정
		
		// lo가 hi 보다 작을 때까지만 반복
		while(lo < hi) { 
			// hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를 찾을 때까지 hi를 감소
			while(a[lo] > pivot && lo < hi) {
				hi--;
			}
			// hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를 찾을 때까지 lo를 증가 
			while(a[lo] <= pivot && lo < hi) {
				lo++;
			}
			// 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
			swap(a, lo, hi);
		}
		// 마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와 lo가 가리키는 원소를 바꾼다.
		swap(a, lo, hi);
		// 두 요소가 교환되었다면 피벗이었던 요소는 lo에 위치하므로 lo를 반환
		return lo;
	}
	
	
	private static void swap(int [] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}