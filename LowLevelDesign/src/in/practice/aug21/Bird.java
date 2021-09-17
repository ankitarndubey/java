package in.practice.aug21;

public abstract class Bird implements Sellable {
	
	String name;
	String color;
	double weight;
	
	abstract void fly();
}
