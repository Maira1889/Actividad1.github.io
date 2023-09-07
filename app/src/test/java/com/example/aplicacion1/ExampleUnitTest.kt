package com.example.aplicacion1

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun compare_cadenas() {

        val a = "kotlin is easy"
        val b = "kotlin is" + " easy"
        if(a==b){
            println("Strings '$a' y '$b' son iguales.")
        } else {
            println("Strings '$a' y '$b' no son iguales.")
        }

    }
}