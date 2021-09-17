package in.practice.aug21;

public class Main {
	public static void main(String[] args) {
		Bird hen = new Hen("Hen", 10, "Black");
		hen.fly();
		System.out.println("Hen Price : " + hen.getSellingPrice());
		Bird eagle = new Eagle("Eagle", 20, "Brown");
		eagle.fly();
		System.out.println("Eagle Price : " + eagle.getSellingPrice());
		Electronics tv = new TV();
		System.out.println("TV Price : " + tv.getSellingPrice());
		Electronics fridge = new Fridge();
		System.out.println("Fridge Price : " + fridge.getSellingPrice());
	}

}
