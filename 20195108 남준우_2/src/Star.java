import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
	int i,j;
	System.out.print("������ �Է��Ͻÿ�>>");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	if(a <= 0)
		System.out.print("0���� Ŀ���մϴ�");
	
	else {
	for(j=0; j<a; j++) {
		System.out.print("\n");
	for(i=0; i<a-j; i++)
		System.out.print("*");
	}
	}
		
		
		
	}

}
