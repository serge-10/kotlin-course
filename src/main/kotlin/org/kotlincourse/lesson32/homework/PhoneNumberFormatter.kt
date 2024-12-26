package org.sergei.org.kotlincourse.lesson32.homework

class PhoneNumberFormatter {
    fun formatPhoneNumber(input: String): String {
        val numericInput = input.replace("\\D".toRegex(), "")

        if (numericInput.length !in 10..11) {
            throw IllegalArgumentException("Invalid phone number length")
        }

        val normalizedInput = when {
            numericInput.length == 10 && numericInput[0] !in listOf('7', '8') -> "7$numericInput"
            numericInput.length == 11 && numericInput[0] == '8' -> "7${numericInput.substring(1)}"
            numericInput.length == 11 && numericInput[0] == '7' -> numericInput
            else -> throw IllegalArgumentException("Invalid phone number prefix")
        }

        return "+7 (${normalizedInput.substring(1, 4)}) ${normalizedInput.substring(4, 7)}-${normalizedInput.substring(7, 9)}-${normalizedInput.substring(9)}"
    }
}