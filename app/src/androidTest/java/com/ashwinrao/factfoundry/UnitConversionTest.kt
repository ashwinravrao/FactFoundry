package com.ashwinrao.factfoundry

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.ashwinrao.factfoundry.util.UnitConversion
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.math.floor

@RunWith(AndroidJUnit4::class)
class UnitConversionTest {

    @Test
    fun shouldCorrectlyConvertDpToPxTest() {
        val context = InstrumentationRegistry.getInstrumentation().context
        val dpi = context.resources.displayMetrics.density * 160f
        assertEquals(floor((dpi / 160) * 5).toInt(), UnitConversion.dpToPx(context, 5f))
    }

}