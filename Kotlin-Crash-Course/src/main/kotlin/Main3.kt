// This function takes a string and returns the reverse string
fun funct9() {
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

fun reversed() {}

fun main() {
//    funct1()
//    funct2()
//    funct3()
//    funct4()
//    funct5()
//    funct6()
//    funct7()
//    funct8()
    funct9()
}















