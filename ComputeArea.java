//ComputeArea.java
//원의 면적을 계산한다
import java.util.Scanner;
public class ComputeArea {
	public static void main(String [] args) {
	  //변수들을 선언한다
		final double PI = 3.14159;
		double radius, area;
		//반지름을 읽기 위해 Scanner 객체를 만든다
		Scanner scan = new Scanner(System.in);
		//원의 반지름을 입력 받는다
		System.out.print("원의 반지름을 입력하세요: ");
		radius = scan.nextDouble();
		//원의 면적을 계산한다
		area = radius * radius * PI;
		//원의 반지름과 면적을 출력한다
		System.out.println("원의 반지름은 " + radius + "이다.");
		System.out.println("원의 면적은 " + area + "이다.");
	}
}

			