package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        // Units of 1
        if (i / 1 < 10) {
            return convertUnitsOf(1, i)
        }

        // Units of 10
        if (i / 10 < 10) {
            return convertUnitsOf(10, i)
        }

        // units of 100
        if (i / 100 < 10) {
            return convertUnitsOf(100, i)
        }

        // units of 1000
        if (i / 1000 < 10) {
            return convertUnitsOf(1000, i)
        }

        return ""
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

        if (i == midPoint) {
            return "${convertBaseSymbols(midPoint)}"
        }

        if (i > midPoint && i < (units * 10) - units) {
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
