package week5;
import java.util.*;

class QueueExample1 {
	public static void main(String args[]) {
		//큐로 사용할 LinkenList 객체 생성
		LinkedList<String> queue = new LinkedList<String>();
		
		//args에서 data를 입력받아 큐에 추가
		for (int i = 0; i < args.length; i++) {
			queue.offer(args[i]);
		}
		//iterator 메소드를 호출하여 Iterator 객체를 얻는다.
		//Iterator 객체를 이용하여 큐에 있는 데이터를 순서대로 가져와서 출력합니다.
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}

