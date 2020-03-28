package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        var baseSymbol = convertBaseSymbols(i)
        if (baseSymbol != null) {
            return baseSymbol
        }

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
            return convertUnitsOf1000(i)
        }

        return ""
    }

    private fun convertUnitsOf(units: Int, i: Int): String {
        return convertUnits(units, i, 5 * units)
    }

    private fun convertUnits(units: Int, i: Int, midPoint: Int): String {
        val romanNumeralForUnits = convertBaseSymbols(units)
        if (i == midPoint - units) {
            return "${romanNumeralForUnits}${convertBaseSymbols(midPoint)}"
        }

        if (i < midPoint) {
            return "$romanNumeralForUnits".repeat(i / units)
        }

        if (i > midPoint && i < (units * 10) - units) {
            return convertBaseSymbols(midPoint) + "$romanNumeralForUnits".repeat(i / units - midPoint / units)
        }

        return "${romanNumeralForUnits}${convertBaseSymbols(units * 10)}"
    }

    private fun convertUnitsOf1000(i: Int): String {
        val units = 1000
        val romanNumeralForUnits = convertBaseSymbols(units)
        return "$romanNumeralForUnits".repeat(i / units)
    }

    private fun convertBaseSymbols(i: Int): String? {
        if (i == 1) {
            return "I"
        } else if (i == 5) {
            return "V"
        } else if (i == 10) {
            return "X"
        } else if (i == 50) {
            return "L"
        } else if (i == 100) {
            return "C"
        } else if (i == 500) {
            return "D"
        } else if (i == 1000) {
            return "M"
        }
        return null
    }


}
