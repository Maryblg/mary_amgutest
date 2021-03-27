import com.codeborne.selenide.Configuration;
import com.easyqa.qa.pages.DashboardPage;
import com.easyqa.qa.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest {
 /* private WebDriver driver;/*
   private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();*/

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
       /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);*/
        Configuration.browserCapabilities.setAcceptInsecureCerts(true);
        Configuration.browser = "chrome";
        Configuration.browserSize = "1600x1000";
    }

    @Test
    public void testUnitedTestCase() {
        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in", LoginPage.class);
        loginPage.enterLogin("maryamguxi@gmail.com");
        loginPage.enterPassword("45test45");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAuthorized();

    /*
      Selenide.$(UIMap.login).click();
      Selenide.$(UIMap.login).clear();
      Selenide.$(UIMap.login).sendKeys("maryamguxi@gmail.com");

      Selenide.$(UIMap.password).click();
      Selenide.$(UIMap.password).clear();
      Selenide.$(UIMap.password).sendKeys("45test45");

      Selenide.$(UIMap.loginBtn).click();

       Selenide.$(By.id("user_email")).click();
      Selenide.$(By.id("user_email")).clear();
      Selenide.$(By.id("user_email")).sendKeys("maryamguxi@gmail.com");

        Selenide.$(By.id("user_password")).click();
        Selenide.$(By.id("user_password")).clear();
        Selenide.$(By.id("user_password")).sendKeys("45test45");

        Selenide.$(By.name("commit")).click();
    driver.get("https://app.geteasyqa.com/users/sign_in");
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("maryamguxi@gmail.com");
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("45test45");
        driver.findElement(By.name("commit")).click();*/
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        /*driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);*/
        close();
    }
/*
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }*/
}

