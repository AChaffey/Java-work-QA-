package com.qa.demo;

public class Blackjack {

	public static void main(String[] args) {

		System.out.println(blackJack(22, 20));
	}

	public static int blackJack(int dealer, int player) {
		if (dealer > 21 && player > 21) {
			return 0;
		} else if (dealer > 21) {
			return player;
		} else if (player > 21) {
			return dealer;
		}
		return Math.max(dealer, player);
	}
}
