package com.andy

class RomanNumerals {
    fun convert(i: Int): String {
        var baseSymbol = convertBaseSymbols(i)
        if (baseSymbol != null) {
            return baseSymbol
        }

        if (i == 5 - 1) {
            return "IV"
        }

        if (i < 5) {
            return "I".repeat(i)
        }


        if (i > 5 && i < 10 - 1) {
            return "V" + "I".repeat(i - 5)
        }

        if (i == 10 - 1) {
            return "IX"
        }

        if (i / 10 < 10) {
            if (i < 50) {
                return "X".repeat(i / 10)
            }
        }



        return ""
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
