package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {

    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUP(){

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://playground.tensorflow.org/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage = new HomePage(driver);

    }

//    @AfterClass
//    public void down(){
//        driver.quit();
//    }

}
