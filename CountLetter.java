import java.util.Scanner;
class CountLetter	
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		// 26개 소문자의 알파벳을 저장할 수 있는 배열을 선언한다.
		int countLower[] = new int[26];
		// 26개 대문자의 알파벳을 저장할 수 있는 배열을 선언한다.
		int countUpper[] = new int[26]; 
		
		System.out.println("문자열을 입력하시오 : ");
		String buffer = scan.nextLine();		// 입력 문자열 모두 리턴한다.

		// 문자가 등장하는 회수를 계산한다.
		for(int i=0; i<buffer.length(); i++)		// 입력 문자열만큼 반복한다.
		{
			char ch = buffer.charAt(i);		// char타입 변환 후 저장하는 변수를 선언한다.
			if(buffer.charAt(i)>='a' && buffer.charAt(i)<='z') countLower[ch-'a']++;	 // 해당하는 소문자가 등장하면 할당된 배열 값에 1을 더한다.
			else if(buffer.charAt(i)>='A' && buffer.charAt(i)<='Z') countUpper[ch-'A']++; 	// 해당하는 대문자가 등장하면 할당된 배열 값에 1을 더한다.
			else
				continue;			// 그 외의 문자인 경우
		}
		// 배열에 저장된 횟수를 반복문으로 출력한다.
		for(int i=0; i<26; i++)	// 소문자 알파벳을 도는 반복문
		{
			if(countLower[i]==0) continue;			// 개수가 0 일 경우 출력하지 않는다.
			System.out.println((char)(97+i)+" : "+countLower[i]);	// 소문자 출력
		}
		for(int i=0; i<26; i++)	// 대문자 알파벳을 도는 반복문
		{
			if(countUpper[i]==0) continue;
			System.out.println((char)(65+i)+" : "+countUpper[i]);	//대문자 출력
		}
	}
}