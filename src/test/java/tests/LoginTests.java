package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

  @BeforeMethod
  public void preCondition(){
   // if ( SignOut is present ----->logout)
    if(app.getHelperUser().isLogged()){
      app.getHelperUser().logout();
    }
  }
  @Test
    public void loginSuccess(){
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillRegistrationForm("ivan@jmail.com","Ivan54321$");
    app.getHelperUser().submitLogin();


    //Assert
//    Assert.assertEquals();
//    Assert.assertNotEquals();
//    Assert.assertTrue();
//    Assert.assertFalse();

    Assert.assertTrue(app.getHelperUser().isLogged());
  }

}
