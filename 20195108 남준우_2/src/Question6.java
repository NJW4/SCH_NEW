import java.util.*;
class Student{
private float avgScore;
private float englishScore;
private float koreanScore;
private float mathScore;
private String name;
private float totalScore;

public float avgScoreM()  {
	return totalScore;
}
public float getAvgScore(){
	return totalScore/3;
}
public float getEnglishScore() {
	return englishScore;
}
public float getKoreanScore(){
	return koreanScore;
}
public float getMathScore(){
	return mathScore;
}
public String getName() {
	return  name;
}
public float getTotalScore() {
	return totalScore;
}
public void setEnglishScore(float englishScore){
	this.englishScore = englishScore;
}

public void setKoreanScore(float koreanScore) {
	this.koreanScore=koreanScore;
}
public void setMathScore(float mathScore) {
	this.mathScore=mathScore;
}
public void setName(String name){
	this.name=name;
}
public void totalScoreM(float koreanScore,float mathScore , float englishScore ){
	totalScore = englishScore+koreanScore+mathScore;
}
public void show() {
	System.out.printf(getName()+"\t"+getKoreanScore()+"\t"+getMathScore()+"\t"+getEnglishScore()+"\t"+getTotalScore()+"\t"+"%.1f\n",getAvgScore());
}

}
public class Question6 {

	public static void main(String[] args) {
		String name[] = new String[5];
		float englishScore[] = new float[5];
		float mathScore[] = new float[5];
		float koreanScore[] = new float[5];
		Student[] stu = new Student [5];
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름 국어 수학 영어:(예 문소영 100 100 100형식으로 값을 입력하시오.) ");
		
		for(int i=0; i<5; i++) {
			stu[i] = new Student();
			name[i]=s.next();
			koreanScore[i]=s.nextFloat();
			mathScore[i]=s.nextFloat();
			englishScore[i]=s.nextFloat();
			stu[i].setName(name[i]);
			stu[i].setKoreanScore(koreanScore[i]);
			stu[i].setMathScore(mathScore[i]);
			stu[i].setEnglishScore(englishScore[i]);
			stu[i].totalScoreM(koreanScore[i],mathScore[i],englishScore[i]);
		}
		
		System.out.println("\t\t ### 성적표###");
		System.out.println("=========================================================================");
		System.out.println("이름 \t국어\t  수학\t 영어\t 총점\t 평균");
		System.out.println("=========================================================================");
			for (int j=0; j<5; j++) {
				stu[j].show();
				System.out.println();
			}
		System.out.println("=========================================================================");
	}

}
