import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void preCondition (){
        if (isElement(By.cssSelector("[href='/login']"))){
            login("feldmanvu7@gmail.com", "Sultry791067-");
        }


    }

    private boolean isElement(By locator) {
        return wd.findElements(locator).size()>0;
    }

    @Test

    public void singOut(){
        wd.findElement(By.tagName("button")).click();

        Assert.assertTrue(wd.findElement(By.linkText("LOGIN")).getText().equals("LOGIN"));
    }


}
