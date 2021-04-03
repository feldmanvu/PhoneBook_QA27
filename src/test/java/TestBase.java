import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

@BeforeSuite

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");




}
@AfterSuite
    public void tearDown(){
        wd.quit();

}


public void fillByElemant (WebElement element,String text){
    element.click();
    element.clear();
    element.sendKeys(text);

}
public void pause (int millis){
    try {
        Thread.sleep(millis);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
public void login (){
    wd.findElement(By.linkText("LOGIN")).click();
    List<WebElement> inputs = wd.findElements(By.tagName("input"));
    fillByElemant(inputs.get(0),"feldmanvu7@gmail.com");
    fillByElemant(inputs.get(1),"Sultry791067-");
    List<WebElement> buttons = wd.findElements(By.tagName("button"));
    buttons.get(0).click();
}
}

