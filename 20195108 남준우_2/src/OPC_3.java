import java.util.Scanner;
import java.util.Random;

public class OPC_3 {
public static void main(String[] args) {
		
		Random r = new Random();
		while(true) {
			
		int c = r.nextInt(100);
		
		System.out.print("수를 결정하였습니다 맞추어 보세요>> \n");
		Scanner scanner = new Scanner(System.in);
		int i,max,min;
		int a=0;
		min= 0;
		max=100;
		
		while(a != c) {
			for(i=1; i<100; i++) {
				System.out.print(i+".");
				a = scanner.nextInt();
			
		 if(a<c) {
			 min=a;
				System.out.print("더 높게 \n");
				System.out.print(min +"-" + max +"\n" );
		 }
		 	
		 else if(a>c) {
			 max=a;
			System.out.print("더 낮게 \n");
			System.out.print(min +"-" + max +"\n");
		 }
		 else 
			 break;
			}
		}
			System.out.print("맞았습니다.");
			
			
			
			System.out.print("다시하시겠습니까?(y/n) >>");
			String text = scanner.next();
			
			if(text.contentEquals("n"))
				break;
			
		}
		}
	}

