package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class bstack_logintest {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User is in  BStack demo login page")
    public void user_is_in_bstack_demo_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
        page = new Pageclass_bstack(driver);
    }

    @Then("User should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() throws InterruptedException {
        page.doLogin();
        driver.quit();
    }
}





