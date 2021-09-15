package imagecopy;
import java.io.*;

class ImageCopy1 {
	public static void main(String args[]) {
		if (args.length < 1) {	//입력받은 파일이 없을 경우
			System.out.println("Usage: java FileDump <filename>");
			return;
		}
		FileInputStream in = null;
		FileOutputStream out = null;
		
		//시작시간
		long start = System.currentTimeMillis();
		
		try {
			//file open
			in = new FileInputStream(args[0]);
			out = new FileOutputStream("output.jpg");
			
			//파일의 내용을 byte 단위로 읽어온다.
			//읽어서 저장할 버퍼 byte 배열 설정
			byte arr[] = new byte[16];

			while (true) {
				//파일을 읽고 크기를 num에 저장한다.
				int num = in.read(arr);
				//만약 파일을 다 읽었다면,
				if (num < 0)
					//중지한다.
					break;
				//읽은 파일을 생성된 파일에 쓴다.
				for (int cnt = 0; cnt < num; cnt ++)
					out.write(arr[cnt]);
			}
		}
		catch (FileNotFoundException fnfe) {	//파일이 존재하지 않을 경우
			System.out.println(args[0] + " 파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) {	//파일 입출력이 불가능할 경우
			System.out.println(args[0] + " 파일을 읽을 수 없습니다.");
		}	
		finally {
			try {
				//file close
				in.close();
				out.close();
			}
			catch (Exception e) {
			}
		}
		
		//종료시간
		long end = System.currentTimeMillis();
		System.out.println("입력부터 출력까지의 실행시간 : " + (end - start) / 1000.0);
	}
}
