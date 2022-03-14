package data_compression;

public class Test {
	public static void main(String[] args) {
		int[] arr ={ 1, 0, 1, 0, 1, 1, 1 };

		System.out.println(longestOccurence(arr, 4, 100));
	}
	
	public static int longestOccurence(int[] t, int currentPosition, int windowSize) {
		if (currentPosition == 0 || currentPosition == t.length) {
			return 0;
		}
		
		
		int size = 0;
		int retour = 0;
		
		for (int i = currentPosition - 1; i >= 0; i--) {
			for (int j = currentPosition; j < t.length; j++) {
				if (t[i] == t[j]) {
					size++;
					retour = currentPosition - i;
				}
			}
		}	
		return size;
	}
}
