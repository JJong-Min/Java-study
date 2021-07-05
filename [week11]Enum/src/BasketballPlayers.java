
public enum BasketballPlayers {
	KANGBAEKHO(10) {
		@Override
		int Point(int runningTime) {
			return runningTime * STAEMINA * 5;
		}
	}, 
	
	CHAECHISU(4){
		@Override
		int Point(int runningTime) {
			return runningTime * STAEMINA * 10;
		}
	},
	
	SEOTAEUNG(11){
		@Override
		int Point(int runningTime) {
			return runningTime * STAEMINA * 15;
		}
	};
	
	private int value;
	
	protected final int STAEMINA; // 선수의 기본 능력치, protected로 선언해야 상수에서 접근 가능
	
	BasketballPlayers (int value) {
		this.value = value;
		STAEMINA = value;

	
	}
	
	abstract int Point(int runningTime);
}

