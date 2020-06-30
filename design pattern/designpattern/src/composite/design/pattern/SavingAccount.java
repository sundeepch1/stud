package composite.design.pattern;

class SavingAccount extends Account {
	private String accountNo;
	private float accountBalance;

	public SavingAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public float getBalance() {
		return accountBalance;
	}
}
