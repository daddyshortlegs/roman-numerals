package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        var baseSymbol = ""
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

        if (i < 5) {
            return "I".repeat(i)
        }

        if (i > 5) {
            return "V" + "I".repeat(i - 5)
        }
        return baseSymbol
    }


}
