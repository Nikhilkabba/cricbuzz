import org.example.CommonPage;
import org.example.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testcases.BaseClass;
import org.testng.annotations.BeforeMethod;

public class test extends BaseClass {
    HomePage homePageObject = new HomePage();
    CommonPage commonPageObject = new CommonPage();

    @BeforeMethod
    public void setup() {
 
        initilization("https://www.cricbuzz.com/");
    }

    @org.testng.annotations.Test
    public void Tc_001() {

        try {
            driver.waitForTime(5);
            //click on Archives
            Assert.assertTrue(homePageObject.clickOnarchives(), "Not able to click on archives");
            //wait
            driver.waitForTime(5);
            //click on year
            Assert.assertTrue(homePageObject.clickOnyear(), "Not able to click on year");
            //wait
            driver.waitForTime(5);
            Assert.assertTrue(homePageObject.clickOnmatch(), "Not able to click on match");
            //wait
            driver.waitForTime(5);
            //click on India vs SriLanka
            Assert.assertTrue(homePageObject.clickOnindia(), "Not able to click on india");
            //wait
            driver.waitForTime(5);
            //click on scoreboard
            Assert.assertTrue(homePageObject.clickOnscore(), "Not able to click on score");
            driver.waitForTime(5);
            //verify the url
            Assert.assertEquals(driver.getWebDriver().getCurrentUrl(), "https://www.cricbuzz.com/live-cricket-scorecard/2215/ind-vs-sl-final-icc-world-cup-2011", "value mismatch");
            //verify the Total Score
            Assert.assertTrue(homePageObject.addScore(),"Not matching with total score");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
