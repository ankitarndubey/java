package in.practice.aug21;

public class Hen extends Bird {

	
	Hen(String name, double weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
	@Override
	void fly() {
		System.out.println("Hen Flying");
		
	}
	@Override
	public int getSellingPrice() {
		
		return 200;
	}

}
