import java.util.*;
public class No1 {
	void no1(){
		String[] arr = {"apple","bare","bear","circle","zoo"};
		String[] aar = new String[5];
		int i,j,k,q,w;
		 System.out.print("입력 데이터>> ");
		 
		 
		 for(i=0; i<5; i++)
			 System.out.print(arr[i]+" ");		 
		 char cc[][] = new char[5][100];
		 for(j=0; j<5; j++) {
			 for(k=0; k<arr[j].length(); k++)
				 cc[j][k]=arr[j].charAt(k);
			 System.out.print(cc[j][k]);
			 
		 }
		 char bbb[] = new char[5];
		 for(q=0; q<arr[j].length(); q++) {
			 for(w=arr[q].length(); w>=0; w--)
			bbb[q]= (char) (cc[q][w] + cc[q][w-1]); 
			 
		 }
		
		 
		 }
	
	
public static void main(String args[]) {
	//{"apple","bare","bear","circle","zoo"};

		
	 //System.out.println(Arrays.toString());
	 
	No1 n = new No1();
	n.no1();
		 
}
}
