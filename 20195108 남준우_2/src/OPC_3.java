import java.util.Scanner;
import java.util.Random;

public class OPC_3 {
public static void main(String[] args) {
		
		Random r = new Random();
		while(true) {
			
		int c = r.nextInt(100);
		
		System.out.print("���� �����Ͽ����ϴ� ���߾� ������>> \n");
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
				System.out.print("�� ���� \n");
				System.out.print(min +"-" + max +"\n" );
		 }
		 	
		 else if(a>c) {
			 max=a;
			System.out.print("�� ���� \n");
			System.out.print(min +"-" + max +"\n");
		 }
		 else 
			 break;
			}
		}
			System.out.print("�¾ҽ��ϴ�.");
			
			
			
			System.out.print("�ٽ��Ͻðڽ��ϱ�?(y/n) >>");
			String text = scanner.next();
			
			if(text.contentEquals("n"))
				break;
			
		}
		}
	}

