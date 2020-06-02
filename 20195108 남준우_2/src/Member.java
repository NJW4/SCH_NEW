import java.util.Scanner;

public class Member {
String name,phone,email,book;

public Member() {
}

	class MemberTest{
	
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수 >>");
		int a = scanner.nextInt();
		int i;
		String name[] = new String[a];
		String phone[] = new String[a]; 
		String email[] = new String[a];
		String book[] = new String[a];
		for(i=0; i<a; i++) {
			System.out.print("이름 전화번호 이메일 책(이름,전화번호,이메일, 책은 빈 칸없이 입력)>>");
			name[i] = scanner.next();
			phone[i]= scanner.next();
			email[i]= scanner.next();
			book[i]= scanner.next();
			
			if(email[i].contains("@")) {
				System.out.print("모두 저장하였습니다");
			}
				else
					System.out.print("종료합니다. 이메일 주소를 확인하고 모든 값을 다시 입력하세요.");
					
				}
		System.out.println();
		String A = "abc"; 
		int j =0;
		
		while(A.equals("exit")== false) {
			System.out.print("검색할 이름>>");
			A = scanner.next();
			j =0;
				while(A.equals(name[j]) == false) {
					if(A.equals("exit")) {
						System.exit(0);
				}
					else 
						j++;
				}
				
				System.out.print(name[j] + "의 번호는 " + phone[j] + "입니다.");
				System.out.println();
				}
		
		System.exit(0);
	}
	
}

