
public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10; // 상수는 대문자로, 두 글자를 쓰려면 _를 추가
	int MIN_VOLUME = 0; // public 생략 가능, 컴파일 시에 public static final 자동 생성
	
	
	// 추상 메서드 (메서드 선언부만 작성)
	public void turnOn();
	void turnOff();  // public 생략 가능, 컴파일 시에 public abstract 자동 생성
	public void setVolume(int volume);
	
	// 디폴트 메서드 (실행 내용까지 작성)
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드
	static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}
}
