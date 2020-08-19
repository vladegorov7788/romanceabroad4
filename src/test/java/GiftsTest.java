import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTest extends BaseUI {
    String currentUrlGifts;
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";


    @Test
    public void testGlifts() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, expectedUrlGifts);

    }
}
