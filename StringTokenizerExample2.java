import java.util.StringTokenizer;
import java.util.Arrays;

class StringTokenizerExample2 {
	public static void main(String args[]) {
		String arr = Arrays.toString(args);	//args[] �迭�� ���ڿ��� �ٲ۴�.

		StringTokenizer stok = new StringTokenizer(arr);	//toString�� args[] �迭�� String ��ü�� �����Ѵ�.

		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			//toString�� [���,���,...] �� ��µǱ� ������ �̸� ���ֱ� ���� String class�� �ִ� replace �޼ҵ带 ����Ѵ�.
			str = str.replace("[","");	
			str = str.replace(",","");
			str = str.replace("]","");
			System.out.println(str);
			
		}
	}
}