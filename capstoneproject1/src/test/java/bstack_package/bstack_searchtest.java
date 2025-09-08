package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class bstack_searchtest {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User is on BStack demo home page")
    public void user_is_on_bstack_demo_home_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
        page = new Pageclass_bstack(driver);
    }

    @When("Enter product name in search bar")
    public void enter_product_name_in_search_bar() throws InterruptedException {
        page.searchProduct();
    }

    @Then("Search results should be displayed")
    public void search_results_should_be_displayed() {
        driver.quit();
    }
}




