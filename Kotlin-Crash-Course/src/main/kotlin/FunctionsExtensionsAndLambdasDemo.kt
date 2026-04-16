// File: FunctionsExtensionsAndLambdasDemo.kt

/**
 * Denne filen viser:
 * - vanlige funksjoner
 * - default arguments
 * - extension functions
 * - funksjoner på Int og String
 * - lambdaer
 * - egne filter/map-lignende funksjoner
 */

fun demoStringRecerseFunctions() {
    println("Enter a string:")
    val input = readln()

    println(reverseText(input))
    println(reverseText(textToReverse = input))

    val reversedText = reverseText(input)
    println("Stored reversed text = $reversedText")

    if (input == reverseText(input)) {
        println("That is a palindrome")
    } else {
        println("That is not a palindrome")
    }

    println("Default value example: ${reverseText()}")
    println("Extension function example: ${input.reverseAsExtension()}")

    println("Enter an integer:")
    val inputInt = readln().toIntOrNull()

    if (inputInt != null) {
        println("Reversed integer = ${inputInt.reverseDigits()}")
        println("Original + reversed = ${inputInt + inputInt.reverseDigits()}")
    } else {
        println("That was not a valid integer")
    }
}

// Vanlig funksjon med default-verdi
fun reverseText(textToReverse: String = "HELLO WORLD!"): String {
    return buildString {
        for (index in textToReverse.lastIndex downTo 0) {
            append(textToReverse[index])
        }
    }
}

/**
 * Extension function på String.
 * "this" viser til strengen funksjonen kalles på.
 */
fun String.reverseAsExtension(): String {
    return buildString {
        for (index in this@reverseAsExtension.lastIndex downTo 0) {
            append(this@reverseAsExtension[index])
        }
    }
}

/**
 * Reverserer sifrene i et heltall.
 * Eksempel: 1234 -> 4321
 */
fun Int.reverseDigits(): Int {
    return this.toString().reversed().toInt()
}

fun demoLambdasAndFilter() {
    println("Enter a string:")
    val input = readln()

    val lettersOnly = input.filter {it.isLetter()}
    println("Letters only = $lettersOnly")

    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 10)
    val evenNumbers = favoriteNumbers.filter {it % 2 == 0}
    println("Even numbers = $evenNumbers")

    val isLetterPredicate: (Char) -> Boolean = { character ->
        character.isLetter()
    }

    val lettersOnlyUsingStoredLambda = input.filter(isLetterPredicate)
    println("Letters only (stored lambda) = $lettersOnlyUsingStoredLambda")

    val lettersOnlyWithNamedParameter = input.filter { currentCharacter ->
        currentCharacter.isLetter()
    }
    println("Letters only (named parameter) = $lettersOnlyWithNamedParameter")

    val lettersOnlyWithCustomFilter = input.customStringFilter {it.isLetter()}
    println("Letters only (custom filter) = $lettersOnlyWithCustomFilter")
}

/**
 * Egen filter-funksjon for String.
 * Den bygger en ny streng med bare tegn som passer testen.
 */
fun String.customStringFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (character in this@customStringFilter) {
            if (predicate(character)) {
                append(character)
            }
        }
    }
}

fun demoMapExamples() {
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 10)

    val squaredNumbers = favoriteNumbers.map { number ->
        number * number
    }
    println("Squared numbers = $squaredNumbers")

    val numberDescriptions = favoriteNumbers.map { number ->
        "Number: $number"
    }
    println("Mapped to Strings = $numberDescriptions")
}




































