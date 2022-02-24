package week1;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
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
		insertionSort(arr, n);
		printArray(arr);
	}
	
	public static void insertionSort(int[] arr, int n) {
		for (int i = 1; i <= n-1; i++) {
			if (arr[i] < arr[i-1]) {
				shiftElement(arr, i);
			}
		}
	}
	
	public static void shiftElement(int[] arr, int i) {
		int iValue = arr[i];
		while (i > 0 && arr[i-1] > iValue) {
			arr[i] = arr[i-1];
			i--;
		}
		arr[i] = iValue;
	}
	
	public static void shuffle(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = random.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		} 
	}
	
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
