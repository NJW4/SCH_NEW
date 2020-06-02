import java.util.*;
import java.io.*;
public class Hm {
	private final int hidden = 2;
	private StringBuffer hW;
	private String aaa;
	private Scanner s;
	private int bbb;
	
	public Hm() {
		s = new Scanner(System.in);
	}
	public void run() {
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		Words w = new Words("Word.text");
		while(true) {
			aaa = w.getRandomWord();
			if(aaa==null)
				break;
			makeHidden();
			go();
			System.out.println("NEXT(y/n)?");
			String a = s.next();
			if(a.equals("n"))
				break;
			}
		
	}

	private void makeHidden() {
		hW = new StringBuffer(aaa);
		Random r = new Random();
		for(int i=0; i<hidden; i++) {
			int x = r.nextInt(aaa.length());
			char c = aaa.charAt(x);
			for (int j=0; j<aaa.length(); j++) {
				if(hW.charAt(1) ==c)
					hW.setCharAt(j,'_');
				
				}
			}
		}

	private void go() {
		bbb=0;
		char k;
		do {
			if(bbb==5) {
				System.out.println("5번 실패 하였습니다");
				break;
			}
			System.out.println(hW);	
			System.out.print(">>");
			String t = s.next();
			k = t.charAt(0);
			}
		while(!complete(k));
		System.out.println(aaa);
	}
	
	private boolean complete(char k) {
		boolean hit = false;
		for(int q=0; q<aaa.length(); q++) {
			if(hW.charAt(1) =='_' && aaa.charAt(q) == k) {
				hW.setCharAt(q,k);
				hit = true;
			}
				
		}
		if(!hit)
			bbb++;
		for(int qq=0; qq<aaa.length(); qq++) {
			if(hW.charAt(1) =='_')
				return false;
		}
			return true;	
	}
	
	public static void main(String[] args) {
	Hm h = new Hm();
		h.run();
	}

}

class Words {
	Vector<String> wV = new Vector<String>();
	
	public Words(String FileName) {
		try {
			Scanner s = new Scanner(new FileReader(FileName));
			while(s.hasNext()) {
				String w = s.nextLine();
				wV.add(w);
				
			}
		s.close();
		}
		
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
		
	}
	
public String getRandomWord() {
	final int WordMax = wV.size();
	int x = (int)(Math.random()*WordMax);
	return wV.get(x);
}
}
