package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class bstack_addtocart {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User launches BStack demo home page for adding product")
    public void user_launches_bstack_demo_home_page_for_adding_product() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
        page = new Pageclass_bstack(driver);
    }

    @When("Search for a product in search bar")
    public void search_for_a_product_in_search_bar() throws InterruptedException {
        page.searchProduct();
    }

    @When("Add the product to the cart")
    public void add_the_product_to_the_cart() throws InterruptedException {
        page.addToCart();
    }

    @Then("Successfully added to cart")
    public void successfully_added_to_cart() {
        driver.quit();
    }
}




