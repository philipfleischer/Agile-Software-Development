fun main() {
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val helloWorld = "Hello World!"

    // THis filter function is called on an array of integers
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }
    // THis filter function is called on a string
    val lettersOnly = helloWorld.filter { it.isLetter() }

    val stringsList = listOf(
        "Hello World!",
        "Bye bye!",
        "How's it going?"
    )
    val integers = listOf(1, 2, 3, 4, 5)
    val filteredStrings = stringsList.myFilter { currentString ->
        currentString.length > 10
    }
    val filteredNumbers = integers.myFilter { it < 3 }

    println(filteredStrings)
    println(filteredNumbers)

    val result = makeNetworkCall()

    val filteredNumbers2 = integers.map { it < 3 }
    println("FilteredNumbers2 with map: $filteredNumbers2")

    val mappedNumbers1 = integers.map { it.toString() }
    println(mappedNumbers1)
    val mappedNumbers2 = integers.map { it.toDouble() }
    println(mappedNumbers2)
}

fun makeNetworkCall(): Result<Int, String> {
    //return Result.Success()
    return Result.Failure("Something went wrong")
}

// We have type param T
fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result.toList()
}

sealed class Result<out D, out E> {
    data class Success<D>(val data: D) : Result<D, Nothing>()
    data class Failure<E>(val error: E) : Result<Nothing, E>()
}
sealed interface Result2<out D, out E> {
    data class Success<D>(val data: D) : Result2<D, Nothing>
    data class Failure<E>(val error: E) : Result2<Nothing, E>
}