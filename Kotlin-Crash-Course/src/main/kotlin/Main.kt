fun main() {
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

    var num1 = 4
    var num2 = 80
    num2++
    println(" $num1 * $num2 = ${num1 * num2}")
    // OUTPUT --> 4 * 81 = 324
    println(" $num1 / $num2 = ${num1 / num2}")
    // OUTPUT --> 4 / 81 = 0
    println(" $num1 % $num2 = ${num1 % num2}")
    // OUTPUT --> 4 % 81 = 4

    val e = 12
    val r = 12
    val areBothEven = e % 2 == 0 && r % 2 == 0
    println("Is e an even number? $areBothEven")
    // OUTPUT --> Is e an even number? true

    if (tr){
        println("Hepppp")   //OUTPUT --> Hepppp
    } else {
        println("NOOOO")
    }

    println(if (tr) println("ÅÅÅÅÅ") else "NO")
    // OUTPUT --> ÅÅÅÅÅ

    println("Please enter a number:")
    val input = readln()    // INPUT: 40
    //val isEven = input % 2 == 0   This gives us error, since input is a string
    val inputAsInteger = input.toInt()
    val isEven = inputAsInteger % 2 == 0
    println("You have entered $input. The number is even = $isEven")
    // OUTPUT --> You have entered 40. The number is even = true

    // Now we do not crash on string being written
    println("Please enter a number:")
    val inpu2 = readln()
    val inpu2AsInteger = inpu2.toIntOrNull() ?: 0   // NUllable elvis operator, if it is not int, then it is 0
    val isEvens = inpu2AsInteger % 2 == 0
    println("You have entered $inpu2 and $inpu2AsInteger, iseven = $isEvens")
    //OUTPUT --> You have entered H and 0, iseven = true
    // We get isEvens = true since 0 is an even number


    println("Please enter a number:")
    val inpu4 = readln()
    val inpu4AsInteger = inpu4.toIntOrNull()?.inc()
    println("The ${inpu4} incremented -> The incremented number is $inpu4AsInteger")
    //OUTPUT --> The 20 incremented -> The incremented number is 21

    println("Please enter a number:")
    val inpu5 = readln()    // INPUT: 20
    val inpu5AsInteger = inpu5.toIntOrNull()?.rem(2) == 0 // Remainder == 0 -> True
    val inpu5AsInteger2 = inpu5.toIntOrNull()?.rem(2)?.equals(0)
    val assertInpu5 = inpu5.toIntOrNull()?.rem(2)?.equals(0)!!  //This asserts
    println("Is even? $inpu5AsInteger")
    //OTUPUT --> Is even? true
    println("Is even? $inpu5AsInteger2")
    //OTUPUT --> Is even? true
    println("Is inpu5 not null? = $assertInpu5")
    // OUTPUT --> Is inpu5 not null? = true
}















