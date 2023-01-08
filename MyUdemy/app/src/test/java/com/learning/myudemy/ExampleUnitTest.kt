package com.learning.myudemy

import com.learning.myudemy.domain.model.Category
import kotlinx.coroutines.*


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val list1 = listOf(Category(1,"hi11"),Category(1,"hi12"))
        val list11 = listOf(Category(1,"hi11"),Category(1,"hi12"))
        val list2 = listOf(Category(1,"hi21"),Category(1,"hi22"))
        assertEquals(true,list1==list11)
        assertEquals(false,list1==list2)
    }

    @Test
    fun test1(){


         CoroutineScope(Dispatchers.IO).launch {
                repeat(10){
                    Thread.sleep(1000)
                    println("k1 $it")
                }

            }
          CoroutineScope(Dispatchers.IO).launch {
              repeat(10){
                  Thread.sleep(1000)
                  println("k2 $it")
              }
            }

        Thread.sleep(5000)

    }
}