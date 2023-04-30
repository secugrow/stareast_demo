package com.techwell.stareast.pageobjects

import com.techwell.stareast.driverutil.WebDriverSession
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions

class LandingPage(session: WebDriverSession) : AbstractPage(session) {


   fun gotoSpeakersPage(): SpeakersPage {
      wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='speakers']"))).click()
      return SpeakersPage(session)
   }
}
