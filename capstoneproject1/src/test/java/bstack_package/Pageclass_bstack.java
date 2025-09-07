package bstack_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageclass_bstack {
    WebDriver driver;

    public Pageclass_bstack(WebDriver driver) {
        this.driver = driver;
    }
    // Login (unchanged)
    public void doLogin() throws InterruptedException {
        driver.findElement(By.id("username")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='demouser']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login-btn")).click();
        Thread.sleep(3000);
    }

    public void searchProduct() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search']"));
        searchBox.sendKeys("iPhone 12");
        Thread.sleep(2000);
    }

    public void addToCart() throws InterruptedException {
        WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id='1']/div[4]"));
        addToCartBtn.click();
        Thread.sleep(2000);
    }

    public void deleteFromCart() throws InterruptedException {
        WebElement removeBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[1]"));
        removeBtn.click();
        Thread.sleep(2000);
    }

    public void clicksonCheckout() throws InterruptedException {
//        driver.findElement(By.id("cart-btn")).click();
//        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
        //Thread.sleep(2000);
    }

    public void provideShippingDetails() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the first name input is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstNameInput")));
        driver.findElement(By.id("firstNameInput")).sendKeys("jgugu");
        driver.findElement(By.id("lastNameInput")).sendKeys("giujk");
        driver.findElement(By.id("addressLine1Input")).sendKeys("678 hgiygi");
        driver.findElement(By.id("provinceInput")).sendKeys("fttryu");
        driver.findElement(By.id("postCodeInput")).sendKeys("12345");
        Thread.sleep(2000);
    }

    public void submitOrder() throws InterruptedException {
        driver.findElement(By.id("checkout-shipping-continue")).click();
        Thread.sleep(2000);
 
    }
    public void viewOrders() throws InterruptedException {
        driver.findElement(By.id("orders")).click();
        Thread.sleep(2000);
    }

    public void addFirstProductToFavourites() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='1']/div[1]/button")).click();
        Thread.sleep(1000);
    }

    public void openFavouritesPage() throws InterruptedException {
        driver.findElement(By.id("favourites")).click();
        Thread.sleep(2000);
    }

    public void openOffers() throws InterruptedException {
        driver.findElement(By.id("offers")).click();
        Thread.sleep(2000);
    }

    public void doLogout() throws InterruptedException {
        driver.findElement(By.id("signin")).click();
        Thread.sleep(2000);
    }
}






