/**
 * Denne filen viser:
 * - arrays
 * - trygg indeksering
 * - while- og for-løkker
 * - mutableList
 * - iterasjon over tekst
 * - bygge en reversert streng
 */

fun demoArrayIndexingBasic() {
    println("Enter an array index:")
    val input = readln()
    val index = input.toIntOrNull()

    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    if (index != null && index in 0 until favoriteNumbers.size) {
        println("Value at index $index is ${favoriteNumbers[index]}")
    } else {
        println("Value not found at index $index")
    }

    println("First element = ${favoriteNumbers[0]}")
    println("Element at index 5 = ${favoriteNumbers[5]}")
    println("Element at index 4 using getOrNull = ${favoriteNumbers.getOrNull(4)}")
}

fun demoArrayIndexingUsingLastIndex() {
    println("Enter an array index:")
    val input = readln()
    val index = input.toIntOrNull()

    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    if (index != null && index in 0 ..favoriteNumbers.lastIndex) {
        println("Value at index $index is ${favoriteNumbers[index]}")
    } else {
        println("Value not found at index $index")
    }
}

fun demoArrayModification() {
    println("Enter an array index:")
    val input = readln()
    val index = input.toIntOrNull()

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) + 90
    numbers[2] == 77

    if (index != null && index in 0 ..numbers.lastIndex) {
        println("Value at index $index is ${numbers[index]}")
    } else {
        println("Value not found at index $index")
    }
}

fun demoWhileLoopSum() {
    println("How many numbers will you enter?:")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var sum = 0
    var currentCount = 0

    while (currentCount < amountOfNumbers) {
        println("Enter number #${currentCount + 1}")
        val number = readln().toIntOrNull() ?: 0
        sum += number
        currentCount++
    }
    println("Total sum = $sum")
}

fun demoGrowingIntArrayNotRecommended() {
    println("How many numbers will you enter?:")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var numbers = intArrayOf()
    var currentCount = 0

    while (currentCount < amountOfNumbers) {
        println("Enter number #${currentCount + 1}")
        val number = readln().toIntOrNull() ?: continue

        // Dette fungerer, men er ineffektivt fordi array kopieres hver gang
        numbers += number
        currentCount++
    }
    println("Numbers = ${numbers.contentToString()}")
}

fun demoMutableListRecommended() {
    println("How many numbers will you enter?:")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var numbers = mutableListOf<Int>()
    var currentCount = 0

    while (currentCount < amountOfNumbers) {
        println("Enter number #${currentCount + 1}")
        val number = readln().toIntOrNull() ?: continue

        numbers.add(number)
        currentCount++
    }
    println("Numbers = $numbers")
}

fun demoForLoopWithRange() {
    println("How many numbers will you enter?:")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    val numbers = mutableListOf<Int>()

    for (index in 0 until amountOfNumbers) {
        println("Enter number #${index + 1}:")
        val number = readln().toIntOrNull() ?: 0
        numbers += number
    }

    for (number in numbers) {
        println("Stored number: $number")
    }
    println("All numbers = $numbers")
}

fun demoLoopThrougCharacters() {
    println("Enter a string:")
    val input = readln()

    for (char in input) {
        print(char)
    }
}

fun demoReverseStringWithLoop() {
    println("Enter a string: ")
    val input = readln()

    val reversedText = buildString {
        for (index in input.lastIndex downTo 0) {
            append(input[index])
        }
    }
    println("Reversed string = $reversedText")
}









































