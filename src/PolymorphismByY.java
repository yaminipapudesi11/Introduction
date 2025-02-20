
public class PolymorphismByY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//methods for overloading
	public static void add(int x) {
		System.out.println("x");
	}
	public static void add() {
		System.out.println("Null");
	}
	public static void add(String s) {
		System.out.println("s");
	}
	public static void add(int x, String s) {
		System.out.println("xs");
	}
	public static void add(char a) {
		System.out.println("a");
	}
	
	//method for overriding
	public  void sub() {
		System.out.println("Sub from Class1");
	}
}
