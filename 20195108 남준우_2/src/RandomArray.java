import java.util.Random;
import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
	int i;
	double total=0;
	double ev;
	
	int c[] = new int[10];
	
		Random r = new Random();
		System.out.print("·£´ýÇÑ Á¤¼öµé:");
		
		for(i=0; i<10; i++) {
		c[i] = r.nextInt(100)+1;
		System.out.print(c[i] + " ");
		total +=c[i];
		}
		ev = total/10;
	System.out.print("\n Æò±ÕÀº:" + ev);
		
	}

}
