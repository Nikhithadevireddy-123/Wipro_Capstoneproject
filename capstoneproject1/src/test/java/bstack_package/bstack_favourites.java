package bstack_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class bstack_favourites {
    WebDriver driver;
    Pageclass_bstack page;

    @Given("User opens sign-in page for favourites")
    public void user_opens_sign_in_page_for_favourites() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
        page = new Pageclass_bstack(driver);
    }

    @When("User signs in to manage favourites")
    public void user_signs_in_to_manage_favourites() throws InterruptedException {
        page.doLogin();
    }

    @When("User marks the first product as favourite")
    public void user_marks_the_first_product_as_favourite() throws InterruptedException {
        page.addFirstProductToFavourites();
    }

    @When("User opens the Favourites page")
    public void user_opens_the_favourites_page() throws InterruptedException {
        page.openFavouritesPage();
    }

    @Then("Favourites should display without errors")
    public void favourites_should_display_without_errors() {
        driver.quit();
    }
}






    





