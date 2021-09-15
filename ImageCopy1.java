package imagecopy;
import java.io.*;

class ImageCopy1 {
	public static void main(String args[]) {
		if (args.length < 1) {	//�Է¹��� ������ ���� ���
			System.out.println("Usage: java FileDump <filename>");
			return;
		}
		FileInputStream in = null;
		FileOutputStream out = null;
		
		//���۽ð�
		long start = System.currentTimeMillis();
		
		try {
			//file open
			in = new FileInputStream(args[0]);
			out = new FileOutputStream("output.jpg");
			
			//������ ������ byte ������ �о�´�.
			//�о ������ ���� byte �迭 ����
			byte arr[] = new byte[16];

			while (true) {
				//������ �а� ũ�⸦ num�� �����Ѵ�.
				int num = in.read(arr);
				//���� ������ �� �о��ٸ�,
				if (num < 0)
					//�����Ѵ�.
					break;
				//���� ������ ������ ���Ͽ� ����.
				for (int cnt = 0; cnt < num; cnt ++)
					out.write(arr[cnt]);
			}
		}
		catch (FileNotFoundException fnfe) {	//������ �������� ���� ���
			System.out.println(args[0] + " ������ �������� �ʽ��ϴ�.");
		}
		catch (IOException ioe) {	//���� ������� �Ұ����� ���
			System.out.println(args[0] + " ������ ���� �� �����ϴ�.");
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
		
		//����ð�
		long end = System.currentTimeMillis();
		System.out.println("�Էº��� ��±����� ����ð� : " + (end - start) / 1000.0);
	}
}
