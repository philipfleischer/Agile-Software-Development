fun func1() {
    val x: Int = 5
    val z: Float = 5F
    val p: Double = 5.7
    val y: Int? = null

    val tr: Boolean = true
    val fa: Boolean = false

    var st: String = "YOOOO"

    println("Hello World + $x + $y + $z + $p + $st")
    // OUTPUT --> Hello World + 5 + null + 5.0 + 5.7 + YOOOO

    st = "NPPPP"
    println("NEW: $st")
    // OUTPUT --> NEW: NPPPP
}

fun func2() {
    var num1 = 4
    var num2 = 80
    num2++
    println(" $num1 * $num2 = ${num1 * num2}")
    // OUTPUT --> 4 * 81 = 324
    println(" $num1 / $num2 = ${num1 / num2}")
    // OUTPUT --> 4 / 81 = 0
    println(" $num1 % $num2 = ${num1 % num2}")
    // OUTPUT --> 4 % 81 = 4
}

fun func3() {
    val e = 12
    val r = 12
    val areBothEven = e % 2 == 0 && r % 2 == 0
    println("Is e an even number? $areBothEven")
    // OUTPUT --> Is e an even number? true
}

fun func4() {
    val tr = true
    if (tr){
        println("Hepppp")   //OUTPUT --> Hepppp
    } else {
        println("NOOOO")
    }

    println(if (tr) println("ÅÅÅÅÅ") else "NO")
    // OUTPUT --> ÅÅÅÅÅ
}

fun func5() {
    println("Please enter a number (1):")
    val input = readln()    // INPUT: 40
    //val isEven = input % 2 == 0   This gives us error, since input is a string
    val inputAsInteger = input.toInt()
    val isEven = inputAsInteger % 2 == 0
    println("You have entered $input. The number is even = $isEven")
    // OUTPUT --> You have entered 40. The number is even = true
}

fun func6() {
    // Now we do not crash on string being written
    println("Please enter a number (2):")
    val inpu2 = readln()
    val inpu2AsInteger = inpu2.toIntOrNull() ?: 0   // NUllable elvis operator, if it is not int, then it is 0
    val isEvens = inpu2AsInteger % 2 == 0
    println("You have entered $inpu2 and $inpu2AsInteger, iseven = $isEvens")
    //OUTPUT --> You have entered H and 0, iseven = true
    // We get isEvens = true since 0 is an even number
}

fun func7() {
    println("Please enter a number (3):")
    val inpu3 = readln()
    val inpu3AsInteger = inpu3.toIntOrNull()?.inc()
    println("The ${inpu3} incremented -> The incremented number is $inpu3AsInteger")
    //OUTPUT --> The 20 incremented -> The incremented number is 21
}

fun func8() {
    println("Please enter a number (4):")
    val inpu4 = readln()    // INPUT: 20
    val inpu4AsInteger = inpu4.toIntOrNull()?.rem(2) == 0 // Remainder == 0 -> True
    val inpu4AsInteger2 = inpu4.toIntOrNull()?.rem(2)?.equals(0)
    val assertInpu4 = inpu4.toIntOrNull()?.rem(2)?.equals(0)!!  //This asserts
    println("Is even? $inpu4AsInteger")
    //OTUPUT --> Is even? true
    println("Is even? $inpu4AsInteger2")
    //OTUPUT --> Is even? true
    println("Is inpu5 not null? = $assertInpu4")
    // OUTPUT --> Is inpu5 not null? = true
}

fun func9() {
    println("Please enter a number (5):")
    val inpu5 = readln()
    val inpu5AsInteger = inpu5.toIntOrNull()

    //This is null safety mechanism, since inside the if, inpu6 cannot be null
    if (inpu5AsInteger != null) {
        val isEven = inpu5AsInteger % 2 == 0
        println("Is even? $isEven")
    }
    // If INPUT is not null (inp is a number), then (input is for example 20):
    // OUTPUT --> Is even? true
    //We get no errors or crashes if the input is a string, nothing happens
}

fun func10() {
    println("Please enter a number (6):")
    val inpu6 = readln()
    val inpu6AsInteger = inpu6.toIntOrNull()
    if (inpu6AsInteger != null) {
        val isEven = inpu6AsInteger % 2 == 0

        if (isEven) println("The number is even!") else println("The number is odd!")

    } else {
        println("Dude, enter a valid number!")
    }
}

fun func11() {
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val isEven = inputAsInteger % 2 == 0

        if (!isEven) println("The number is Odd!")
    } else println("Dude, enter a valid number!")
}

fun func12() {
    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val output = if (inputAsInteger % 2 == 0) "The number is even!" else "The number is odd!"
        println(output)
    } else println("Dude, enter a valid number!")
}

fun func13() {
    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val output = when {
            inputAsInteger % 2 == 0 -> "The number is even!"
            inputAsInteger < 10 -> "The number is odd and less than 10!"
            else -> "The number is odd and greater than 10!"
        }
        println(output)
    }
}

fun func14() {
    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val output = when {
            inputAsInteger % 2 == 0 -> {
                println("Here you ...")
                println("The number is even!")
                println("... go!")
            }
            inputAsInteger < 10 -> "The number is odd and less than 10!"
            else -> "The number is odd and greater than 10!"
        }
        println(output)
    }
}

fun func15() {
    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    val output = when(inputAsInteger) {
        null -> "Dude, enter a valid number!"
        3 -> "The number is Three"
        5 -> "The number is Five"
        in 10 .. 20 -> "The number is between 10 and 20"
        else -> "I have no idea what to print!"
    }
    println(output)
}

fun func16() {
    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    val output = when(inputAsInteger){
        3 -> "The number is Three"
        5 -> "The number is Five"
        in 4..20 -> "The number is between 4 and 20"
        else -> "I have no idea what to print!"
    }
    println(output)
}

fun main() {
//    func1()
//    func2()
//    func3()
//    func4()
//    func5()
//    func6()
//    func7()
//    func8()
//    func9()
//    func10()
//    func11()
//    func12()
//    func13()
//    func14()
//    func15()
    func16()
}















