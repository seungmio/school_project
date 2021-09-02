// CalFuelEfficiency.java : 자동차의 연비를 계산한다
import java.util.Scanner; 
public class CalFuelEfficiency { 
	// 사용자가 입력하는 값들에 기초하여 연비를 계산한다. 
	public static void main (String[] args) { 
		double drivedistance ; // 주행거리
		double fuels; // 사용한 휘발유 양
		double fuelefficiency; // 연비
		Scanner scan = new Scanner (System.in); 
		System.out.print ("주행거리를 입력하세요: "); 
		drivedistance = scan.nextDouble(); 
		System.out.print ("사용한 휘발유 양을 입력하세요: "); 
		fuels = scan.nextDouble(); 
		fuelefficiency = drivedistance / fuels; 
		System.out.println ( "연비: " + fuelefficiency); 
	} 
    }