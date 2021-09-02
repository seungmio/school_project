public class Circle
{
	private double radius;
	final static double PI = 3.141592;	// PI 라는 이름으로 3.011592로 초기화된 정적 상수
	
	// 원의 반지름을 매개 변수로 받는 생성자를 작성
	Circle(double radius) {
		this.radius = radius;
	}
	// 매개 변수가 없는 생성자로서 원의 반지름을 0.0으로 설정한다.
	Circle() {
		double radius = 0.0;
	}
	
	// 설정자 메소드인 setRadius()를 작성한다.
	void setRadius(double radius) {
		this.radius = radius;
	}
	// 접근자 메소드인 getRadius()를 작성한다.
	double getRadius() {
		return radius;
	}
	// double 형의 값을 제곱하여 반환하는 square() 메소드를 전용메소드로 선언한다.
	private double square(double num) {
		return num*num;
	}
	// 원의 면적을 계산하는 getArea() 메소드를 작성한다.
	double getArea() {
		return this.square(radius) * PI;
	}
	// 원의 둘레를 계산하는 getPerimeter() 메소드를 작성한다.
	double getPerimeter() {
		return radius * 2 * PI;
	}
	// PI 값을 반환하는 정적 메소드 getPI() 메소드를 작성한다.
	static double getPI() {
		return PI;
	}
}

	
	