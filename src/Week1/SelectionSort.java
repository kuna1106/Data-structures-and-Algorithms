package Week1;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("before:");
		shuffle(arr);
		printArray(arr);
		System.out.println("\nafter");
		selectionSortReverse(arr, n);
		printArray(arr);
	}
	
	public static void selectionSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i+1; j <= n - 1; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}	
		}
	}
	
	public static void selectionSortReverse(int[] arr, int n) {
		for (int i = n - 1; i > 0;i--) {
			for (int j = i - 1; j >= 0 ; j--) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void shuffle(int[] arr) {
		Random random =  new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = random.nextInt(arr.length);
			swap(arr, i, j);
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
 