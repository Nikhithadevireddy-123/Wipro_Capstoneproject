package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class bstack_orders {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User opens sign-in page to view orders")
    public void user_opens_sign_in_page_to_view_orders() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
        page = new Pageclass_bstack(driver);
    }

    @When("User signs in for orders page")
    public void user_signs_in_for_orders_page() throws InterruptedException {
        page.doLogin();
    }

    @When("User navigates to Orders section")
    public void user_navigates_to_orders_section() throws InterruptedException {
        page.viewOrders();
    }

    @Then("Orders list should be visible")
    public void orders_list_should_be_visible() {
        driver.quit();
    }
}








