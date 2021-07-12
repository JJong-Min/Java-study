package Lambda;

public class ExsistPramAndReturnExample {

	public static void main(String[] args) {
		ExsistPramAndReturn myFI;
		// Lambda 형식1
		myFI = (x,y) -> {
			int result = x-y;
			return result;
		};
		System.out.println(myFI.method(10,5));
		
		// Lambda 형식2
		myFI = (x,y) -> {return x-y;};
		System.out.println(myFI.method(10,5));
		
		// Lambda 형식3
		myFI = (x,y) -> x-y;
		System.out.println(myFI.method(10,5));
		
		// Lambda 형식4
		myFI = (x,y) -> sub(x,y);
		System.out.println(myFI.method(10,5));
	}

	private static int sub(int x, int y) {
		return (x-y);
	}

}
