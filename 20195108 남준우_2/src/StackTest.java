import java.util.Scanner;
interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push();
}
class StringStack implements Stack{

	public int length() {
		int length;
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		length= scanner.nextInt();
		if(length !=0)
		capacity();
		
		return 0;
	}


	public int capacity() {
		Scanner scanner = new Scanner(System.in);
		String a[] = new String[length()];
		System.out.print(capacity()  + " ");
			for(int i=0; i<length(); i++) {
				System.out.print("���ڿ� �Է� >>");
			String capacity = scanner.next();
			capacity =  a[i];
			if(i>length())
				pop();
		}
		return 0;
	}


	public String pop() {
		System.out.print("������ ������ Ǫ�� �Ұ�! \n ���ڿ� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		String pop = scanner.next();
		if(pop.contentEquals("�׸�")) {
			push();
		}		
		return null;
	}


	public boolean push() {
	int j;
	System.out.print("������ ��� ���ڿ� ��:");
		for(j=length(); j>0;  j--)
		System.out.print(capacity()  + " ");
		return false;
	}
}
public class StackTest {

	public static void main(String[] args) {
	
		StringStack s = new StringStack();
		s.length();
		s.capacity();	
	}

}
