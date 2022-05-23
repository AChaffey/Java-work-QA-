package mavenexcersise;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.demo.Blackjack;

public class BlackjackTest {
	
	@BeforeClass
	public static void Beforeclass() {
		System.out.println("Start of Class\n");
	}
	
	@AfterClass
	public static void Afterclass() {
		System.out.println("End of Class\n");
	}

	@Test
	public void Bothover() {
		assertEquals ("Both over 21: ", 0, Blackjack.blackJack(25, 22)); 
	}
	
	@Test
	public void Dealerover() {
		assertEquals ("Dealer over 21: ", 10, Blackjack.blackJack(25, 10));
	}
	
	@Test
	public void Playerover() {
		assertEquals ("Player over 21: ", 19, Blackjack.blackJack(19, 22));
	}
	
	@Test
	public void Dealerwins() {
		assertEquals ("Dealer wins: ", 20, Blackjack.blackJack(20, 19));
	}
}

