package zadaci_09_03_17;
import java.util.Date;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	/**
	 * Constructs a default Loan object.
	 */
	public Loan() throws IllegalArgumentException {
		this(5.5, 10, 1000);
	}

	/**
	 * Constructs a loan with specified interest rate, years, and loan amount.
	 */
	public Loan(double annualInterestRate, int numberOdYears, double loanAmount) throws IllegalArgumentException {

		if(annualInterestRate <= 0)
			throw new IllegalArgumentException("annualInterestRate needs to be greather than zero.");
		else if(numberOdYears <= 0)
			throw new IllegalArgumentException("numberOdYears needs to be greather than zero.");
		else if(loanAmount <= 0)
			throw new IllegalArgumentException("loanAmount needs to be greather than zero.");
		else {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOdYears;
			this.loanAmount = loanAmount;
			loanDate = new Date();
			System.out.println("New Loan object created.");
		}
	}

	@Override
	public String toString() {
		return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount="
				+ loanAmount + ", loanDate=" + loanDate + "]";
	}

	/**
	 * Returns the annual interest rate of this loan.
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Sets a new annual interest rate for this loan.
	 */
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if(annualInterestRate > 0)
			this.annualInterestRate = annualInterestRate;
		else
			throw new IllegalArgumentException();
	}

	/**
	 * Returns the number of the years of this loan.
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * Sets a new number of years for this loan.
	 */
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if(numberOfYears > 0)
			this.numberOfYears = numberOfYears;
		else
			throw new IllegalArgumentException();
	}

	/**
	 * Returns the amount of this loan.
	
	 */
	public double getLoanAmount() {
		return loanAmount;
	}

	/**
	 * Sets a new amount for this loan.	 
	 */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if(loanAmount > 0)
			this.loanAmount = loanAmount;
		else
			throw new IllegalArgumentException();
	}

	/**
	 * Returns the date of the creation of this loan.
	 */
	public Date getLoanDate() {
		return loanDate;
	}

	/**
	 * Returns the monthly payment for this loan.
	 */
	public double getMonthlyPayment() {

		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 /
				Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

		return monthlyPayment;
	}

	/**
	 * Returns the total payment for this loan.
	 */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
}