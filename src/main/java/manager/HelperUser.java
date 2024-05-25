package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginRegistrationForm(){
       // WebElement loginTab = wd.findElement(By.cssSelector("a[href='/login']"));
        //loginTab.click();
        click(By.cssSelector("a[href='/login']"));
    }

    public void fillRegistrationForm(String email, String password){
      //  WebElement emailImput = wd.findElement(By.name("email"));
      //  emailImput.click();
      //  emailImput.clear();
      //  emailImput.sendKeys(email);
        type(By.name("email"),email);

      //  WebElement passwordImput = wd.findElement(By.xpath("//input[last()]"));
      //  passwordImput.click();
     //   passwordImput.clear();
     //   passwordImput.sendKeys(password);
        type(By.xpath("//input[last()]"),password);
    }

    public void submitLogin(){
        click(By.xpath("//button[text()='Login']"));
    }


    public boolean isLogged() {

        return isElementPresent(By.xpath("//[text()='Sign Out'"));
    }

    public void logout() {
        click(By.xpath("//button[text()='Sign Out']"));
    }
}
