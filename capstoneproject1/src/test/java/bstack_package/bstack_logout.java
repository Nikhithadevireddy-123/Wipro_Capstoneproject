package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class bstack_logout {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User opens sign-in page for logout")
    public void user_opens_sign_in_page_for_logout() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
        page = new Pageclass_bstack(driver);
    }

    @When("User signs in to prepare logout")
    public void user_signs_in_to_prepare_logout() throws InterruptedException {
        page.doLogin();
    }

    @When("User clicks logout action")
    public void user_clicks_logout_action() throws InterruptedException {
        page.doLogout();
    }

    @Then("User should be logged out successfully")
    public void user_should_be_logged_out_successfully() {
        driver.quit();
    }
}




