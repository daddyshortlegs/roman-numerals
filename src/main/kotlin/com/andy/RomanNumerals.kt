package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        if (i / 1000 in 1..9) {
            return convertUnitsOf(1000, i)
        }

        if (i / 100 in 1..9) {
            return convertUnitsOf(100, i)
        }

        if (i / 10 in 1..9) {
            return convertUnitsOf(10, i)
        }

        if (i / 1 in 1..9) {
            return convertUnitsOf(1, i)
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
