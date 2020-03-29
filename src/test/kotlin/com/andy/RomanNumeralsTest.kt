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
    fun `should convert single integers less than 5`() {
        assertEquals("II", romanNumerals.convert(2))
        assertEquals("III", romanNumerals.convert(3))
    }

    @Test
    fun `should convert one less than 5`() {
        assertEquals("IV", romanNumerals.convert(4))
    }

    @Test
    fun `should convert single integers greater than 5`() {
        assertEquals("VI", romanNumerals.convert(6))
        assertEquals("VII", romanNumerals.convert(7))
        assertEquals("VIII", romanNumerals.convert(8))
    }

    @Test
    fun `should convert one less than 10`() {
        assertEquals("IX", romanNumerals.convert(9))
    }

    @Test
    fun `should convert units of 10`() {
        assertEquals("XX", romanNumerals.convert(20))
        assertEquals("XXX", romanNumerals.convert(30))
    }

    @Test
    fun `should convert ten less than 50`() {
        assertEquals("XL", romanNumerals.convert(40))
    }

    @Test
    fun `should convert units of ten greater than 50`() {
        assertEquals("LX", romanNumerals.convert(60))
        assertEquals("LXX", romanNumerals.convert(70))
        assertEquals("LXXX", romanNumerals.convert(80))
    }

    @Test
    fun `should convert ten less than 100`() {
        assertEquals("XC", romanNumerals.convert(90))
    }

    @Test
    fun `should convert units of 100`() {
        assertEquals("C", romanNumerals.convert(100))
        assertEquals("CC", romanNumerals.convert(200))
        assertEquals("CCC", romanNumerals.convert(300))
    }

    @Test
    fun `should convert one hundred less than 500`() {
        assertEquals("CD", romanNumerals.convert(400))
    }

    @Test
    fun `should convert units of one hundred greater than 50`() {
        assertEquals("DC", romanNumerals.convert(600))
        assertEquals("DCC", romanNumerals.convert(700))
        assertEquals("DCCC", romanNumerals.convert(800))
    }

    @Test
    fun `should convert one hundred less than 1000`() {
        assertEquals("CM", romanNumerals.convert(900))
    }

    @Test
    fun `should convert a few thoussand`() {
        assertEquals("M", romanNumerals.convert(1000))
        assertEquals("MM", romanNumerals.convert(2000))
    }

    @Test
    fun `should build aggregate number`() {
        assertEquals("XXIX", romanNumerals.convert(29))

    }


}