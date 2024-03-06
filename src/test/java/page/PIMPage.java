package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className = "oxd-main-menu-item")
    List<WebElement> menuItems;
    @FindBy(className = "oxd-button")
    List<WebElement> button;
    @FindBy(className = "oxd-input")
    List<WebElement> inputField;
    @FindBy(className = "oxd-switch-input")
    WebElement toggleButton;

    public PIMPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void registerUser(String firstName,String lastName,String username,String password){
        menuItems.get(1).click(); //click on PIM page
        button.get(2).click();//click on add button
        toggleButton.click();


        inputField.get(1).sendKeys(firstName); //type firstname
        inputField.get(3).sendKeys(lastName); //type lastname
        inputField.get(5).sendKeys(username);
        inputField.get(6).sendKeys(password);
        inputField.get(7).sendKeys(password); //type confirm password
        button.get(1).click(); //click on save button



    }
}
