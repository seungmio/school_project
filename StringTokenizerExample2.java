import java.util.StringTokenizer;
import java.util.Arrays;

class StringTokenizerExample2 {
	public static void main(String args[]) {
		String arr = Arrays.toString(args);	//args[] 배열을 문자열로 바꾼다.

		StringTokenizer stok = new StringTokenizer(arr);	//toString한 args[] 배열로 String 객체를 생성한다.

		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			//toString이 [요소,요소,...] 로 출력되기 때문에 이를 없애기 위해 String class에 있는 replace 메소드를 사용한다.
			str = str.replace("[","");	
			str = str.replace(",","");
			str = str.replace("]","");
			System.out.println(str);
			
		}
	}
}