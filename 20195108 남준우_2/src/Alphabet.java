import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >>");
		
		String s = scanner.next();
		char c = s.charAt(0);
		int d = s.length();
		if(d==1 && Character.isUpperCase(c)==true )
			System.out.print("�ҹ��ڸ� �Է��Ͻÿ�");
		
		else if (d==1 && Character.isLowerCase(c)==true) {
			for(int i=0; i<c; i++){
					for(char z ='a'; z<(c-i+1); z++)
					System.out.print(z);
					System.out.println();
			}
		}
				else
					System.out.print("���ĺ� �ϳ��� �Է��ؾ��մϴ�");	
	}

}
