package bstack_package;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bstack_checkout {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User opens sign-in page for checkout")
    public void user_opens_sign_in_page_for_checkout() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
        page = new Pageclass_bstack(driver);
    }

    @When("User signs in for checkout")
    public void user_signs_in_for_checkout() throws InterruptedException {
        page.doLogin(); 
    }

    @When("User searches product {string} for checkout")
    public void searchProductForCheckout(String productName) throws InterruptedException {
        page.searchProduct(productName);
    }
    @When("User adds the product to cart")
    public void user_adds_the_product_to_cart() throws InterruptedException {
        page.addToCart();
    }

    @When("User clicks on checkout")
    public void user_clicks_on_checkout() throws InterruptedException {
        page.clicksonCheckout();
    }

    @When("User provides shipping details {string}, {string}, {string}, {string}, {string}")
    public void user_provides_shipping_details(String firstName, String lastName, String address, String province, String postCode) throws InterruptedException {
        page.provideShippingDetails(firstName, lastName, address, province, postCode);
    }

    @When("User submits the checkout form")
    public void user_submits_the_checkout_form() throws InterruptedException {
        page.submitOrder();
    }

    @Then("Order should be placed successfully")
    public void order_should_be_placed_successfully() {
        System.out.println("order placed successfully!");
        driver.quit();
    }
}













