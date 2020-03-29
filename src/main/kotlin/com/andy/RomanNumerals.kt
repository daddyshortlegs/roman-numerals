package com.andy

class RomanNumerals {
    fun convert(value: Int): String {
        var i = value
        var romanNumber = ""

        for (divisor in listOf(1000, 100, 10, 1)) {
            if (i / divisor in 1..9) {
                romanNumber += convertUnitsOf(divisor, i)
                i -= (i / divisor) * divisor
            }
        }

        return romanNumber
    }

    private fun convertUnitsOf(units: Int, i: Int): String {
        val midPoint = 5 * units
        val romanNumeralForUnits = toRoman(units)
        if (i == midPoint - units) {
            return "${romanNumeralForUnits}${toRoman(midPoint)}"
        }

        if (i < midPoint - 1) {
            return "$romanNumeralForUnits".repeat(i / units)
        }

        if (i >= midPoint && i < (units * 10) - units) {
            return toRoman(midPoint) + "$romanNumeralForUnits".repeat(i / units - midPoint / units)
        }

        return "${romanNumeralForUnits}${toRoman(units * 10)}"
    }

    private fun toRoman(i: Int): String? {
        val romanNumerals = mapOf(1 to "I",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X",
            40 to "XL",
            50 to "L",
            90 to "XC",
            100 to "C",
            400 to "CD",
            500 to "D",
            900 to "CM",
            1000 to "M")
        return romanNumerals[i]
    }
}
