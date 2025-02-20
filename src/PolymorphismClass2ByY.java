
public class PolymorphismClass2ByY extends PolymorphismByY{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismByY yami = new PolymorphismClass2ByY();
		yami.sub();
	}
	//method for overriding
	public  void sub() {
		System.out.println("Sub from Class2");
	}
}
