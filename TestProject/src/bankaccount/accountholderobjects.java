package bankaccount;

public class accountholderobjects {

	public static void main(String[] args) {
	
		accountholder revanth = new accountholder();
		
		revanth.firstName = "Sai";
		revanth.lastName = "Mylavarapu";
		revanth.age = 10;
		revanth.balance = (float) 21000.50;
		revanth.checkCreditCardEligibility();
		
		revanth.displayAccountHolder();

	}

}
