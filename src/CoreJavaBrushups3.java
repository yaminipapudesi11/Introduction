
public class CoreJavaBrushups3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object //string literal
		String s5 = "Anil Kumar Training";
		String s1 = "Anil Kumar Training";
		
		//String new object in memory space
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		
		String s = "Anil Kumar Trainig";
		String[] splitString = s.split("Kumar");
		
		for(String r : splitString) {
			System.out.println(r.trim());
		}
		
		for(int i =s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
