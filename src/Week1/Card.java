package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import week1.TDataSort;

public class Card implements Comparable<Card>{
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

	@Override
	public int compareTo(Card o) {
		if (this.rank == o.rank)
			return o.suite- this.suite;
		else
			return o.rank - this.rank;
	}
	
	public static <T> void printList(List<T> lst) {
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i) + " ");
		}
		
		System.out.println();
	} 
	public static void main(String[] args) {
//		List<Card> desk = new ArrayList<Card>(); // sai List<Card> desk = new List<Card>();
////		ArrayList<Card> desk2 = new ArrayList<>();
//		for (int i = 1; i <= 13; i++) {
//			for (int j = 1; j <= 4; j++) {
//				desk.add(new Card(i,j)); // Card card = new Card(i,j); desk.add(card);
//			}
//		}
//		printList(desk);
//		System.out.println("\n-------------------------------------");
//		
//		Collections.shuffle(desk);
//		printList(desk);
//		
//		System.out.println("\n-------------------------------------");
//		Collections.sort(desk);
//		printList(desk);
//		
//		// convert list to array
//		System.out.println("Array");
//		Card[] deskrr = desk.toArray(new Card[desk.size()]); // desk.toArray() -> Object[]
//		TDataSort.printArray(deskrr);
//	
//		// convert array to list
//		System.out.println("list");
//		List<Card> lsts = Arrays.asList(deskrr);
//		printList(lsts);
//		
//		System.out.println("swap first and end");
//		Card temp = lsts.get(0);
//		lsts.set(0, lsts.get(51));
//		lsts.set(51, temp);
//		
//		printList(lsts);
		
		//  creat a desk in list and print, remove J Q K card and print
		List<Card> desk = new ArrayList<Card>();
		for (int i = 1; i <= 13; i++) {
			for (int j = 1; j <= 4; j++) {
				desk.add(new Card(i,j));
			}
		}
		
		System.out.println("before");
		printList(desk);
		
		for (int i = 0; i < desk.size(); i++) {
			if (desk.get(i).rank > 10) {
				desk.remove(i);
				i--; // note 
			}
		}
		System.out.println("after");
		printList(desk);
	}
}
