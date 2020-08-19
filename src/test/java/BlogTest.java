import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI {
    String currentUrlBlog;
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";


    @Test
    public void testBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);

    }
}