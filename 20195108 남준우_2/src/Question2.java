import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
	
		int testDate;
		int dDate;
		int yDate;
		Scanner s = new Scanner(System.in);
		System.out.print("���Ǽ� �Է� >>");
		testDate = s.nextInt();
		yDate = testDate/(60*24*365);
		dDate = testDate%(60*24*365)/(24*60);
		System.out.print(testDate + "���� ��"+ yDate + "��" + dDate+"��" );
		
	}

}
