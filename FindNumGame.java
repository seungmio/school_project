//1���� 100������ �߻��� ������ ���ڸ� 5���ȿ� ���ߴ� ����.
//

import java.util.Scanner;
import java.util.Random;

public class FindNumGame {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		Random ranGen = new Random();
		int ranNum, answer, count=1; // ������ ����, ����� �Է�, ����
		ranNum=ranGen.nextInt(100)+1; 
		while(count<6) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			answer = scan.nextInt();
			count+=1;
			
			if (answer>ranNum) { // �Է��� ���ڰ� ���������� ū ���
				System.out.println("�Է��� ���ڰ� ���������� Ů�ϴ�.");
			}
			else 
				if (answer<ranNum) { // �Է��� ���ڰ� ���������� ���� ���
					System.out.println("�Է��� ���ڰ� ���������� �۽��ϴ�.");
			}
			else 
				if (answer==ranNum) { // ������ ���� ���
					System.out.println(count+"������ ������ ���߾����ϴ�.");
					break;
			} 
		// ���⸦ ä�켼��
		// �Է��� ���ڿ� �������� ���ؼ� ������ ū���� ����ڿ��� �˷��ش�
		//  �������  ������� ������ ���߾����ϴ�  ��� ǥ�� �� ����
		}
		if (count==6)
			System.out.println("������ 5�� �õ��� ������ ���߽��ϴ�.");

	}

}
