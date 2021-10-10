package week5;
import java.util.*;

class StackExample1 {
	public static void main(String args[]) {
		//스택으로 사용할 LinkedList 객체를 생성
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		//args에서 data를 입력받아 스택에 추가
		for (int i = 0; i < args.length; i++) {
			stack.addLast(new Integer(args[i]));
		}
		//루프를 돌면서 스택의 데이터를 모두 가져와서 출력
		while(!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
		}
	}
}

