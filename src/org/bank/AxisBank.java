package org.bank;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("RD ammount is tranferred to fixed deposit");
	}
	public static void main(String[] args) {
		BankInfo b = new AxisBank();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
	
