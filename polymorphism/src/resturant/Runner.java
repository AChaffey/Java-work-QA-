package resturant;

public class Runner {

	public static void main(String[] args) {
		Food mealName = new Food();
		Burger Mcdon = new Burger();
		Object knife = new Burger();
		
		mealName.meal();
		Mcdon.bigmac();
		knife.equals(Mcdon);
	}
	
	

}
