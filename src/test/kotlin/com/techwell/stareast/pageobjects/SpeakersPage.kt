package com.techwell.stareast.pageobjects

import com.techwell.stareast.driverutil.WebDriverSession
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions

class SpeakersPage(session: WebDriverSession) : AbstractPage(session) {
   fun getAllSpeakerNames(): List<String> {
      val listElements = wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span[id*='speaker-title']")))
      return listElements.map(WebElement::getText)
   }


}
