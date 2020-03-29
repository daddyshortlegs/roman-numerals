package com.andy

import kotlin.math.floor

class RomanNumerals {
    fun convert(value: Int): String {
        var i = value
        var romanNumber = ""
        if (i / 1000 in 1..9) {
            romanNumber += convertUnitsOf(1000, i)
            val timesDivisibleBy1000 = i / 1000
            val toSubtract = timesDivisibleBy1000 * 1000
            i -= toSubtract

        }

        if (i / 100 in 1..9) {
            romanNumber += convertUnitsOf(100, i)
            val timesDivisibleBy100 = i / 100
            val toSubtract = timesDivisibleBy100 * 100
            i -= toSubtract
        }

        if (i / 10 in 1..9) {
            romanNumber += convertUnitsOf(10, i)
            val timesDivisibleBy10 = i / 10
            val toSubtract = timesDivisibleBy10 * 10
            i -= toSubtract
        }

        if (i / 1 in 1..9) {
            romanNumber += convertUnitsOf(1, i)
        }

        return romanNumber
    }

    private fun convertUnitsOf(units: Int, i: Int): String {
        val midPoint = 5 * units
        val romanNumeralForUnits = convertBaseSymbols(units)
        if (i == midPoint - units) {
            return "${romanNumeralForUnits}${convertBaseSymbols(midPoint)}"
        }

        if (i < midPoint) {
            return "$romanNumeralForUnits".repeat(i / units)
        }

        if (i >= midPoint && i < (units * 10) - units) {
            return convertBaseSymbols(midPoint) + "$romanNumeralForUnits".repeat(i / units - midPoint / units)
        }

        return "${romanNumeralForUnits}${convertBaseSymbols(units * 10)}"
    }

    private fun convertBaseSymbols(i: Int): String? {
        val romanNumerals = mapOf(1 to "I",
            5 to "V",
            10 to "X",
            50 to "L",
            100 to "C",
            500 to "D",
            1000 to "M")
        return romanNumerals[i]
    }


}
