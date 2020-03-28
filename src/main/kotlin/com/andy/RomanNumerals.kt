package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        var baseSymbol = convertBaseSymbols(i)
        if (baseSymbol != null) {
            return baseSymbol
        }

        // Units of 1
        if (i / 1 < 10) {
            return convertUnitsOfOne(i)
        }

        // Units of 10
        if (i / 10 < 10) {
            return convertUnitsOfTen(i)
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

    private fun convertUnitsOf1000(i: Int): String {
        return "M".repeat(i / 1000)
    }

    private fun convertUnitsOf100(i: Int): String {
        if (i == 500 - 100) {
            return "CD"
        }

        if (i < 500) {
            return "C".repeat(i / 100)
        }

        if (i > 500 && i < 1000 - 100) {
            return "D" + "C".repeat(i / 100 - 500 / 100)
        }

        return "CM"
    }

    private fun convertUnitsOfTen(i: Int): String {
        if (i == 50 - 10) {
            return "XL"
        }

        if (i < 50) {
            return "X".repeat(i / 10)
        }

        if (i > 50 && i < 100 - 10) {
            return "L" + "X".repeat(i / 10 - 50 / 10)
        }

        return "XC"
    }

    private fun convertUnitsOfOne(i: Int): String {
        if (i == 5 - 1) {
            return "IV"
        }

        if (i < 5) {
            return "I".repeat(i)
        }

        if (i > 5 && i < 10 - 1) {
            return "V" + "I".repeat(i - 5)
        }

        return "IX"
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
