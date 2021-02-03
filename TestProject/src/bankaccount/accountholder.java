package bankaccount;

public class accountholder {
	String firstName;
	String lastName;
	int age;
	float balance;
	boolean creditCardEligibity;
	
	public void checkCreditCardEligibility() {
		
		if (age > 25 && balance >= 20000 ) {
			creditCardEligibity = true;
		}
		
	}

	public void displayAccountHolder() {
		
		System.out.println("This account belongs to " + firstName + lastName);
		System.out.println("Age of the account holder is " + age);
		System.out.println("Balance in the account is " + balance);
		System.out.println("Account holder eligibility for credi card is " + creditCardEligibity);

	}
}
