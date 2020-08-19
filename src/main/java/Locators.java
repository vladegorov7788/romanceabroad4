import org.openqa.selenium.By;

public class Locators {
    //Media page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    //Search Page
   public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

   //Blog Page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

    //Flowers Page
   public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

   //How We Work Page
    public static final By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/users/search']");

    //Photos Page
    public static final By LINK_PHOTOS = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Tour Page
    public static final By LINK_TOUR_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
}
