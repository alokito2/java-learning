package operators;

public class Human {
	String name;
	String height;
	String country;
	
	public Human(String name,String height,String country) {
		this.name = name;
		this.height = height;
		this.country = country;
	}
	
	public String toString() {
		return " Human Name " +this.name+","+this.height+","+this.country;
	}
	
	public Human() {
		super();
	}
	public static void main(String[] args) {
		Human obj = new Human("Sachin","5.5f","india");
		System.out.println(obj);
		
		Human a = new Human();
	
		
		
		
		
		
	}

}
