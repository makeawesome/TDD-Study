package main.money;

public class Sum implements Expression{
	public Expression augend;
	public Expression addend;
	
	public Sum (Expression augend, Expression addends) {
		this.augend = augend;
		this.addend = addends;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
	
	public Expression plus(Expression added) {
		return null;
	}
}
