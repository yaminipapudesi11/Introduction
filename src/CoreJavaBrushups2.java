import java.util.ArrayList;

public class CoreJavaBrushups2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,4,33,22,44,55,22,123,1234};
		
		
		for(int i =0; i<arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			}
		}

		
		ArrayList<String> a = new ArrayList();
		a.add("hello");
		a.add("Kumar");
		a.add("Training");
		//create object of the class - object.method
		
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println(a.contains(a));
		
	}

}
