

package com.techwell.stareast.driverutil

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URI

class RemoteFirefoxWebDriverFactory : RemoteWebDriverFactory() {

    override fun createDriver(): WebDriver {

        caps.browserName = "firefox"

        val options = FirefoxOptions()


        webDriver = RemoteWebDriver(URI.create("${ getRemoteTestingServer()}/wd/hub").toURL(),  options.merge(caps))
        webDriver.manage().window().maximize()

        return webDriver
    }

}
