import java.util.Random;
import java.util.Scanner;
public class 연습문제_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		int a [][] = new int [4][4];
		int i,j,n;
		
		for(i=0; i<4; i++) {
			
			for(j=0; j<4; j++) {
				n = r.nextInt(10)+1;
			a[i][j] = n;
			System.out.print(a[i][j] + " ");
			
			}
			System.out.println();
		
		}

	}

}
