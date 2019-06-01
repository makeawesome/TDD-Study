package main.money;

public class Sum implements Expression{
	public Money augend;
	public Money addend;
	
	public Sum (Money augend, Money addends) {
		this.augend = augend;
		this.addend = addends;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}
}
