import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotosTest extends BaseUI {
    String currentUrlPhotos;
    String expectedUrlPhotos = "https://romanceabroad.com/media/index";


    @Test
    public void testPhotos() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        currentUrlPhotos = driver.getCurrentUrl();
        System.out.println(currentUrlPhotos);
        Assert.assertEquals(currentUrlPhotos, expectedUrlPhotos);

    }
}
