package Lambda;

public class NoReturnExample {
	
	public static void main(String[] args) {
		NoReturn myFI;
		
		//Lambda 형식1
		myFI = (x) -> {
			int result = x*10;
			System.out.println(result);
		};
		
		myFI.method(2);
		
		//Lambda 형식2
		myFI = (x) -> {System.out.println(x*10);};
		myFI.method(3);
		
		//Lambda 형식3
		myFI = x -> System.out.println(x*10);
		myFI.method(4);
	}

}
