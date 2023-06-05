package Pages;


import org.openqa.selenium.WebDriver;

public class HomePage {

    public final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage signIn(){
        return new LoginPage(driver);
    }
    public Planning planning(){
        return new Planning(driver);
    }
    public Budget budget(){
        return new Budget(driver);
    }


}
