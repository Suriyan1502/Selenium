package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("I have deposit in the bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank value= new AxisBank();
		value.fixed();
		value.saving();
		value.deposit();

	}

}
