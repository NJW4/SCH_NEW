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
		System.out.print("총 스택 저장 공간의 크기 입력>>");
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
				System.out.print("문자열 입력 >>");
			String capacity = scanner.next();
			capacity =  a[i];
			if(i>length())
				pop();
		}
		return 0;
	}


	public String pop() {
		System.out.print("스택이 꽉차서 푸시 불가! \n 문자열 입력>>");
		Scanner scanner = new Scanner(System.in);
		String pop = scanner.next();
		if(pop.contentEquals("그만")) {
			push();
		}		
		return null;
	}


	public boolean push() {
	int j;
	System.out.print("스택의 모든 문자열 팜:");
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
