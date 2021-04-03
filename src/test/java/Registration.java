import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Registration extends TestBase {

    @Test
    public void registrationTest (){
        int index = (int)((System.currentTimeMillis()/1000)%3600);
        String email = "feld"+index+"@gmail.com";
        String pass = "Pass-"+index;

        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> inputs = wd.findElements(By.tagName("input"));
        fillByElemant(inputs.get(0),email);
        fillByElemant(inputs.get(1),pass);
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(1).click();
        Assert.assertTrue(wd.findElement(By.tagName("button")).getText().equals("Sign Out"));





    }


}
