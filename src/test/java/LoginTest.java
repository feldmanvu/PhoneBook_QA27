import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase{
    @Test

    public void loginTest(){
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> inputs = wd.findElements(By.tagName("input"));
        fillByElemant(inputs.get(0),"feldmanvu7@gmail.com");

        fillByElemant(inputs.get(1),"Sultry791067-");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(0).click();

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Sign Out");

    }
    public void loginTest2(){
        //wd.findElement(By.linkText("LOGIN")).click();
        wd.findElement(By.cssSelector("[href='LOGIN']")).click();
        fillByLocator(By.cssSelector("[placeholder='Email']"),"feldmanvu7@gmail.com");
        fillByLocator(By.cssSelector("[placeholder='Password']"),"Sultry791067-");


        wd.findElement(By.cssSelector(("button:first-by-type")));
       // wd.findElement(By.linkText("login")).click();


        //List<WebElement> buttons = wd.findElements(By.tagName("button"));
        //buttons.get(0).click();

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Sign Out");




    }


}
