public class ExampleEnum {
	public static void main(String[] args) {
		
		// BasketballPlayers KANG = BasketballPlayers.KANGBAEKHO;
		// ordinal()메소드 사용.
		System.out.println(BasketballPlayers.KANGBAEKHO.ordinal());
		System.out.println(BasketballPlayers.CHAECHISU.ordinal());
		System.out.println(BasketballPlayers.SEOTAEUNG.ordinal());
		
		//name()메소드 사용.
		System.out.println(BasketballPlayers.KANGBAEKHO.name().getClass());
		System.out.println(BasketballPlayers.CHAECHISU.name());
		System.out.println(BasketballPlayers.SEOTAEUNG.name());
		
		System.out.println(BasketballPlayers.KANGBAEKHO.getClass());
		System.out.println(BasketballPlayers.CHAECHISU);
		System.out.println(BasketballPlayers.SEOTAEUNG);
		
		// values()메소드 사용.
		BasketballPlayers[] values = BasketballPlayers.values();
		System.out.println(values);
		
		for (BasketballPlayers value : values) {
			System.out.println(value);
		}
		
		// valueOf()메소드 사용.
		System.out.println(BasketballPlayers.valueOf("KANGBAEKHO"));
		
		
	}
}