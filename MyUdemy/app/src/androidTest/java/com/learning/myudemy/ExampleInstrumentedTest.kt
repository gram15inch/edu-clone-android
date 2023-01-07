package com.learning.myudemy

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.learning.myudemy.domain.repository.CategoryRepository
import com.learning.myudemy.domain.repository.LectureRepository
import com.learning.myudemy.presentation.viewModel.RecommendationViewModel

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val a = RecommendationViewModel(LectureRepository(), CategoryRepository())
        assertEquals(a.recommendList.value!!.size, 1)
    }
}