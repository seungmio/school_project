package vehicle;

// �߻� Ŭ���� ����
abstract class Vehicle {
	int speed;	// ������ �ӵ� ���� ����
	public abstract double getKilosPerLiter();	// ���� �޼ҵ� ����
	public void printSpeed()	// �ӵ��� ����ϴ� �޼ҵ�
	{
		System.out.println("���� �ӵ��� "+speed+" �Դϴ�.");
	}

}
