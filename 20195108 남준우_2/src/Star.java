import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
	int i,j;
	System.out.print("정수를 입력하시오>>");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	if(a <= 0)
		System.out.print("0보다 커야합니다");
	
	else {
	for(j=0; j<a; j++) {
		System.out.print("\n");
	for(i=0; i<a-j; i++)
		System.out.print("*");
	}
	}
		
		
		
	}

}
