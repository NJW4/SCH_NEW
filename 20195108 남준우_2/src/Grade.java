import java.util.Scanner;
public class Grade {
	private double average;	
private Grade(int a, int b, int c, int d, int e) {
 this.average = (a+b+c+d+e)/5;

}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Java ���α׷���:");
		int a = scanner.nextInt();
		
		System.out.print("Ȯ���� ���:");
		int b = scanner.nextInt();
		
		System.out.print("��ǻ�� ����:");
		int c = scanner.nextInt();
		
		System.out.print("������ ���̽�:");
		int d = scanner.nextInt();
		
		System.out.print("���п��:");
		int e = scanner.nextInt();
		
	Grade me = new Grade(a, b, c, d, e);
		
		System.out.print("����� " + me.average);
		scanner.close();
	}
}
