package sturdycafe;
import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInterface {
	public static void main(String[] args) {
		boolean play = true;	//while문을 탈출하기 위한 boolean type 변수
		//1. 손님인지 관리자인지 확인하고 입력받는다.
		String checkMsg = "1. 손님\n"
				+ "2. 관리자\n"
				+ "번호를 입력하세요 : ";
		int choiceWho = 0;	// 지위 확인
		//2-1. 사용자가 관리자 모드를 선택하면 보여주고 입력받는다.
		String managerMsg = "1. 방 생성하기\n"
				+ "2. 방 삭제하기\n"
				+ "3. *인용 빈 방 찾기\n"
				+ "4.종료\n번호를 입력하세요 : ";	
		int managerChoice = 0;
		// 몇 인용을 선택할 것인지 보여주고 입력받는다.
		String roomNumMsg = "1. 1인용 2. 4인용 3. 6인용\n"
				+ "번호를 입력하세요 : ";
		int roomNum = 0;	//인용 방을 입력받기 위한 변수
		// 관리자가 방 삭제를 선택하면 몇 번 방(1인용:100~/4인용:400~/6인용:600~)을 삭제할 것인지 보여주고 입력받는다.
		String deleteMsg = "삭제할 방의 호수를 입력하세요 : ";
		int deleteRoom = 0;	//삭제할 방 번호
		
		//2-2. 사용자가 손님 모드를 선택하면 보여주고 입력받는다.
		String customerMsg = "1. 체크인\n2. 체크아웃\n번호를 입력하세요 : ";
		int check = 0;
		
		//손님이 체크인을 선택한 경우,
		String roomChoiceMsg = "체크인 할 방의 호수를 입력하세요 : ";
		int roomChoice = 0;
		String nameMsg = "예약자 이름 : ";
		String phonenumMsg = "예약자 전화번호 : ";
		String name = null;
		String phonenum = null;
		
		//손님이 체크아웃을 선택한 경우,
		String roomOutMsg = "체크아웃 할 방의 호수를 입력하세요 : ";
		String checkOutMsg = "체크인 시에 입력했던 전화번호를 입력하세요 : ";
		
		//사용자가 주어진 조건 외를 입력했을 경우 보여지는 메세지
		String wrongMsg = "잘못 누르셨습니다.\n";
				
		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		//2. 1번을 입력하면 손님용 입출력문을, 2번을 입력하면 관리자용 입출력문을 보여준다.
		//만약 사용자가 1,2 외 숫자를 입력하면 "잘못 누르셨습니다." 와 함께 처음으로 이동한다.
		while(play) {
			System.out.println(checkMsg);
			choiceWho = scan.nextInt();
			
			switch(choiceWho) {
			case 1 :	//손님용
				System.out.println(customerMsg);
				check = scan.nextInt();
	
				switch(check) {
				case 1:	//체크인
					try {
						System.out.println(roomNumMsg);
						roomNum = scan.nextInt();
						System.out.println(roomChoiceMsg);
						roomChoice = scan.nextInt();
						System.out.println(nameMsg);
						name = scan.next();
						System.out.println(phonenumMsg);
						phonenum = scan.next();
						manager.checkIn(roomNum, roomChoice, name, phonenum);
						if(manager.checkIn(roomNum, roomChoice, name, phonenum) == false) {
							System.out.println("체크인이 불가능합니다.");
						}
						else if(roomNum == 1) {System.out.println(manager.roomFor1[roomChoice-100].checkInTime+"에 체크인 하셨습니다.");}
						else if(roomNum == 2) {System.out.println(manager.roomFor4[roomChoice-400].checkInTime+"에 체크인 하셨습니다.");}
						else if(roomNum == 3) {System.out.println(manager.roomFor6[roomChoice-600].checkInTime+"에 체크인 하셨습니다.");}
					}catch(NullPointerException n) {
						System.out.println("체크인이 불가능합니다.");
					}
					break;
				case 2: //체크아웃
					System.out.println(roomNumMsg);
					roomNum = scan.nextInt();
					System.out.println(roomOutMsg);
					roomChoice = scan.nextInt();
					System.out.println(checkOutMsg);
					phonenum = scan.next();
					break;
				default :
					break;
				}
				break;	
			case 2:		//관리자용
				System.out.println(managerMsg);
				managerChoice = scan.nextInt();
				
				switch(managerChoice) {
				case 1 :	//방추가
					System.out.println(roomNumMsg);
					roomNum = scan.nextInt();
					manager.plusRoom(roomNum);
					break;
				case 2 :	//방삭제
					try {
						System.out.println(roomNumMsg);
						roomNum = scan.nextInt();
						System.out.println(deleteMsg);
						deleteRoom = scan.nextInt();
						manager.deleteRoom(roomNum, deleteRoom);
					}catch(RuntimeException e) {
						System.out.println("방이 생성되지 않았습니다.");
					}
					break;
				case 3:	//빈방보기
					System.out.println(roomNumMsg);
					roomNum = scan.nextInt();
					
					if(manager.findEmptyRoom(roomNum) == null) { System.out.println(wrongMsg); }
					else { System.out.println("비어있는 방 : "+manager.findEmptyRoom(roomNum)); }
					
					break;
				case 4:	//종료
					play = false;
					break;
				default :
					System.out.println(wrongMsg);
					break;
				}				
				break;
			default :
				System.out.println(wrongMsg);
				break;
			}
		}
	}
}


