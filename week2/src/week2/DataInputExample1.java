package week2;
import java.io.*;

class DataInputExample1 {
	public static void main(String args[]) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			while (true) {
				int data = in.readInt();
				System.out.println(data);
			}
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch (EOFException eofe) {
			System.out.println("��");
		}
		catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		finally {
			try {
				in.close();
			}
			catch (Exception e) {
			}
		}
	}
}
