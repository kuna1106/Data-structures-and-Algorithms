package data_compression;

public class RLE {
	
	/**
	 * Computes the length of the compression array.
	 * @param t a binary array
	 * @return an integer.
	 */
	public static void main(String[] args) {
		int[] a = {0, 0, 0, 0, 0, 1,0, 0, 0, 0, 0};
		System.out.println(a.length);
		for (int i : compress(a)) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(lengthInverse(compress(a)));
		
		for (int i : decompress(compress(a))) {
			System.out.print(i + " ");
		}
	}
	
	public static int length(int[] t) {
		// TODO: Your code here
		if (t.length == 0) {
			return 0;
		}
		
		if (t == null) {
			return -1;
		}
		
		int temp = t[0];
		int count = 1;
		for (int i = 0; i < t.length; i++) {
			if (t[i] != temp) {
				count++;
				temp = t[i];
			}
		}
		return 2*count;
	}

	/**
	 * Compresses an array in RLE format and return the result.
	 * @param t
	 * @return compressed array.
	 */
	public static int[] compress(int[] t) {
		// TODO: Your code here
		int n = length(t);
		if (n == 0) {
			return new int[0];
		}
		
		int temp = t[0];
		int count = 1;
		int idx = 0;
		int[] comp = new int[n];
		for (int i = 1; i < t.length; i++) {
			if (temp == t[i]) {
				count++;
			} else {
				comp[idx] = temp;
				comp[idx + 1] = count;
				temp = t[i];
				count = 1;
				idx += 2;
			}
		}
		comp[idx] = temp;
		comp[idx + 1] = count;
		return comp;
	}

	/**
	 * Computes the length of the decompressed array.
	 * @param t
	 * @return an integer.
	 */
	public static int lengthInverse(int[] t) {
		if (t.length == 0) {
			return 0;
		}
		if (t == null) {
			return -1;
		}
		int length = 0;
		for (int i = 1; i < t.length; i+=2) {
			length += t[i];
		}
		return length;
	}
	
	/**
	 * Decompresses the array.
	 * @param t
	 * @return an array
	 */
	public static int[] decompress(int[] t) {
		int n = lengthInverse(t);
		// get size in array
		int[] comp = new int[n];

		// input value
		int temp = 0;
		for (int i = 1; i < t.length; i+= 2) {
			for (int j = 0; j < t[i]; j++) {
				comp[temp++] = t[i-1];
			}
		}
		return comp;
	}	
}
