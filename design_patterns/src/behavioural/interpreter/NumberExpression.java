package behavioural.interpreter;

public class NumberExpression implements Expression {
	int number;
	public NumberExpression(int number) {
		this.number=number;
	}
	public NumberExpression(String number) {
		this.number=Integer.parseInt(number);
	}
	public int getNumber() {
		return this.number;
	}
	@Override
	public int interpret() {
		return this.number;
	}
}
