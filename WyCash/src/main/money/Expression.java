package main.money;

public interface Expression {
	public Money reduce(Bank bank, String to);
	public Expression plus(Expression added);
	public Expression times(int multiplier);
}
