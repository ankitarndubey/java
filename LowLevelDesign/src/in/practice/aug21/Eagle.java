package in.practice.aug21;

public class Eagle extends Bird {

	 Eagle(String name, double weight, String color){
	        this.name = name;
	        this.weight = weight;
	        this.color = color;
	    }
	
	@Override
	void fly() {
		System.out.println("Eagle flying");
	}

	@Override
	public int getSellingPrice() {
		
		return 10000;
	}

}
