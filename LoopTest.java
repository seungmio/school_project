public class LoopTest {
	public static void main(String[] args) {
		forTest(); //for���� ����ϴ� �޼��� ȣ��
		whileTest(); //while���� ����ϴ� �޼��� ȣ��
		dowhileTest(); //do-while���� ����ϴ� �޼��� ȣ��
	}
	public static void forTest() { 		//for���� ����ϴ� �޼���
		int sum, i;		//���� ����
		System.out.println("for�� �̿�");
		for(sum=0, i=1; i<100; i++) {
			if(i%2==0) continue;
			sum+=i;
		}
		System.out.printf("\tsum = %d%n", sum);
	}
	public static void whileTest() {	//while���� ����ϴ� �޼���
		int sum=0, i=0;		//���� ����
		System.out.println("while�� �̿�");
		while(i<100) {
			i++;
			if(i%2==0) continue;
			sum+=i;
		}
		System.out.printf("\tsum = %d%n", sum);
	}
	public static void dowhileTest() {	//do-while���� ����ϴ� �޼���
		int sum=0, i=0;
		System.out.println("do-while�� �̿�");
		do {
			i++;
			if(i%2==0) continue;
			sum+=i;
		}while(i<100);
		System.out.printf("\tsum = %d%n", sum);
	}
}

