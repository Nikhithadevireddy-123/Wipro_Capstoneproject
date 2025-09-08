package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class bstack_deletefromcart {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User is on BStack demo home page for delete")
    public void user_is_on_bstack_demo_home_page_for_delete() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
        page = new Pageclass_bstack(driver);
    }
    @When("User searches product {string} to delete")
    public void searchProductToDelete(String productName) throws InterruptedException {
        page.searchProduct(productName);
    }


    @When("Add the product to the cart for delete")
    public void add_the_product_to_the_cart_for_delete() throws InterruptedException {
        page.addToCart();
    }

    @When("Remove the product from the cart")
    public void remove_the_product_from_the_cart() throws InterruptedException {
        page.deleteFromCart();
    }

    @Then("Successfully deleted from cart")
    public void successfully_deleted_from_cart() {
        driver.quit();
    }
}











