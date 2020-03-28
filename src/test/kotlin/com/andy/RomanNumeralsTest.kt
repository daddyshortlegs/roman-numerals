package com.andy

import org.junit.Assert.assertEquals
import org.junit.Test

class RomanNumeralsTest {
    val romanNumerals = RomanNumerals()

    @Test
    fun `should convert 1`() {
        assertEquals("I", romanNumerals.convert(1))
        assertEquals("V", romanNumerals.convert(5))
    }
}