package com.techwell.stareast.step_definitions

import assertk.assertThat
import assertk.assertions.contains
import assertk.assertions.isIn
import com.techwell.stareast.pageobjects.SpeakersPage

class SpeakersSteps(testDataContainer: TestDataContainer) : AbstractStepDefs(testDataContainer) {

   init {

      Then("{string} should be listed") { speakersName: String ->
         val listedSpeakers = getPage(SpeakersPage::class).getAllSpeakerNames()
         assertThat(listedSpeakers).contains(speakersName)
      }
   }
}
