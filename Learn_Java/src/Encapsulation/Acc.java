package Encapsulation;

public class Acc {
	
	private int number;
	private String name;
	private double amt;
	
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
