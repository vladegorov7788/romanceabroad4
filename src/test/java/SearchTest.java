import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseUI {
    String currentUrlSearch;


    @Test
    public void SearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByVisibleText("Views");

    }
    @Test
    public void SearchPage2() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByVisibleText("Name");

    }
@Test
    public void SearchPage3() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByVisibleText("Registration date");

    }
@Test
    public void SearchPage4() {
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByIndex(3);

    }
    @Test
    public void SearchPage6() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");*/

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
    getDropDownListByValue(dropDownListSortBy,"date_created");

    }
    @Test
    public void SearchPageAge() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");*/

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_AGE);
    getDropDownListByValue(dropDownListSortBy,"19");

    }
    @Test
    public void SearchPageAge2() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");*/

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_AGE2);
    getDropDownListByValue(dropDownListSortBy,"25");

    }



    public void getDropDownListByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void getDropDownListByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void getDropDownListByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

}


