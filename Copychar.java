import java.io.*;

public class Copychar {
	public static void main(String[] args) throws IOException{
		FileReader fr = null;	//���� ����
		FileWriter fw = null;	//���� ����
		int data = 0;	//���� ���� ���� ����
		
		//1.�Է¹��� ������ ���� ���
		if(args.length == 0) {
			System.out.println("�Է¹��� ������ �����ϴ�.");
			System.exit(0);
		}
		
		File file = new File(args[0]);	//a.txt ������ ����
		File copyfile = new File(args[1]);	//b.txt ���� ������ �� ����
		
		//2.�Է¹��� ������ ���� ���
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				fw = new FileWriter(copyfile);

				while(true) {	//���� ���� ����
					data = fr.read();
					if(data < 0) { break; }
					System.out.println((char)data);
					fw.write((char)data);
				}
				System.out.println();	//���� ���� ���
				
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					try {
						fr.close();
						fw.close();
					}catch(Exception e) {
			
					}
				}
			}
		}
		
}