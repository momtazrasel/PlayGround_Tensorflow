package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Budget {

    public WebDriver driver;

    public Budget(WebDriver driver) {
        this.driver = driver;
    }

    public By budgetIcon = By.xpath("(//i[@class='fas fa-coins'])[1]");
    public By allBudgetOption = By.xpath("(//a[normalize-space()='All Budgets'])[1]");
    public By allBudgetPage = By.xpath("(//li[@class='k-flex-none k-breadcrumb-item k-breadcrumb-root-item k-breadcrumb-last-item ng-star-inserted'])[1]");
    public By allUnitsCheckbox = By.xpath("(//label[@for='isAll'])[1]");
    public By budgetAccount = By.xpath("(//div[normalize-space()='QA-100-100 - Budget Test'])[1]");



    public void getBudgetIcon() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(budgetIcon).click();
    }
    public void getAllBudget() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(allBudgetOption).click();
    }
    public void getBudgetPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(allBudgetPage);

    }
    public void getViewAllUnitsCheckbox() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(allUnitsCheckbox).click();

    }
    public void getBudgetAccount() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(budgetAccount).click();

    }

}
