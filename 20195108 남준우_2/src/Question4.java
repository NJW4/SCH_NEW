import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		int a[] = {3,-1,2,5,2,7};
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int b : a) {
			if(!arrayList.contains(b))
		        arrayList.add(b);
		}
		System.out.println(arrayList);
		
		
	}

}