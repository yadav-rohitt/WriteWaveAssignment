package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardRegister;

public class DashboardRegisterTest extends BaseTest{
 
    DashboardRegister dashboardregister;

    @BeforeClass(alwaysRun = true)
    public void setupTest() {
        super.setup();
        dashboardregister = new DashboardRegister(driver);
    }
     
    @Test(priority = 1)
    public void testRegister() {
    	dashboardregister.register("Rohit", "Rohit@1805");
    }
    @AfterClass(alwaysRun = true)
    public void teardown() {
    	driver.quit();;
    }
}