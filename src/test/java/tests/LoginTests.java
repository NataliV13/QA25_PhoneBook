package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

  @BeforeMethod
  public void preCondition() {
    //if SignOut is present ---->logout
    if (app.getHelperUser().isLogged()) {
      app.getHelperUser().logout();
    }
  }


  @Test
  public void loginSuccess() {
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("Ian@jmail.com","Iian54321$");
    app.getHelperUser().submitLogin();

    //Assert
//        Assert.assertEquals();
//        Assert.assertNotEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();

    Assert.assertTrue(app.getHelperUser().isLogged());

  }

  @Test
  public void loginSuccessModel() {
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("Iian@jmail.com","Iian54321$");
    app.getHelperUser().submitLogin();

    //Assert
//        Assert.assertEquals();
//        Assert.assertNotEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();

    Assert.assertTrue(app.getHelperUser().isLogged());

  }

  @Test
  public void loginWrongEmail() {
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("Ianjmail.com","Iian54321$");
    app.getHelperUser().submitLogin();
    Assert.assertTrue(app.getHelperUser().isAlertPresent("Wrong email or password"));
  }


  @Test
  public void loginWrongPassword() {
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("Ian@jmail.com","Iian5432");
    app.getHelperUser().submitLogin();
    Assert.assertTrue(app.getHelperUser().isAlertPresent("Wrong email or password"));

  }

  @Test
  public void loginUnregisteredUser() {
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("loki@gmail.com", "Lrt123456$");
    app.getHelperUser().submitLogin();
    Assert.assertTrue(app.getHelperUser().isAlertPresent("Wrong email or password"));

  }

}