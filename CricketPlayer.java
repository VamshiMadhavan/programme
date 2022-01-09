package com.technoelevate.cricket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CricketPlayer {
	int PlayerNumber;
	int jersyNumber;
	String name;
	static int count;
	int count1;

	public CricketPlayer(int playerNumber, int jersyNumber, String name) {
		super();
		count++;
		PlayerNumber = playerNumber;
		this.jersyNumber = jersyNumber;
		this.name = name;
		this.check(count);
	}

	@Override
	public String toString() {
		return "Cricket [PlayerNumber=" + PlayerNumber + ", jersyNumber=" + jersyNumber + ", name=" + name + "]";
	}

	public void check(int count1) {
		if (count > 11) {
			throw new Error();
		} else {

		}

	}

	public static void main(String[] args) {
		CricketPlayer cricketPlayer1 = new CricketPlayer(1, 45, "RohitSharma");
		CricketPlayer cricketPlayer2 = new CricketPlayer(2, 1, "KL Rahul");
		CricketPlayer cricketPlayer3 = new CricketPlayer(3, 18, "Virat");
		CricketPlayer cricketPlayer4 = new CricketPlayer(4, 44, "Shrayes Iyer");
		CricketPlayer cricketPlayer5 = new CricketPlayer(5, 7, "Dhoni");
		CricketPlayer cricketPlayer6 = new CricketPlayer(6, 27, "Hardik");
		CricketPlayer cricketPlayer7 = new CricketPlayer(7, 45, "Jadeja");
		CricketPlayer cricketPlayer8 = new CricketPlayer(8, 45, "Ashwin");
		CricketPlayer cricketPlayer9 = new CricketPlayer(9, 45, "Shami");
		CricketPlayer cricketPlayer10 = new CricketPlayer(10, 45, "Bhuvi");
		CricketPlayer cricketPlayer11 = new CricketPlayer(11, 45, "Bumrah");
		// CricketPlayer cricketPlayer12 = new CricketPlayer(1, 45, "Chahal");
		ArrayList<CricketPlayer> arrayList = new ArrayList<>();
		arrayList.add(cricketPlayer1);
		arrayList.add(cricketPlayer2);
		arrayList.add(cricketPlayer3);
		arrayList.add(cricketPlayer4);
		arrayList.add(cricketPlayer5);
		arrayList.add(cricketPlayer6);
		arrayList.add(cricketPlayer7);
		arrayList.add(cricketPlayer8);
		arrayList.add(cricketPlayer9);
		arrayList.add(cricketPlayer10);
		arrayList.add(cricketPlayer11);
		// arrayList.add(cricketPlayer12);
		Iterator<CricketPlayer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
