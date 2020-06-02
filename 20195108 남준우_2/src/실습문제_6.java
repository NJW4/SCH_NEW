import java.util.Scanner;
public class 실습문제_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오");
		int a = scanner.nextInt();
		int i,m;
		int n[] = {50000,10000,500,100,10,1};
		
		for(i=0; i<n.length; i++)	{
			
			 m = a/n[i];
			if(m !=0)
				System.out.print(n[i] +"원짜리 : " + m +"개 \n");
			a -= n[i]*m;
		}
			
	
	
	}
}
