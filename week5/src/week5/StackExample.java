package week5;
import java.util.*;

class StackExample1 {
	public static void main(String args[]) {
		//�������� ����� LinkedList ��ü�� ����
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		//args���� data�� �Է¹޾� ���ÿ� �߰�
		for (int i = 0; i < args.length; i++) {
			stack.addLast(new Integer(args[i]));
		}
		//������ ���鼭 ������ �����͸� ��� �����ͼ� ���
		while(!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
		}
	}
}

