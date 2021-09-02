import java.util.Scanner;
class CountLetter	
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		// 26�� �ҹ����� ���ĺ��� ������ �� �ִ� �迭�� �����Ѵ�.
		int countLower[] = new int[26];
		// 26�� �빮���� ���ĺ��� ������ �� �ִ� �迭�� �����Ѵ�.
		int countUpper[] = new int[26]; 
		
		System.out.println("���ڿ��� �Է��Ͻÿ� : ");
		String buffer = scan.nextLine();		// �Է� ���ڿ� ��� �����Ѵ�.

		// ���ڰ� �����ϴ� ȸ���� ����Ѵ�.
		for(int i=0; i<buffer.length(); i++)		// �Է� ���ڿ���ŭ �ݺ��Ѵ�.
		{
			char ch = buffer.charAt(i);		// charŸ�� ��ȯ �� �����ϴ� ������ �����Ѵ�.
			if(buffer.charAt(i)>='a' && buffer.charAt(i)<='z') countLower[ch-'a']++;	 // �ش��ϴ� �ҹ��ڰ� �����ϸ� �Ҵ�� �迭 ���� 1�� ���Ѵ�.
			else if(buffer.charAt(i)>='A' && buffer.charAt(i)<='Z') countUpper[ch-'A']++; 	// �ش��ϴ� �빮�ڰ� �����ϸ� �Ҵ�� �迭 ���� 1�� ���Ѵ�.
			else
				continue;			// �� ���� ������ ���
		}
		// �迭�� ����� Ƚ���� �ݺ������� ����Ѵ�.
		for(int i=0; i<26; i++)	// �ҹ��� ���ĺ��� ���� �ݺ���
		{
			if(countLower[i]==0) continue;			// ������ 0 �� ��� ������� �ʴ´�.
			System.out.println((char)(97+i)+" : "+countLower[i]);	// �ҹ��� ���
		}
		for(int i=0; i<26; i++)	// �빮�� ���ĺ��� ���� �ݺ���
		{
			if(countUpper[i]==0) continue;
			System.out.println((char)(65+i)+" : "+countUpper[i]);	//�빮�� ���
		}
	}
}