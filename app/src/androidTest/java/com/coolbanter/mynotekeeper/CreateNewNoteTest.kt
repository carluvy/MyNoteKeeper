package com.coolbanter.mynotekeeper

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class CreateNewNoteTest{
    @get:Rule
    val noteListActivity:ActivityScenarioRule<NoteListActivity> = ActivityScenarioRule(NoteListActivity::class.java)

    @Test
    fun createNewNote(){
        val noteTitle = "Test note title"
        val noteText = "This is the body of my note test"

        onView(withId(R.id.fab)).perform(ViewActions.click())

        onView(withId(R.id.noteTitle)).perform(ViewActions.typeText(noteTitle))
        onView(withId(R.id.noteText)).perform(ViewActions.typeText(noteText))

    }
}