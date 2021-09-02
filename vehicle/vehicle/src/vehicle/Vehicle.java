package vehicle;

// 추상 클래스 선언
abstract class Vehicle {
	int speed;	// 정수형 속도 변수 선언
	public abstract double getKilosPerLiter();	// 연비 메소드 선언
	public void printSpeed()	// 속도를 출력하는 메소드
	{
		System.out.println("현재 속도는 "+speed+" 입니다.");
	}

}
