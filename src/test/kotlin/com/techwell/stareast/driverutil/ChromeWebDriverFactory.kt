package com.techwell.stareast.driverutil

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class ChromeWebDriverFactory : WebDriverFactory() {

    override fun createDriver(): WebDriver {

        //WebDriverManager.chromedriver().driverVersion(getBrowserVersion()).setup()
        val options = ChromeOptions()
        options.addArguments("--remote-allow-origins=*")

        webDriver = ChromeDriver(options.merge(caps))
        webDriver.manage().window().size = screenDimension.dimension

        return webDriver
    }


}
