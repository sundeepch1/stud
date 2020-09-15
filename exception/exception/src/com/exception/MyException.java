package com.exception;

public class MyException {

	public static void main(String... ar) {
		MyExceptionClass ob = new MyExceptionClass();
		try {
			ob.withdraw(100);
		} catch (MyExceptionClass e) {
			System.out.println("Exception handled - " + e);
		}
	}
}

class MyExceptionClass extends Exception {

	private String message;

	public MyExceptionClass() {
		this("Product is not available!");
	}

	public MyExceptionClass(String message) {
		this.message = System.currentTimeMillis() + ": " + message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = 1L;
	int acc_bal = 0; // current account balance

//	public String toString() {
//		return "Cannot debit. Low Account Balance.";
//	}

	public void withdraw(int debitMoney) throws MyExceptionClass {
		if (acc_bal > 1000) // if account balance is greater than 1000$ then you can dedit money
		{
			acc_bal = acc_bal - debitMoney;
		} else // if account balance is less than 1000$ then debiting throws our user defined
				// exception.
			throw new MyExceptionClass("Cannot debit. Low Account Balance.");
	}
}