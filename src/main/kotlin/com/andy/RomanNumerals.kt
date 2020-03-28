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

        // Units of 10
        if (i / 10 < 10) {
            if (i == 50 - 10) {
                return "XL"
            }

            if (i < 50) {
                return "X".repeat(i / 10)
            }

            if (i > 50 && i < 100 - 10) {
                return "L" + "X".repeat(i / 10 - 50 / 10)
            }

            if ( i == 100 - 10) {
                return "XC"
            }
        }

        // units of 100
        if (i / 100 < 100) {
            if (i == 500 - 100) {
                return "CD"
            }

            if (i < 500) {
                return "C".repeat(i / 100)
            }

            if (i > 500 && i < 1000 - 10) {
                return "D" + "C".repeat(i / 100 - 500 / 100)
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
