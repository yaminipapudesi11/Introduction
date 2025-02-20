package ultimateQaTestClass;

import org.testng.annotations.Test;


import ultimateQAPages.AddToCartPage;
import ultimateQa.BaseClass;
public class AddToCartTest extends BaseClass{

	@Test
	public void addToCart() {
		AddToCartPage addBooks = new AddToCartPage(driver);
		addBooks.clickOnLoginUrl();
		addBooks.enterUsername("yaminianilPap@gmail.com");
		addBooks.enterPassword("123$Yami");
		addBooks.clickOnLoginBtn();
		addBooks.clickOnBooksLink();
		addBooks.addFirstBookToTheCart();
		addBooks.addSecondBookToTheCart();
		addBooks.clickOnShoppingCart();
		addBooks.logOut();
	}

}
	

