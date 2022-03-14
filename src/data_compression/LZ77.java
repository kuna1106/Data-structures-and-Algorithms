package data_compression;

public class LZ77 {
	public static Occurrence longestOccurence(int[] t, int currentPosition, int windowSize) {
		if (currentPosition == 0 || currentPosition == t.length) {
			return new Occurrence(0,0);
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
		return new Occurrence(retour,size);
	}
}


class Occurrence {
	int retour;
	int size;
	
	Occurrence(int retour, int size){
		this.retour = retour;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "(" + retour + "," + size + ")";
	}
}
