package week5;
import java.util.*;

class QueueExample1 {
	public static void main(String args[]) {
		//ť�� ����� LinkenList ��ü ����
		LinkedList<String> queue = new LinkedList<String>();
		
		//args���� data�� �Է¹޾� ť�� �߰�
		for (int i = 0; i < args.length; i++) {
			queue.offer(args[i]);
		}
		//iterator �޼ҵ带 ȣ���Ͽ� Iterator ��ü�� ��´�.
		//Iterator ��ü�� �̿��Ͽ� ť�� �ִ� �����͸� ������� �����ͼ� ����մϴ�.
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}

