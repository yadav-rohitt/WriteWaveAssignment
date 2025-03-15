
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement loginLink;

    @FindBy(xpath = "//input[@placeholder='username']")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginBtn;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        loginLink.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}

