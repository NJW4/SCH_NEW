import java.util.Scanner;

public class Member {
String name,phone,email,book;

public Member() {
}

	class MemberTest{
	
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο��� >>");
		int a = scanner.nextInt();
		int i;
		String name[] = new String[a];
		String phone[] = new String[a]; 
		String email[] = new String[a];
		String book[] = new String[a];
		for(i=0; i<a; i++) {
			System.out.print("�̸� ��ȭ��ȣ �̸��� å(�̸�,��ȭ��ȣ,�̸���, å�� �� ĭ���� �Է�)>>");
			name[i] = scanner.next();
			phone[i]= scanner.next();
			email[i]= scanner.next();
			book[i]= scanner.next();
			
			if(email[i].contains("@")) {
				System.out.print("��� �����Ͽ����ϴ�");
			}
				else
					System.out.print("�����մϴ�. �̸��� �ּҸ� Ȯ���ϰ� ��� ���� �ٽ� �Է��ϼ���.");
					
				}
		System.out.println();
		String A = "abc"; 
		int j =0;
		
		while(A.equals("exit")== false) {
			System.out.print("�˻��� �̸�>>");
			A = scanner.next();
			j =0;
				while(A.equals(name[j]) == false) {
					if(A.equals("exit")) {
						System.exit(0);
				}
					else 
						j++;
				}
				
				System.out.print(name[j] + "�� ��ȣ�� " + phone[j] + "�Դϴ�.");
				System.out.println();
				}
		
		System.exit(0);
	}
	
}

