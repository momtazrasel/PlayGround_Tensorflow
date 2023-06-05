package Tests;

import Pages.Budget;

import org.testng.annotations.Test;

public class BudgetTest extends LoginTest{


    @Test
    public void allBudgetPage() throws InterruptedException {
        spolLogin();
        Budget budget = homePage.budget();
        budget.getBudgetIcon();
        budget.getAllBudget();
        budget.getBudgetPage();

    }
    @Test
    public void budgetAccount() throws InterruptedException {
        spolLogin();
        Budget budget = homePage.budget();
        budget.getBudgetIcon();
        budget.getAllBudget();
        budget.getBudgetPage();
        budget.getViewAllUnitsCheckbox();
        budget.getBudgetAccount();

    }
}
