//ComputeArea.java
//���� ������ ����Ѵ�
import java.util.Scanner;
public class ComputeArea {
	public static void main(String [] args) {
	  //�������� �����Ѵ�
		final double PI = 3.14159;
		double radius, area;
		//�������� �б� ���� Scanner ��ü�� �����
		Scanner scan = new Scanner(System.in);
		//���� �������� �Է� �޴´�
		System.out.print("���� �������� �Է��ϼ���: ");
		radius = scan.nextDouble();
		//���� ������ ����Ѵ�
		area = radius * radius * PI;
		//���� �������� ������ ����Ѵ�
		System.out.println("���� �������� " + radius + "�̴�.");
		System.out.println("���� ������ " + area + "�̴�.");
	}
}

			