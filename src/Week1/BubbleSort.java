package week1;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
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
		bubbleSort(arr, n);
		printArray(arr);
	}
	
	public static void bubbleSort(int[] arr, int n) {
		for (int i = n - 1; i > 0; i--) {	
			for (int j = 1; j <= i; j++) {
				if (arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
	}

	public static void bubbleSortReverse(int [] arr, int n) {
		for (int i = 1; i <= n - 1; i++) {
			for (int j = i; j <= n - 1; j++) {
				if (arr[j -1] > arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void shuffle(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j =  random.nextInt(arr.length);
			swap(arr,i,j);
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
