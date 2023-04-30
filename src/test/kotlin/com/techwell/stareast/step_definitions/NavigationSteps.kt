package com.techwell.stareast.step_definitions

import com.techwell.stareast.pageobjects.LandingPage
import com.techwell.stareast.pageobjects.PageUrls
import io.cucumber.java.en.Then


class NavigationSteps(testDataContainer: TestDataContainer) : AbstractStepDefs(testDataContainer) {

   init {
      Given("the start page is loaded") {
         getWebDriverSession().gotoUrl(PageUrls.HOME, LandingPage::class, testDataContainer)
      }

      When("navigating to the speakers page") {
         getPage(LandingPage::class).gotoSpeakersPage()
      }

   }

}
