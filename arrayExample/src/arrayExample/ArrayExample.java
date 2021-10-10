package arrayExample;
//ArrayList Ŭ������ ����ϱ� ���� ��Ű���� import �Ͻÿ�.
import java.util.*;

public class ArrayExample {
	public static void main(String[] args) {
		//���ڿ����� ArrayList �� list ������ �����ϰ� ��ü�� �����Ͻÿ�.
		ArrayList<String> list = new ArrayList<String>();
		//����Ʈ�� �����͸� �߰��մϴ�.
		list.add("��");
		list.add("����");
		list.add("�䳢");
		list.add("��");
	
		System.out.println("�Է��� ������ ����մϴ�....");
		printInfo(list);
	
		System.out.println("���ڸ� ȣ���̷� �����մϴ�....");
		//���ڸ� �˻��ؼ� ȣ���̷� �����ϴ� ������ �ۼ��Ͻÿ�.
		int index1 = list.indexOf("����");
		list.set(index1, "ȣ����");
		printInfo(list);

		System.out.println("3��° �׸� �����̸� ÷���մϴ�....");
		//3��° �׸� �����̸� ÷���ϴ� ������ �ۼ��Ͻÿ�.
		list.add(2, "������");
		printInfo(list);
	
		System.out.println("���� �˻��Ͽ� �����մϴ�.....");
		//���� �˻��Ͽ� �����մϴ�.
		int index2 = list.indexOf("��");
		list.remove(index2);
		printInfo(list);
	}
	
	//ArrayList���� list �� �Է¹޾� �Ը���� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
	public static void printInfo(ArrayList<String> list) {
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}