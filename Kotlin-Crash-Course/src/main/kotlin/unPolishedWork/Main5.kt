package unPolishedWork

import kotlin.math.PI
import kotlin.math.sqrt

class Rectangle11(val width: Int, val height: Int)

// THis class should be a data class, since it mainly contains and uses data
data class Rectangle0(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

fun functio1() {
    println("Function1")
    val rect1 = Rectangle11(width = 5, height = 7)
    println(rect1.width)
    println(rect1.height)
}


//New Section:
fun maxArea1(rect1: Rectangle0, rect2: Rectangle0): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

fun functio2() {
    println("Function2")
    val rect2 = Rectangle0(width = 5f, height = 7f)

    println("The diagonal is ${rect2.diagonal}")
    println("The area is ${rect2.area}" )

    val rect3 = Rectangle0(width = 5f, height = 5f)
    println("The largest area is ${maxArea1(rect1 = rect2, rect2 = rect3)}")
}

//New Section:
data class Rectangle30(val width: Float, val height: Float): Shape0() {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference = 2 * width + 2 * height
}

data class Circle0(val radius: Float): Shape0() {
    override val area = radius * radius * PI.toFloat()
    val diameter = 2 * radius
    override val circumference = 2 * radius
}

// An abstract class is ... (no instances, inherits)
abstract class Shape0 {
    abstract val area: Float
    abstract val circumference: Float

    // Example of internal state, does not give meaning in this example
    var counter = 1

    fun inc() {
        counter++
    }
}

fun sumAreas(vararg shapes: Shape0): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

fun functio3() {
    println("Function3")
    val circle = Circle0(5f)
    println("The circle's radius is ${circle.radius}")
    println("The circle's area is ${circle.area}")
    println("The circle's diameter is ${circle.diameter}")
    val rect1 = Rectangle30(width = 5f, height = 7f)
    println("unPolishedWork.sumAreas: ${sumAreas(rect1, circle)}")

    println("rect1.counter = ${rect1.counter}")
    rect1.inc()
    println("rect1.counter = ${rect1.counter}")

    // Because of internal state, rect2 has its own counter
    val rect2 = Rectangle30(width = 5f, height = 5f)
    println("rect2.counter = ${rect2.counter}")
    rect2.inc()
    println("rect2.counter = ${rect2.counter}")
}



fun main() {
//    unPolishedWork.functio1()
//    unPolishedWork.functio2()
    functio3()
}















