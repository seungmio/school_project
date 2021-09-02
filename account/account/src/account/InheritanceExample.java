package account;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InheritanceExample {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int money;	// 사용자가 입력한 돈
		boolean play = true;	// 프로그램 종료를 실행시키기 위한 선언
		String cardNum;	// 사용자가 입력한 카드번호
			
		// 계좌번호, 예금주 이름, 잔고, 카드번호 객체 선언
		CheckingAccount obj = new CheckingAccount("000-11-111111", "김선달", 10000, "111-222");
		int choice;
		
		while(play) {
			
			try {
				System.out.println("해당 번호를 누르세요");
				System.out.println("1.저금\n2.인출\n3.카드 지불\n4.종료");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1 :
					System.out.println("저금액 : ");
					money = scan.nextInt();
					obj.deposit(money);
					System.out.println("잔고는 "+obj.balanceInfo()+" 입니다.");
					break;
			
				case 2 :
					try {
						System.out.println("인출액 : ");
						money = scan.nextInt();
						obj.withdraw(money);
						System.out.println("잔고는 "+obj.balanceInfo()+" 입니다.");
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
			
				case 3 :
					try {
						System.out.println("카드 번호 : ");
						cardNum = scan.next();
						System.out.println("카드 지불액 : ");
						money = scan.nextInt();
						obj.pay(cardNum, money);
						System.out.println("잔고는 "+obj.balanceInfo()+" 입니다.");
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
			
				case 4 :
					System.out.println("프로그램 종료");
					play = false;
					break;
				
				default :
					System.out.println("잘못 누르셨습니다.");
					break;
				}	
			}


			catch(InputMismatchException ime) {
				System.out.println("잘못 누르셨습니다.");
				scan.next();
				choice = 0;
				}
			}
		}
}

