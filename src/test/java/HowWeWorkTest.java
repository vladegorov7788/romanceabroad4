import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTest extends BaseUI {
    String currentUrlHowWeWork;
    String expectedUrlHowWeWork = "https://romanceabroad.com/users/search";


    @Test
    public void testHowWeWork() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, expectedUrlHowWeWork);

    }

}
