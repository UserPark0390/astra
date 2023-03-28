package backjoon;

import java.util.PriorityQueue;

public class Heapsort_PriorityQueue {
	public static void main(String[] args) {
		int [] arr = {3,4,2,1,0,6,8,5,9};
		System.out.println("정렬 이전 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		System.out.println("\n정렬 후 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
}
