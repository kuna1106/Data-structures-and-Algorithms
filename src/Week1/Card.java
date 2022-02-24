package week1;

import week1.TDataSort;

public class Card {
	private int rank, suite;
	
	public Card(int rank, int suite) {
		this.rank = rank;
		this.suite = suite;
	}
	
	public String getRankString() {
		if (rank == 1)
			return "A";
		if (rank == 11)
			return "J";
		if (rank == 12)
			return "Q";
		if (rank == 13)
			return "K";
		return rank +" ";
	}
	
	public String getSuiteString() {
		if (suite == 1)
			return "♦";
		if (suite == 2)
			return "♥";
		if (suite == 3)
			return "♠"; 
		return "♣";
	}
	
	public String toString() {
		return "[" + getRankString() + getSuiteString() + "]";
	}
	
	public static void main(String[] args) {
		Card[] desk = new Card[52];
		int idx = 0;
		for (int i = 1; i <= 13; i++) {
			for (int j = 1; j <= 4; j++) {
				desk[idx] = new Card(i,j);
				idx++;
			}
		}
		TDataSort.printArray(desk);
	}
}
