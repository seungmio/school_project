import java.util.Scanner;
class GamePlay
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ö��");		// ö���� �̸��� ����Ѵ�.
		String boy = scan.nextLine();		// ö���� ����, ����, �� �� �ϳ��� ���ڿ��� �Է¹޴´�.
		
		System.out.println("����");		// ������ �̸��� ����Ѵ�.
		String girl = scan.nextLine();		// ������ ����, ����, �� �� �ϳ��� ���ڿ��� �Է¹޴´�.
		
		// ��ø if ��
		if(boy. equals ("����"))		 // ö���� ������ ��
		{
			if(girl. equals ("����")) System.out.println("�����ϴ�.");			// ����=>����		
			else if(girl. equals ("����")) System.out.println("���� �̰���ϴ�.");    	// ����=>����
			else if(girl. equals ("��"))System.out.println("ö���� �̰���ϴ�.");		// ����=>��
		}
		if(boy. equals ("����"))		 // ö���� ������ ��
		{
			if(girl. equals ("����")) System.out.println("ö���� �̰���ϴ�.");		// ����=>����		
			else if(girl. equals ("����")) System.out.println("�����ϴ�.");    		// ����=>����
			else if(girl. equals ("��")) System.out.println("���� �̰���ϴ�.");		// ����=>��
		}
		if(boy. equals ("��"))		 // ö���� ���� ��
		{
			if(girl. equals ("����")) System.out.println("���� �̰���ϴ�.");		// ����=>����		
			else if(girl. equals ("����")) System.out.println("ö���� �̰���ϴ�.");    	// ����=>����
			else if(girl. equals ("��")) System.out.println("�����ϴ�.");			// ����=>��
		}		
	}	
} 