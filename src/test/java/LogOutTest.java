import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void preCondition (){
        login();

    }
    @Test

    public void singOut(){
        wd.findElement(By.tagName("button")).click();

        Assert.assertTrue(wd.findElement(By.linkText("LOGIN")).getText().equals("LOGIN"));
    }


}
