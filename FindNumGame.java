//1부터 100사이의 발생된 임의의 숫자를 5번안에 맞추는 게임.
//

import java.util.Scanner;
import java.util.Random;

public class FindNumGame {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		Random ranGen = new Random();
		int ranNum, answer, count=1; // 임의의 숫자, 사용자 입력, 문제
		ranNum=ranGen.nextInt(100)+1; 
		while(count<6) {
			System.out.print("숫자를 입력하세요: ");
			answer = scan.nextInt();
			count+=1;
			
			if (answer>ranNum) { // 입력한 숫자가 랜덤값보다 큰 경우
				System.out.println("입력한 숫자가 랜덤값보다 큽니다.");
			}
			else 
				if (answer<ranNum) { // 입력한 숫자가 랜덤값보다 작은 경우
					System.out.println("입력한 숫자가 랜덤값보다 작습니다.");
			}
			else 
				if (answer==ranNum) { // 정답을 맞춘 경우
					System.out.println(count+"번만에 정답을 맞추었습니다.");
					break;
			} 
		// 여기를 채우세요
		// 입력한 숫자와 랜덤값을 비교해서 작은가 큰가를 사용자에게 알려준다
		//  맞춘경우는  몇번만에 정답을 맞추었습니다  라고 표시 후 종료
		}
		if (count==6)
			System.out.println("정답을 5번 시도에 맞추지 못했습니다.");

	}

}
