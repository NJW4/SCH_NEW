import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
	
		int testDate;
		int dDate;
		int yDate;
		Scanner s = new Scanner(System.in);
		System.out.print("분의수 입력 >>");
		testDate = s.nextInt();
		yDate = testDate/(60*24*365);
		dDate = testDate%(60*24*365)/(24*60);
		System.out.print(testDate + "분은 약"+ yDate + "년" + dDate+"일" );
		
	}

}
