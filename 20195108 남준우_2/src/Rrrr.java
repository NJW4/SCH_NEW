import java.util.*;
class Word {
  private String english;
  private String korean;
  public Word(String english, String korean) { 
    this.english = english; 
    this.korean = korean; 
 } 
  
 public String getEnglish() { return english; } 
 public String getKorean() { return korean; } 
} 

public class Rrrr{ 
  private Vector<Word> v; 
  public Rrrr() { 
    v = new Vector<Word>(); 
    v.add(new Word("love", "���")); 
    v.add(new Word("animal", "����")); 
    v.add(new Word("emotion", "����")); 
    v.add(new Word("human", "�ΰ�")); 
    v.add(new Word("stock", "�ֽ�")); 
    v.add(new Word("trade", "�ŷ�")); 
    v.add(new Word("society", "��ȸ")); 
    v.add(new Word("baby", "�Ʊ�")); 
    v.add(new Word("honey", "��")); 
    v.add(new Word("doll", "����")); 
    v.add(new Word("bear", "��")); 
    v.add(new Word("picture", "����")); 
    v.add(new Word("painting", "�׸�")); 
    v.add(new Word("fault", "����")); 
    v.add(new Word("example", "����")); 
    v.add(new Word("eye", "��")); 
    v.add(new Word("statue", "������")); 
 } 
 private int makeExample(int ex[], int answerIndex) { 
   int n[] = {-1, -1, -1, -1};
   int index; 
   for(int i=0; i<n.length; i++) { 
     do { 
       index = (int)(Math.random()*v.size()); 
    } while(index == answerIndex || exists(n, index));
    n[i] = index; 
 } 
 for(int i=0; i<n.length; i++) ex[i] = n[i]; 
 return (int)(Math.random()*n.length); 
} 
private boolean exists(int n[], int index) { 
  for(int i=0; i<n.length; i++) { 
    if(n[i] == index) 
    return true; 
 } 
 return false; 
} 
public void run() { 
  Scanner scanner = new Scanner(System.in); 
  System.out.println("\"��ǰ����\"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�."); 
  System.out.println("���� 17���� �ܾ ��� �ֽ��ϴ�.");
  while(true) { 
    int answerIndex = (int)(Math.random()*v.size()); 
    String eng = v.get(answerIndex).getEnglish(); 
    int example[] = new int [4];
    int answerLoc = makeExample(example, answerIndex);
    example[answerLoc] = answerIndex; 
    System.out.println(eng + "?"); 
    for(int i=0; i<example.length; i++) 
    System.out.print("(" + (i+1) + ") " + v.get(example[i]).getKorean() + " ");
    System.out.print(":>");
    try { 
      int in = scanner.nextInt();
      if(in ==-1) { 
        System.out.print("\"��ǰ����\"�� �����մϴ�..."); 
        return;
     } 
     in--;
     if(in == answerLoc) 
     System.out.println("Excellent !!"); 
     else 
     System.out.println("No. !!"); 
  } 
  catch(InputMismatchException e) { 
    scanner.next();
    System.out.print("���α׷��� �����մϴ�..."); 
    return;
 } 
} 
} 
public static void main(String[] args) { 
  Rrrr quiz = new Rrrr(); 
  quiz.run(); 
} 
}
