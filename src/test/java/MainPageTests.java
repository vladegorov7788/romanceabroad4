import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class MainPageTests {
    public class MainPage extends BaseUI {

        @Test
        public void test2() throws InterruptedException {
            Thread.sleep(5000);
            WebElement ele = driver.findElement(By.xpath("//iframe[@src='https://youtu.be/RRECuJzm3IY?start=85']"));
            driver.switchTo().frame(ele);
            driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
            driver.switchTo().frame("fm");

        }
    }
}
