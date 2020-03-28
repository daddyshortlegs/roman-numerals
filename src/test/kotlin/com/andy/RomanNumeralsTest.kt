package com.andy

import org.junit.Assert.assertEquals
import org.junit.Test

class RomanNumeralsTest {
    val romanNumerals = RomanNumerals()

    @Test
    fun `should convert base symbols`() {
        assertEquals("I", romanNumerals.convert(1))
        assertEquals("V", romanNumerals.convert(5))
        assertEquals("X", romanNumerals.convert(10))
        assertEquals("L", romanNumerals.convert(50))
        assertEquals("C", romanNumerals.convert(100))
        assertEquals("D", romanNumerals.convert(500))
        assertEquals("M", romanNumerals.convert(1000))
    }

    @Test
    fun `should convert multiple symbols of same type`() {
        assertEquals("II", romanNumerals.convert(2))
        assertEquals("III", romanNumerals.convert(3))
    }
}