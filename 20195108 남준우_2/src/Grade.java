import java.util.Scanner;
public class Grade {
	private double average;	
private Grade(int a, int b, int c, int d, int e) {
 this.average = (a+b+c+d+e)/5;

}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Java 프로그래밍:");
		int a = scanner.nextInt();
		
		System.out.print("확률과 통계:");
		int b = scanner.nextInt();
		
		System.out.print("컴퓨터 구조:");
		int c = scanner.nextInt();
		
		System.out.print("데이터 베이스:");
		int d = scanner.nextInt();
		
		System.out.print("의학용어:");
		int e = scanner.nextInt();
		
	Grade me = new Grade(a, b, c, d, e);
		
		System.out.print("평균은 " + me.average);
		scanner.close();
	}
}
