package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        var baseSymbol = convertBaseSymbols(i)
        if (baseSymbol != null) {
            return baseSymbol
        }

        // Units of 1
        if (i / 1 < 10) {
            return convertUnitsOf1(i)
        }

        // Units of 10
        if (i / 10 < 10) {
            return convertUnitsOf10(i)
        }

        // units of 100
        if (i / 100 < 10) {
            return convertUnitsOf100(i)
        }

        // units of 1000
        if (i / 1000 < 10) {
            return convertUnitsOf1000(i)
        }

        return ""
    }

    private fun convertUnitsOf1(i: Int): String {
        val unitsOf1 = 1
        val by5 = 5 * unitsOf1
        if (i == by5 - unitsOf1) {
            return "IV"
        }

        if (i < by5) {
            return "I".repeat(i / unitsOf1)
        }

        if (i > by5 && i < 10 - unitsOf1) {
            return "V" + "I".repeat(i / unitsOf1 - by5 / unitsOf1)
        }

        return "IX"
    }

    private fun convertUnitsOf10(i: Int): String {
        val unitsOf10 = 10
        val by50 = 5 * unitsOf10
        if (i == by50 - unitsOf10) {
            return "XL"
        }

        if (i < by50) {
            return "X".repeat(i / unitsOf10)
        }

        if (i > by50 && i < 100 - unitsOf10) {
            return "L" + "X".repeat(i / unitsOf10 - by50 / unitsOf10)
        }

        return "XC"
    }

    private fun convertUnitsOf100(i: Int): String {
        val unitsOf100 = 100
        val by500 = 5 * unitsOf100
        if (i == by500 - unitsOf100) {
            return "CD"
        }

        if (i < by500) {
            return "C".repeat(i / unitsOf100)
        }

        if (i > by500 && i < 1000 - unitsOf100) {
            return "D" + "C".repeat(i / unitsOf100 - by500 / unitsOf100)
        }

        return "CM"
    }

    private fun convertUnitsOf1000(i: Int): String {
        val unitsOf1000 = 1000
        return "M".repeat(i / unitsOf1000)
    }

    private fun convertBaseSymbols(i: Int): String? {
        if (i == 5) {
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
