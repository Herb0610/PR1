package org.campus02.blackjack;

public class Demo {

	public static void main(String[] args) {
		BlackJack bj = new BlackJack();
		
		Player p1 = new Player("Susi", 20);
		Player p2 = new Player("Maxi", 16);
		Player p3 = new Player("Joh", 22);
		Player p4 = new Player("Old John", 30);
		Player p5 = new Player("Old Max", 40);
		Player p6 = new Player("GrandParent John", 70);
		Player p7 = new Player("Susi 2", 25);
		bj.add(p1);
		bj.add(p2);
		bj.add(p3);
		bj.add(p4);
		bj.add(p5);
		bj.add(p6);
		bj.add(p7);
		
		bj.addCard(p1, 5);
		bj.addCard(p2, 9);
		bj.addCard(p1, 11);
		
		System.out.println(bj.toString());
		System.out.println(bj.getPlayerAgeGroup());
		System.out.println(bj.getValue("Maxi"));

	}

}
