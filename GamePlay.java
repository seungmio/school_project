import java.util.Scanner;
class GamePlay
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("철수");		// 철수의 이름을 출력한다.
		String boy = scan.nextLine();		// 철수의 가위, 바위, 보 중 하나를 문자열로 입력받는다.
		
		System.out.println("영희");		// 영희의 이름을 출력한다.
		String girl = scan.nextLine();		// 영희의 가위, 바위, 보 중 하나를 문자열로 입력받는다.
		
		// 중첩 if 문
		if(boy. equals ("가위"))		 // 철수가 가위일 때
		{
			if(girl. equals ("가위")) System.out.println("비겼습니다.");			// 영희=>가위		
			else if(girl. equals ("바위")) System.out.println("영희가 이겼습니다.");    	// 영희=>바위
			else if(girl. equals ("보"))System.out.println("철수가 이겼습니다.");		// 영희=>보
		}
		if(boy. equals ("바위"))		 // 철수가 바위일 때
		{
			if(girl. equals ("가위")) System.out.println("철수가 이겼습니다.");		// 영희=>가위		
			else if(girl. equals ("바위")) System.out.println("비겼습니다.");    		// 영희=>바위
			else if(girl. equals ("보")) System.out.println("영희가 이겼습니다.");		// 영희=>보
		}
		if(boy. equals ("보"))		 // 철수가 보일 때
		{
			if(girl. equals ("가위")) System.out.println("영희가 이겼습니다.");		// 영희=>가위		
			else if(girl. equals ("바위")) System.out.println("철수가 이겼습니다.");    	// 영희=>바위
			else if(girl. equals ("보")) System.out.println("비겼습니다.");			// 영희=>보
		}		
	}	
} 