import java.util.*;
public class No3 {

	public static void main(String[] args) {
		int a;
		String b;
		Scanner s = new Scanner(System.in);
		System.out.print("숫자입력: ");
		a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.print("월요일 ");
			break;
		
		case 2:
			System.out.print("화요일 ");
			break;
			
		case 3:
			System.out.print("수요일 ");
			break;
			
		case 4:
			System.out.print("목요일 ");
			break;
			
		case 5:
			System.out.print("금요일 ");
			break;
			
		case 6:
			System.out.print("토요일 ");
			break;
			
		case 7:
			System.out.print("일요일 ");
			break;
		}
	}

}
