package com.ashwinrao.factfoundry

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.ashwinrao.factfoundry.ui.activity.MainActivity
import com.ashwinrao.factfoundry.ui.activity.ProfileActivity
import com.ashwinrao.factfoundry.ui.fragment.CountryListFragment
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)
    private lateinit var mainActivity: MainActivity
    private lateinit var targetContext: Context

    @Before
    fun setUp() {
        Intents.init()
        mainActivity = rule.activity
        targetContext = InstrumentationRegistry.getInstrumentation().targetContext
    }

    @After
    fun tearDown() {
        Intents.release()
    }

    @Test
    fun ensureCountryListFragmentIsAttachedAndVisible() {
        val fragment = mainActivity.supportFragmentManager.findFragmentById(R.id.frame_layout)
        assert(fragment is CountryListFragment && fragment.isVisible)
    }

    @Test
    fun ensureViewsUseCorrectResources() {
        val titleString = targetContext.getString(R.string.title_activity_main)
        val subtitleString = targetContext.getString(R.string.subtitle_activity_main)
        val profilePic = targetContext.getDrawable(R.mipmap.profile_circle)
        assert(mainActivity.findViewById<TextView>(R.id.home_title).text == titleString)
        assert(mainActivity.findViewById<TextView>(R.id.home_subtitle).text == subtitleString)
        assert(mainActivity.findViewById<ImageView>(R.id.profile_pic).drawable == profilePic)
    }

    @Test
    fun ensureLaunchProfileActivity() {
        onView(withId(R.id.profile_circle)).perform(click())
        intended(hasComponent(ProfileActivity::class.java.name))
    }


}