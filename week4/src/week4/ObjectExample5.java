package week4;
import java.util.GregorianCalendar;

class ObjectExample5 {
	public static void main(String args[]) {
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2 = new GregorianCalendar(2007, 0, 1);
		
		if (obj1.equals(obj2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}
}
