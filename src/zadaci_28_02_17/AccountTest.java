package zadaci_28_02_17;

public class AccountTest {

	public static void main(String[] args) {
		//Instanciramo i pravimo objekat
		Account acc = new Account(1122, 20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println(acc.getBalance());
		System.out.println(acc.getMonthlyInterest());
		System.out.println(acc.getDateCreated());

	}

}
