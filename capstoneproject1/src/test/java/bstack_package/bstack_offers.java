package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class bstack_offers {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User opens sign-in page to see offers")
    public void user_opens_sign_in_page_to_see_offers() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
        page = new Pageclass_bstack(driver);
    }

    @When("User logs in for offers")
    public void user_logs_in_for_offers() throws InterruptedException {
        page.doLogin();
    }

    @When("User opens the Offers page")
    public void user_opens_the_offers_page() throws InterruptedException {
        page.openOffers();
    }

    @Then("Offers content should appear")
    public void offers_content_should_appear() {
        driver.quit();
    }
}




