fun funnc1() {
    println("Write number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Checking if number is not a number and if the number is less that the length/size
    // of the favoriteNumbers array, so we handle indexOutOfBounds Exceptions
    if (inputAsInteger != null && inputAsInteger < favoriteNumbers.size) {
        println("Your number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("That index does not exist!")
    }

    println(favoriteNumbers[0])
    println(favoriteNumbers[5])

    println(favoriteNumbers.getOrNull(4))
}

fun funnc2() {
    println("Write number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    if (inputAsInteger != null && inputAsInteger in 0 .. favoriteNumbers.lastIndex) {
        println("Your number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("That index does not exist!")
    }
}

fun funnc3() {
    println("Write a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) + 90
    favoriteNumbers[2] = 77

    if (inputAsInteger != null && inputAsInteger in 0 ..favoriteNumbers.lastIndex) {
        println("Your number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("That index does not exist!")
    }
}

fun funnc4() {
    println("How many numbers will you enter?")
    // We get amount of times to loop, if not integer -> return 0
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var sum = 0
    var i = 0
    while(i < amountOfNumbers) {
        println("Write the ${i + 1}-th number:  ")
        val number = readln().toIntOrNull() ?: 0
        //Instead of ?: 0, we could use ?: continue, which continues until input is a valid integer
        // We could also use ?: break, which would have "crashed" the program on invalid input
        sum += number
        i++
    }
    println("The total sum is $sum")
}

//Not a good solution
fun funnc5() {
    println("How many numbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var numbers = intArrayOf()
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter a number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers += number
        i++
    }
    println("Numbers: ${numbers.contentToString()}")
}

fun funnc6() {
    println("How many numbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    val numbers = mutableListOf<Int>()
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter a number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
        i++
    }
    println("Numbers: $numbers")
}

fun funnc7() {
    println("How many numbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    val numbers = mutableListOf<Int>()
    //for (i in 1 .. amountOfNumbers) {
    for (i in 0 until amountOfNumbers) {
        println("Please enter a number #${i + 1}")
        val number = readln().toIntOrNull() ?: 0
        numbers += number
    }

    for (number in numbers) {
        println(number)
    }
    println("Numbers: $numbers")
}

fun funnc8() {
    println("Enter a string:")
    val input = readln()

    for (char in input) {
        println(char)
    }
}

// This function takes a string and returns the reverse string
fun funnc9() {
    println("Enter a String:")
    val input = readln()

    val finalString = buildString {
        // from the last index to the first index, append to new string
        for (i in input.lastIndex downTo 0) {
            append(input[i])
        }
    }
    println(finalString)
}

fun main() {
//    funnc1()
//    funnc2()
//    funnc3()
//    funnc4()
//    funnc5()
//    funnc6()
//    funnc7()
//    funnc8()
    funnc9()
}















