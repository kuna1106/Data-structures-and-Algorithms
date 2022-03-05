package week1;

import java.util.Comparator;
import java.util.Random;

@SuppressWarnings("unchecked")
public class TDataSort {
	public static void sort(Comparable[] a) {
		for (int i = 0; i < a.length -1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					swap(a, i, j);
				}
			}
		}
	}
	
	public static <T> void sort(T[] a, Comparator<T> com) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (com.compare(a[i], a[j]) > 0) {
					swap(a, i, j);
				}
			}
		}
	}
	
	public static void swap(Comparable[] arr, int i, int j) {
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void shuffle(Object[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = random.nextInt(arr.length);
			swap(arr, i, j);
		}
	}
	
	public static void printArray(Object[] arr) {
		for (Object object : arr) {
			System.out.print(object + " ");
		}
	}
	
	public static void main(String[] args) {
//		Integer[] a = {1,2,3,4,5,6,7,8};
//		System.out.println("before");
//		shuffle(a);
//		printArray(a);
//		System.out.println("after");
//		sort(a);
//		printArray(a);
//		
		Integer[] a = {1,2,3,4,5,6,7,8,9,10};
		
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 % 2 == o2 % 2) {
					return o1 - o2; 
				} else
					return o1 % 2 - o2 % 2;
			}
				
		};
		
		sort(a, comp);
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}
}
