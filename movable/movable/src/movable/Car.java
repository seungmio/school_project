package movable;

class Car implements Movable {
	public void speedUp(int amount) {	// �ӵ����� �޼ҵ� ����
		System.out.println("�ӵ��� "+amount+" km/h�� ���Դϴ�.");
	}
	public void speedDown(int amount) {	// �ӵ����� �޼ҵ� ����
		System.out.println("�ӵ��� "+amount+" km/h�� ����ϴ�.");
	}
	String TurnLeft() {
		return "��ȸ��";
	}
	String TurnRight() {
		return "��ȸ��";
	}
}
