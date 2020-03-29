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
        val numeral = toRoman(i)
        if (numeral != null) {
            return numeral
        }

        if (i < 5 * units) {
            return "${toRoman(units)}".repeat(i / units)
        }

        if (i >= 5 * units && i < (units * 10) - units) {
            return toRoman(5 * units) + "${toRoman(units)}".repeat(i / units - 5 * units / units)
        }

        return "${toRoman(units)}${toRoman(units * 10)}"
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
