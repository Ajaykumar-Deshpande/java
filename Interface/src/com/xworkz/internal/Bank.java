package com.xworkz.internal;

public class Bank implements BankRule{

	@Override
	public boolean silence() {
		// TODO Auto-generated method stub
		System.out.println("runninig silence in Bank");
		return false;
	}

	@Override
	public String openingHours() {
		// TODO Auto-generated method stub
		System.out.println("runninig openingHours in Bank");
		return null;
	}

	@Override
	public double minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("runninig minimumBalance in Bank");
		return 0;
	}

	@Override
	public boolean noOverdrafts() {
		// TODO Auto-generated method stub
		System.out.println("runninig noOverdrafts in Bank");
		return false;
	}

	@Override
	public boolean validIDRequired() {
		// TODO Auto-generated method stub
		System.out.println("runninig validIDRequired in Bank");
		return false;
	}

	@Override
	public boolean secureOnlineBanking() {
		// TODO Auto-generated method stub
		System.out.println("runninig openingHours in Bank");
		return false;
	}

	@Override
	public double atmUsageLimit() {
		// TODO Auto-generated method stub
		System.out.println("runninig atmUsageLimit in Bank");
		return 0;
	}

	@Override
	public double transactionFee() {
		// TODO Auto-generated method stub
		System.out.println("runninig openingHours in Bank");
		return 0;
	}

	@Override
	public boolean loanEligibilityCriteria() {
		// TODO Auto-generated method stub
		System.out.println("runninig loanEligibilityCriteria in Bank");
		return false;
	}

	@Override
	public boolean confidentiality() {
		// TODO Auto-generated method stub
		System.out.println("runninig confidentiality in Bank");
		return false;
	}

	@Override
	public boolean antiMoneyLaunderingCompliance() {
		// TODO Auto-generated method stub
		System.out.println("runninig antiMoneyLaunderingCompliance in Bank");
		return false;
	}

	@Override
	public boolean depositInsurance() {
		// TODO Auto-generated method stub
		System.out.println("runninig depositInsurance in Bank");
		return false;
	}

	@Override
	public boolean timelyLoanRepayments() {
		// TODO Auto-generated method stub
		System.out.println("runninig timelyLoanRepayments in Bank");
		return false;
	}

	@Override
	public boolean accountStatementAvailability() {
		// TODO Auto-generated method stub
		System.out.println("runninig accountStatementAvailability in Bank");
		return false;
	}

	@Override
	public int chequeClearanceTime() {
		// TODO Auto-generated method stub
		System.out.println("runninig chequeClearanceTime in Bank");
		return 0;
	}

	@Override
	public boolean customerServiceStandards() {
		// TODO Auto-generated method stub
		System.out.println("runninig customerServiceStandards in Bank");
		return false;
	}

}
