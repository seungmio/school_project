import java.io.*;

public class Copychar {
	public static void main(String[] args) throws IOException{
		FileReader fr = null;	//원본 파일
		FileWriter fw = null;	//복사 파일
		int data = 0;	//원본 파일 내용 변수
		
		//1.입력받은 파일이 없을 경우
		if(args.length == 0) {
			System.out.println("입력받은 파일이 없습니다.");
			System.exit(0);
		}
		
		File file = new File(args[0]);	//a.txt 복사할 파일
		File copyfile = new File(args[1]);	//b.txt 복사 내용이 들어갈 파일
		
		//2.입력받은 파일이 있을 경우
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				fw = new FileWriter(copyfile);

				while(true) {	//파일 내용 복사
					data = fr.read();
					if(data < 0) { break; }
					System.out.println((char)data);
					fw.write((char)data);
				}
				System.out.println();	//파일 내용 출력
				
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