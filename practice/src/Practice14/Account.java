package Practice14;
public class Account {
	private String accountNumber;
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	private int balance;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "¥" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account a) {
			this.accountNumber.trim();
			if (this.accountNumber.equals(a.accountNumber) {
				return true;
			}
		}
		return false;
	}
}
