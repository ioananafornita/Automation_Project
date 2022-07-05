package Tests;

import Base.BaseTest;
import org.junit.Test;
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowPage;

public class WindowTest extends BaseTest {

    @Test
    public void windowTest(){
        IndexPage indexPage= new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.goToWindowPage();

        WindowPage windowPage=new WindowPage(getDriver());
        windowPage.dealWithTab(1);
        windowPage.dealWithWindow(1);
        windowPage.dealWithMultipleTab(2);
    }
}
