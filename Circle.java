public class Circle
{
	private double radius;
	final static double PI = 3.141592;	// PI ��� �̸����� 3.011592�� �ʱ�ȭ�� ���� ���
	
	// ���� �������� �Ű� ������ �޴� �����ڸ� �ۼ�
	Circle(double radius) {
		this.radius = radius;
	}
	// �Ű� ������ ���� �����ڷμ� ���� �������� 0.0���� �����Ѵ�.
	Circle() {
		double radius = 0.0;
	}
	
	// ������ �޼ҵ��� setRadius()�� �ۼ��Ѵ�.
	void setRadius(double radius) {
		this.radius = radius;
	}
	// ������ �޼ҵ��� getRadius()�� �ۼ��Ѵ�.
	double getRadius() {
		return radius;
	}
	// double ���� ���� �����Ͽ� ��ȯ�ϴ� square() �޼ҵ带 ����޼ҵ�� �����Ѵ�.
	private double square(double num) {
		return num*num;
	}
	// ���� ������ ����ϴ� getArea() �޼ҵ带 �ۼ��Ѵ�.
	double getArea() {
		return this.square(radius) * PI;
	}
	// ���� �ѷ��� ����ϴ� getPerimeter() �޼ҵ带 �ۼ��Ѵ�.
	double getPerimeter() {
		return radius * 2 * PI;
	}
	// PI ���� ��ȯ�ϴ� ���� �޼ҵ� getPI() �޼ҵ带 �ۼ��Ѵ�.
	static double getPI() {
		return PI;
	}
}

	
	