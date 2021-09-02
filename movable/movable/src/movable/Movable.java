package movable;

// 인터페이스
public interface Movable {	
	final int speed = 100;	// 상수형의 speed 선언 및 초기화
	public abstract void speedUp(int amount);	// 속도높임 메소드 선언
	public abstract void speedDown(int amount);	// 속도늦춤 메소드 선언
	}
	
