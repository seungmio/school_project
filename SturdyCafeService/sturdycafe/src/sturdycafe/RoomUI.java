package sturdycafe;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

public class RoomUI {
	static class WriteFile {
		int count = 0;
		
		public Room[] readRoomFile(File file) throws IOException{
			FileReader filereader = null;
			Room[] roomArray = new Room[100];
			
			try {
				filereader = new FileReader(file);
				//���Ͽ��� �о�� ������ �迭�� �����Ѵ�.
				roomArray = readRoom(filereader);
			}finally {
				if(filereader != null) {filereader.close();}
			}
			return roomArray;
		}
		
		public int readRoomNumFile(File file) throws IOException {
			FileReader filereader = null;
			int roomNum = 0;
			
			try {
				filereader = new FileReader(file);
				//���Ͽ��� �о�� ������ �����Ѵ�.
				roomNum = readRoomNum(filereader);
			}finally {
				if(filereader != null) {filereader.close();}
			}
			return roomNum;
		}
		
		public int readIncomeFile(File file) throws IOException {
			FileReader filereader = null;
			int income = 0;
			
			try {
				filereader = new FileReader(file);
				//���Ͽ��� �о�� ������ �����Ѵ�.
				income = readIncome(filereader);
			}finally {
				if(filereader != null) {filereader.close();}
			}
			return income;
		}
		
		public void writeIncome(int income) {
			OutputStream outIncome = null;
			try {
				File outFile = new File("income.txt");
				
				if (outFile.exists()) {
					outFile.delete();
				}
				
				outIncome = new BufferedOutputStream(new FileOutputStream(outFile));
				//������ String���� �����´�.
				String Income = String.valueOf(income);
				
				byte[] rn = Income.getBytes();
				
				outIncome.write(rn);
				
			} catch (IOException ioe) {
				System.out.println("Print File error");
			} finally {
				try {
					if (outIncome != null) {outIncome.close();}
				} catch (Exception e) {					
				}
			}
			
		}
		
		public void writeRoomNum(int roomsNum) {
			OutputStream outRoomNum = null;
			try {
				File outFile = new File("roomNumInfo.txt");
				
				if (outFile.exists()) {
					outFile.delete();
				}
				
				outRoomNum = new BufferedOutputStream(new FileOutputStream(outFile));
				//�� ������ String���� �����´�.
				String roomNum = String.valueOf(roomsNum);
				
				byte[] rn = roomNum.getBytes();
				
				outRoomNum.write(rn);
				
			} catch (IOException ioe) {
				System.out.println("Print File error");
			} finally {
				try {
					if (outRoomNum != null) {outRoomNum.close();}
				} catch (Exception e) {					
				}
			}
			
		}

		public void writeRoom(int roomsNum, Room[] roomArray) {
			OutputStream outRoomInfo = null;
			try {
				outRoomInfo = new BufferedOutputStream(new FileOutputStream("RoomInfo.txt"));
				
				for(int idx=0; idx < roomsNum; idx++) {
					//RoomArray���� �� ����, ���������� �����´�.
					String roomInfo = roomArray[idx].getMax()+","+roomArray[idx].getRoomName()+","+roomArray[idx].getUnitPrice()+","+roomArray[idx].getRoomFull()
							+","+roomArray[idx].getCustomer().getName()+","+roomArray[idx].getCustomer().getPhoneNum()+"\n";
					
					byte[] r = roomInfo.getBytes();
	            
					//���Ͽ� �ش� ������ ����.
					outRoomInfo.write(r);
				}
			} catch (IOException ioe) {
				System.out.println("Print File error");
			} finally {
			try {
				outRoomInfo.close();
	        } catch (Exception e) {
	        }
		}	
	}
	public Room[] readRoom(Reader input) throws IOException{
		try {
			//���� ������ �о���� BufferReader ��ü�� �����Ѵ�.
			BufferedReader in = new BufferedReader(input);
			String line;
			Room[] roomArray = new Room[100];
			
			while((line = in.readLine()) != null) {
				//,�� split�Ͽ� �迭�� �����Ѵ�.
				String[] writeStr = line.split(",");
				//��� ������ ����Ǿ� ���� �ʴٸ� skip�Ѵ�.
				if(writeStr.length != 6) {continue;}
				
				Room roomInfo = new Room();
				roomInfo.setMax(Integer.parseInt(writeStr[0]));
				roomInfo.setRoomName(writeStr[1]);
				roomInfo.setUnitPrice(Integer.parseInt(writeStr[2]));
				roomInfo.setRoomFull(Boolean.valueOf(writeStr[3]));
				roomInfo.getCustomer().setName(writeStr[4]);
				roomInfo.getCustomer().setPhoneNumber(writeStr[5]);
				
				roomArray[count++] = roomInfo;
			}
			return roomArray;
		}finally {
			input.close();
		}
	}
	
	public int readRoomNum(Reader input) throws IOException{
		try {
			//���� ������ �о���� BufferReader ��ü�� �����Ѵ�.
			BufferedReader in = new BufferedReader(input);
			String line = in.readLine();
			int roomNum = Integer.parseInt(line);
			
			return roomNum;
		}finally {
			input.close();
		}
	}
	
	public int readIncome(Reader input) throws IOException{
		try {
			//���� ������ �о���� BufferReader ��ü�� �����Ѵ�.
			BufferedReader in = new BufferedReader(input);
			String line = in.readLine();
			int income = Integer.parseInt(line);
			
			return income;
		}finally {
			input.close();
		}
	}
}
	
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		WriteFile file = new WriteFile();
		
		File roomInfo = new File("RoomInfo.txt");
		try {
			manager.setRoomArray(file.readRoomFile(roomInfo));
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		File roomNumInfo = new File("RoomNumInfo.txt");
		try {
			manager.setRoomsNum(file.readRoomNumFile(roomNumInfo));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File income = new File("income.txt");
		try {
			manager.setIncome(file.readIncomeFile(income));
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		//Scanner
		Scanner scan = new Scanner(System.in);
		
		
		//while�� Ż�� ���� ����
		boolean play = true;
		
		while(play) {
			
			//�մ�, �Ŵ��� ����
			System.out.println("-----Sturdycafe-----");
			System.out.println("1. customer");
			System.out.println("2. manager");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			//customer ���
			case 1:
				System.out.println("-----Use Sturdycafe-----");
				System.out.println("1. Search empty Room");
				System.out.println("2. Check-In");
				System.out.println("3. Check-Out");
				
				int customerChoice = scan.nextInt();
				
				switch(customerChoice) {
				case 1:	//�� �� ã��
					System.out.println("-----Empty Room-----");
					manager.searchEmptyRoom();
					Room[] emptyRoom = manager.searchEmptyRoom();
					System.out.println("Name\t"
							+ "Max\t"
							+ "UnitPrice\t");
					for (int i = 0; i < emptyRoom.length; i++) {
						if(emptyRoom[i] == null) {break;}
						else {
							System.out.println(emptyRoom[i].getRoomName()+"\t"+emptyRoom[i].getMax()+"\t"+emptyRoom[i].getUnitPrice());
						}
					}
					break;
				case 2:	//üũ��
					System.out.println("-----Check In-----");
					try {
						System.out.println("Enter room name : ");
						String roomName = scan.next();
						System.out.println("Enter name : ");
						String name = scan.next();
						System.out.println("Enter phonenum : ");
						String phonenum = scan.next();
						manager.checkIn(roomName, name, phonenum);
						System.out.println("Check In : "+manager.timeCheckIn);
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:	//üũ�ƿ�
					System.out.println("-----Check Out-----");
					try {
						System.out.println("Enter room name : ");
						String roomName = scan.next();
						manager.checkOut(roomName);
						System.out.println("Usage fee : "+manager.pay(roomName));
	//					System.out.println("Enter phonenum : ");
	//					String phonenum = scan.next();
						System.out.println("Check out : "+manager.timeCheckOut);
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("Wrong choice. Choose again.");
					break;
				}
				break;
			//manager ���
			case 2:
				System.out.println("-----Manage Sturdycafe-----");
				System.out.println("1. Make room");
				System.out.println("2. Delete room");
				System.out.println("3. All room");
				System.out.println("4. exit");
				
				int managerChoice = scan.nextInt();
				
				switch(managerChoice) {
				case 1:	//�� ����
					System.out.println("-----Make Room-----");
					int max = 0, unitPrice = 0;
					String roomName = null;
					boolean isfull = false;
					
					System.out.println("-----Room Info-----");
					System.out.println("Max people : ");
					max = scan.nextInt();
					System.out.println("Room name : ");
					roomName = scan.next();
					System.out.println("Unit price : ");
					unitPrice = scan.nextInt();
					
					manager.createRoom(max, roomName, unitPrice, isfull);
					break;
				case 2:	//�� ����
					System.out.println("-----Delete Room-----");
					try {
						System.out.println("Delete Room name : ");
						roomName = scan.next();
						
						manager.deleteRoom(roomName);
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:	//��� �� ����
					System.out.println("-----All room-----");
					manager.showRoom();
					Room[] allRoom = manager.showRoom();
					System.out.println("Name\t"
							+ "Max\t"
							+ "UnitPrice\t"
							+ "Full");
					for (int i = 0; i < allRoom.length; i++) {
						if(allRoom[i] == null) {break;}
						else {
							System.out.println(allRoom[i].getRoomName()+"\t"+allRoom[i].getMax()+"\t"+allRoom[i].getUnitPrice()+"\t\t"+allRoom[i].getRoomFull());
						}
					}
					break;
				case 4: //Ż��
					play = false;
					break;
				default :
					System.out.println("Choose again");
					break;
				}
				break;
			}
		}
		WriteFile roominfo = new WriteFile();
		
		roominfo.writeRoom(manager.getRoomsNum(), manager.getRoomArray());
		roominfo.writeRoomNum(manager.getRoomsNum());
		roominfo.writeIncome(manager.getIncome());
		
	}
	
}
