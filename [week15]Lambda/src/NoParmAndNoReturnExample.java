package Lambda;

public class NoParmAndNoReturnExample {

	public static void main(String[] args) {
		NoParmeterAndNoReturn myFI;
		
		// Lambda 형식1
		myFI = () -> {
			String str = "I use Lambda!";
			System.out.println(str);
		};
		myFI.method();
		// Lambda 형식2
		myFI = () -> {System.out.println("I use Lambda!");};
		myFI.method();
		
		// Lambda 형식3
		myFI = () -> System.out.println("I use Lambda!");
		myFI.method();

	}
}