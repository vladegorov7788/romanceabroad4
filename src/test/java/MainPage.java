import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    WebDriver driver;
    String currentUrlMedia;
    String currentUrlSearch;
    String currentUrlBookNow;
    String currentUrlSearchPage1;
    String currentUrlHowItWorks;
    String currentUrlHowWeWork;
    String currentUrlPhotos;
    String currentUrlGifts;
    String currentUrlTourToUkraine;
    String currentUrlBlog;
    String linkSearch;

    String mainUrl = "https://romanceabroad.com/";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    String expectedUrlTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlPhotos = "https://romanceabroad.com/media/index";
    String expectedUrlHowWeWork = "https://romanceabroad.com/users/search";
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlSearch1 = "https://romanceabroad.com/users/search";
    String expectedUrl2 = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlMainPage = "https://romanceabroad.com/media/index";
    String expectedUrlHowItWorks = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlBookNow = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String getExpectedUrlGifts = "https://romanceabroad.com/store/category-sweets";
    String getExpectedUrlSweets = "https://romanceabroad.com/store/category-sweets";
    String getExpectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    String getCurrentUrlMedia = "https://romanceabroad.com/media/index";
    String findElementMedia = "https://romanceabroad.com/media/index";


    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_HomePage = By.xpath("//a[@href='https://romanceabroad.com/']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    By LINK_HOW_WE_WORKS1 = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    By LINK_PHOTOS = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_TOUR_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    By LINK_GIFTS2 = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By LINK_REQUEST_INFO = By.cssSelector("a[href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By LINK_MEDIA_PAGE1 = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By Locators_SEARCH1 = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By Locators_GIFTS2 = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By Locators_FlowerBasket = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By BUTTON_JOINFREE = By.xpath("//button[@id='show-registration-block']");
    By BUTTON_HELP = By.xpath("//button[@id='footer-menu-title-0']");
    By BUTTON_SEARCH = By.xpath("//button[@id='id=main_search_button_user_line']");
    int indexLinkSignIn = 0;
    int getIndexLinkRequestInfo = 0;

    String name = "Al";
    By BUTTON_SEARCH1 = By.xpath("//a");
    By BUTTON_ADVERTISING = By.xpath("//a");
    By BUTTON_SUBMIT = By.xpath("//a");
    int number = 3;

    @BeforeMethod
public void setUp(){

    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(mainUrl);
}

    @Test
    public void testGifts2 (){
        WebElement linkSPA = driver.findElement(Locators_GIFTS2);
        linkSPA.click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
    }

    @Test
    public void SearchPage (){
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);


    }

    @Test
    public void MainPage (){
        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia,expectedUrlMedia);


    }

    @Test
    public void testMediaPage (){
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);


    }
    @Test
    public void testHowWeWork (){
        driver.findElement(LINK_HOW_WE_WORK).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, expectedUrlHowWeWork);

    }
    @Test
    public void testPhotos (){
        driver.findElement(LINK_PHOTOS).click();
        currentUrlPhotos = driver.getCurrentUrl();
        System.out.println(currentUrlPhotos);
        Assert.assertEquals(currentUrlPhotos, expectedUrlPhotos);

    }
    @Test
    public void testTourToUkraine (){
        driver.findElement(LINK_TOUR_TO_UKRAINE).click();
        currentUrlTourToUkraine = driver.getCurrentUrl();
        System.out.println(currentUrlTourToUkraine);
        Assert.assertEquals(currentUrlTourToUkraine, expectedUrlTourToUkraine);

    }
    @Test
    public void testBlog (){
        driver.findElement(LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);

    }
    @Test
    public void testFlowers (){
        WebElement linkFlowers = driver.findElement(Locators_FlowerBasket);
        linkFlowers.click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
    }
    @Test
    public void testGlifts (){
        driver.findElement(LINK_GIFTS).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, expectedUrlGifts);

    }

    @Test
    public void testSignIn (){
       driver.findElements(LINK_SIGN_IN).get(0).click();

    }
    @Test
    public void testRequestInfo (){
        driver.findElements(LINK_REQUEST_INFO).get(getIndexLinkRequestInfo).click();

    }
    @Test
    public void testRegistration(){
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("11@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("11@gmail.com");
        //driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();

    }
    @Test
    public void testRegistration2(){
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("vlad@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("12345678910");
        //driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();

    }
    @Test
    public void testRegistration3(){
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("vlad@gmail.com");
        //driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();
    }
    @Test
    public void testRegistration4(){
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#password")).sendKeys("0987654321");
        driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();
    }
    @Test
    public void testJoinFree(){
        driver.findElement(BUTTON_JOINFREE).click();
    }
    @Test
    public void SearchPage1 (){
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);


    }


@AfterMethod
    public void afterActions(){
    //driver.quit();
}
}
