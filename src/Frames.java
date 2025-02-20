import Utility.BaseMethod;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BaseMethod.selectDropDown(element, "Radio");
		BaseMethod.clickUsingActions(element);
		BaseMethod.write("hello ");
		
		BaseMethod.clickWebElement(element);
	}

}
