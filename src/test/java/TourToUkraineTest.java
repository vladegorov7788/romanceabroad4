import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraineTest extends BaseUI {
    String currentUrlTourToUkraine;
    String expectedUrlTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";


    @Test
    public void testTourToUkraine() {
        driver.findElement(Locators.LINK_TOUR_TO_UKRAINE).click();
        currentUrlTourToUkraine = driver.getCurrentUrl();
        System.out.println(currentUrlTourToUkraine);
        Assert.assertEquals(currentUrlTourToUkraine, expectedUrlTourToUkraine);

    }
}
