
package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;


public class DashboardPageTest extends BaseTest {
    DashboardPage dashboardPage;

    @BeforeClass(alwaysRun = true)
    public void setupTest() {
        super.setup();
        dashboardPage = new DashboardPage(driver);
    }
     
    @Test(priority = 2)
    public void testLogin() {
        dashboardPage.login("Rohit", "Rohit@1805");
    }
    @AfterClass(alwaysRun = true)
    public void teardown() {
    	driver.close();
    }
}

