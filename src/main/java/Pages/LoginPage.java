package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public By username =By.xpath("(//input[@placeholder='Username'])[1]");
    public By password =By.xpath("(//input[@placeholder='Password'])[1]");
    public By loginButton =By.xpath("(//button[normalize-space()='Login'])[1]");


    public void getUsername() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(username).sendKeys("TESSupport");
    }


    public void getPassword() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(password).sendKeys("SPOL_Support@2014");
        Thread.sleep(1000);
    }

    public void getLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(loginButton).click();
        Thread.sleep(1000);
    }
}
