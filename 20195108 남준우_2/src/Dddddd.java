import java.util.Calendar;
public class Dddddd {

	public static void main(String[] args) {
		Calendar n = Calendar.getInstance();
		int h  = n.get(Calendar.HOUR_OF_DAY);
		int m = n.get(Calendar.MINUTE);
		System.out.println("현재 시간은 " + h + "시 " + m + "분입니다.");
		
		if(h > 4 && h < 12) 
			System.out.println("Good Morning");
		
		else if(h >= 12 && h < 18) 
			System.out.println("Good Afternoon");
		
		else if(h >= 18 && h < 22) 
			System.out.println("Good Evening");
		
		else
			System.out.println("Good Night");

	}

}
