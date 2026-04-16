/**
 * Denne filen viser:
 * - generics
 * - generiske extension functions
 * - sealed class / sealed interface som Result-typer
 * - map og filter på lister
 */

fun demoGenericsAndHigherOrderFuncitons() {
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val helloWorld = "Hello World!"

    // filter på Int-array
    val evenNumbers = favoriteNumbers.filter {it % 2 == 0}
    println("Even numbers = $evenNumbers")

    // filter på String
    val lettersOnly = helloWorld.filter { it.isLetter() }
    println("Letters only = $lettersOnly")

    val strings = listOf(
        "Hello World!",
        "Bye bye!",
        "How is it going?",
    )
    val integers = listOf(1, 2, 3, 4, 5)

    val longStrings = strings.myGenericFilter { currentString ->
        currentString.length > 10
    }

    val smallNumbers = integers.myGenericFilter { it < 3 }

    println("Long strings = $longStrings")
    println("Small numbers = $smallNumbers")

    val networkResult = simulateNetworkCall()
    println("Network result = $networkResult")

    val mappedBooleans = integers.map { it < 3 }
    println("Mapped to booleans = $mappedBooleans")

    val mappedStrings = integers.map { it.toString() }
    println("Mapped strings = $mappedStrings")

    val mappedDouble = integers.map { it.toDouble() }
    println("Mapped double = $mappedDouble")
}

/**
 * Generisk extension function:
 * Fungerer for List<T> uansett hva T er.
 */
fun <T> List<T>.myGenericFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()

    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result.toList()
}

fun simulateNetworkCall(): NetworkResult<Int, String> {
    // Eksempel: kall feiler
    return NetworkResult.Failure("Something went wrong")
}

/**
 * Sealed class-variant av Result.
 * out betyr at typene er covariante.
 */
sealed class NetworkResult<out D, out E> {
    data class Success<D>(val value: D) : NetworkResult<D, Nothing>()
    data class Failure<E>(val error: E) : NetworkResult<Nothing, E>()
}

/**
 * Samme idé som sealed interface.
 */
sealed interface NetworkResultInterface<out D, out E> {
    data class Success<D>(val data: D) : NetworkResultInterface<D, Nothing>
    data class Failure<E>(val error: E) : NetworkResultInterface<E, Nothing>
}


























