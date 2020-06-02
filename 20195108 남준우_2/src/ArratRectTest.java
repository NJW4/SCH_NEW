import java.util.Scanner;
public class ArratRectTest {
	int x ,y,w,h;
	int square;
	void Arra () {
		System.out.print("("+ x  + "," + y +") 에서 크기가 " + w + "x" + h +"인 사각형의 면적: " + square);
		}
	public ArratRectTest(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.square = w*h; 
	}
	public static void main(String[] args) {
		
		int i,j;
		int[][] AA = new int [3][4];
		int sum=0;
		int aaa[]= new int [3];
		int bbb[]= new int [3];
		int ccc[]= new int [3];
		int ddd[]= new int [3];
				
		for(i=0; i<AA.length; i++) {
			System.out.print(i+1 + "번째 x, y, width, height 값을 입력하세요.(각 값은 스페이스로 구분) :" );
			Scanner scanner = new Scanner(System.in);
			aaa[i] = scanner.nextInt();
			bbb[i] = scanner.nextInt();
			ccc[i] = scanner.nextInt();
			ddd[i] =scanner.nextInt();
			}
			ArratRectTest r= new ArratRectTest(aaa[0], bbb[0], ccc[0], ddd[0]);
			ArratRectTest s= new ArratRectTest(aaa[1], bbb[1], ccc[1], ddd[1]);
			ArratRectTest t= new ArratRectTest(aaa[2], bbb[2], ccc[2], ddd[2]);
			r.Arra();
			System.out.println();
			s.Arra();
			System.out.println();
			t.Arra();
			System.out.println();
		sum = r.square + s.square + t.square;
		System.out.print("전체 면젹의합:" + sum);		
}
}