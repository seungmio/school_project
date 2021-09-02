package vehicle;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();	// Car 객체를 생성
		
		System.out.println(car.getKilosPerLiter());	// 연비 출력
		car.printSpeed();
	}
}
