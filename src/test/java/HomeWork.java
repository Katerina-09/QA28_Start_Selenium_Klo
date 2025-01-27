import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    @Test
    public void cssLocators(){
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement button2 = wd.findElement(By.tagName("button"));
        WebElement button3 = wd.findElement(By.cssSelector("button"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h = wd.findElement(By.cssSelector("h1"));

        WebElement x = wd.findElement(By.tagName("a"));
        WebElement x1 = wd.findElement(By.cssSelector("a"));

        List<WebElement> listX = wd.findElements(By.tagName("a"));
        List<WebElement> listX1 = wd.findElements(By.tagName("a"));

        List<WebElement> listDiv = wd.findElements(By.tagName("div"));
        List<WebElement> listDiv1 = wd.findElements(By.tagName("div"));



    }
}
