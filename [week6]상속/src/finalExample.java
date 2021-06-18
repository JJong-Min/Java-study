
public class finalExample {
	
	final String company;
	String name = "Ratel";
	final int id = 00012;
	
	
	public finalExample(String company) {
		this.company = company;
	}

	public static void main(String[] args) {
		finalExample a = new finalExample("WhiteShip");
		a.id = 00013;
		a.name = "Nice";

	}

}
