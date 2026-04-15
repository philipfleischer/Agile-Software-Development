fun funct1() {
    println("Enter a String:")
    val input = readln()

    println(reversed(input))
    println(reversed(input))
    val reversed = reversed(input)
    println(reversed)

    if (input == reversed(input)) {
        println("That is a palindrome")
    }
    // Testing the default value:
    println(reversed())
    //More obvious way, using name parameters:
    println(reversed(stringToReverse = input))
    // With extension function
    val reversString = input.reversed()
    println(reversString)

    println("Enter a Integer:")
    val inputInt = readln().toInt()
    println(inputInt.reversed())

    println(inputInt  + inputInt.reversed())
}

fun reversed(stringToReverse: String = "HELLO WORLD!"): String {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }
    return finalString
}

fun String.reversedString(): String {
    // In the context of an extension function, "this" refers to the String. in this case
    val finalString = buildString {
        for (i in this@reversedString.lastIndex downTo 0) {
            append(this@reversedString[i])
        }
    }
    return finalString
}

fun Int.reversed(): Int {
    return this.toString().reversed().toInt()
}

//New section:

fun funct2() {
    println("Enter a String:")
    val input = readln()

    val lettersOnly = input.filter {
        it.isLetter()
    }
    println(lettersOnly)

    val favoriteNumbers = intArrayOf(1, 2, 3, 5, 10)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }
    println(evenNumbers)    //OUTPUT --> [2, 10]

    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    val lettersOnly2 = input.filter(lambda)
    println(lettersOnly2)

    // If we have more than one params, we cannot use it
    // we need to use parameter -> code like below
    val lettersOnly3 = input.filter { currentCharacter ->
        currentCharacter.isLetter()
    }
    println(lettersOnly3)

    val lettersOnly4 = input.myFilter {
        it.isLetter()
    }
    println(lettersOnly4)
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for(char in this@myFilter) {
            if (predicate(char)) {
                append(char)
            }
        }
    }
}

// New section
fun funct3() {
    println("Enter a String:")
    val input = readln()

    val favoriteNumbers = intArrayOf(1, 2, 3, 5, 10)
    val evenNumbers = favoriteNumbers.map {
        it * it
    }
    println(evenNumbers) //OUTPUT --> [1, 4, 9, 25, 100] (Squared values)
}

fun main() {
//    funct1()
//    funct2()
    funct3()
}















