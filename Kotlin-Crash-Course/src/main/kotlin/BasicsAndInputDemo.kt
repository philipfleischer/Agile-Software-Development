/**
 * Denne filen viser helt grunnleggende Kotlin:
 * - val vs var
 * - primitive typer
 * - string templates
 * - operatorer
 * - null-safety
 * - if / when
 * - Enkel input og feilhåndtering
 */

fun demoBasicsVariablesAndStrings() {
    val age: Int = 23
    val temperature: Float = 5f
    val exactValue: Double = 5.7
    val maybeNumber: Int? = null

    val isStudent: Boolean = true
    val hasJob: Boolean = false

    var greeting: String = "Hello"

    println("Age = $age")
    println("Temperature = $temperature")
    println("ExactValue = $exactValue")
    println("MaybeNumer = $maybeNumber")
    println("isStudent = $isStudent")
    println("HasJob = $hasJob")
    println("Greeting = $greeting")

    greeting= "Hi again"
    println("Updated greeting = $greeting")
}

fun demoArithmeticOperations() {
    val firstNumber = 4
    var secondNumber = 80

    secondNumber ++

    println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}")
}

fun demoComparisonAndLogicalOperators() {
    val a = 12
    val b = 12

    val areEqual = a == b
    val areBothEven = a % 2 == 0 && b % 2 == 0

    println("a == b -> $areEqual")
    println("Both numbers are even -> $areBothEven")
}

fun demoSimpleIfElse() {
    val condition = true

    if (condition) {
        println("Condition is true")
    } else {
        println("Condition is false")
    }

    val message = if (condition) "IF expression returned true" else "IF expression returned false"
    println(message)
}

fun demoReadIntAndCheckEvenUnsafe() {
    println("Enter a number:")
    val input = readln()

    // Kan krasje dersom brukeren skriver tekst
    val number = input.toInt()
    val isEven = number % 2 == 0

    println("You entered $number")
    println("Is even: $isEven")
}

fun demoReadIntAndCheckEvenSafeWithElvis() {
    println("Enter a number:")
    val input = readln()

    // Hvis parsing feiler, brukes 0 som standardverdi
    val number = input.toIntOrNull() ?: 0
    val isEven = number % 2 == 0

    println("Original input: $input")
    println("Parsed number: $number")
    println("Is even: $isEven")
}

fun demoSageCallWithIncrement() {
    println("Enter a number:")
    val input = readln()

    val incrementedNumber = input.toIntOrNull()?.inc()

    println("Original input: $input")
    println("Incremented number: $incrementedNumber")
}

fun demoDifferentNullSafeEvenChecks() {
    println("Enter a number:")
    val input = readln()

    val isEvenUsingComparison = input.toIntOrNull()?.rem(2) == 0
    val isEvenUsingEquals = input.toIntOrNull()?.rem(2)?.equals(0)

    println("Is even (comparison): $isEvenUsingComparison")
    println("Is even (equals): $isEvenUsingEquals")
}

fun demoNullCheckBeforeUsingNumber() {
    println("Enter a number:")
    val input = readln()
    val parsedNumber = input.toIntOrNull()

    if (parsedNumber != null) {
        val isEven = parsedNumber % 2 == 0
        println("Is even: $isEven")
    } else {
        println("You did not enter a valid number")
    }
}

fun demoNestedIfElseParity() {
    println("Enter a number:")
    val input = readln()
    val parsedNumber = input.toIntOrNull()

    if (parsedNumber != null) {
        if (parsedNumber % 2 == 0) {
            println("The number is even: $parsedNumber")
        } else {
            println("The number is odd: $parsedNumber")
        }
    } else {
        println("You did not enter a valid number")
    }
}

fun demoIfExpressionForParity() {
    println("Enter a number:")
    val input = readln()
    val parsedNumber = input.toIntOrNull()

    if (parsedNumber != null) {
        val output = if (parsedNumber % 2 == 0) {
            "The number is even: $parsedNumber"
        } else {
            "The number is odd: $parsedNumber"
        }
        println(output)
    } else {
        println("You did not enter a valid number")
    }
}

fun demoWhenWithoutArgument() {
    println("Enter a number:")
    val input = readln()
    val parsedNumber = input.toIntOrNull()

    if (parsedNumber != null) {
        val output = when {
            parsedNumber % 2 == 0 -> "The number is even"
            parsedNumber < 10 -> "The number is less than 10"
            else -> "The number is odd and 10 or larger"
        }
        println(output)
    } else {
        println("You did not enter a valid number")
    }
}

fun demoWhenWithCodeBlock() {
    println("Enter a number:")
    val input = readln()
    val parsedNumber = input.toIntOrNull()

    if (parsedNumber != null) {
        val output = when {
            parsedNumber % 2 == 0 -> {
                println("We are inside the even-number branch")
                "The number is even"
            }
            parsedNumber < 10 -> "The number is odd and less than 10"
            else -> "The number is odd and 10 or larger"
        }
        println(output)
    } else {
        println("You did not enter a valid number")
    }
}

fun demoWhenWithArgument() {
    println("Enter a number:")
    val input = readln()
    val parsedNumber = input.toIntOrNull()

    val output = when (parsedNumber) {
        null -> "Please enter a valid Integer"
        3 -> "The number is odd and three"
        5 -> "The number is odd and five"
        in 10..20 -> "The number is between 10 and 20"
        else -> "No special message for this number"
    }
    println(output)
}

fun demoTryCatchParsing() {
    println("Enter a number:")
    val input = readln()

    val parsedNumber = try {
        input.toInt()
    } catch (exception: NumberFormatException) {
        0
    }

    val output = when (parsedNumber) {
        3 -> "The number is three"
        5 -> "The number is five"
        in 4..20 -> "The number is between 4 and 20"
        else -> "You did not enter a valid number"
    }
    println(output)
}
