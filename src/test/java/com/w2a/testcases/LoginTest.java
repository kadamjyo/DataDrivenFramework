package com.w2a.testcases;
import com.w2a.base.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void loginAsBankMgr() throws InterruptedException {
        log.debug("running login test");
        driver.findElement(By.cssSelector(ObjRepo.getProperty("bankMgrL"))).click();
        Thread.sleep(3000);
        log.debug("successfully completed login test");
    }
}
