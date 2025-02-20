
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		MethodsDemo2 d1 = new MethodsDemo2();
		
		d.getData();
		System.out.println(d1.getData());
		getData();
		
	}

	
	//why method - re use the code
	
	public static void getData() {
		System.out.println("Hello World");
	}
}
