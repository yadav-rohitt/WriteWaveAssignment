package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardRegister {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement registerUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement registerPassword;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement registerBtn;

    public DashboardRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void register(String username, String password) {
        registerLink.click();
        registerUsername.sendKeys(username);
        registerPassword.sendKeys(password);
        registerBtn.click();
    }
}

