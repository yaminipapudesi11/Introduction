
public class CoreJavaBrushUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array's
		int[] arr = new int[5];
		Double[] tes = new Double[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6};
		
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		String[] name = {"anil","Kumar","Training"};
		for(int i = 0; i< name.length; i++) {
			System.out.println(name[i]);
		}
		
		for(String s: name) {
			System.out.println(s);
		}
	}

}
