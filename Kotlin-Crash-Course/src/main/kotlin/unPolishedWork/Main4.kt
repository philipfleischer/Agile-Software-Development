package unPolishedWork

import kotlin.math.PI
import kotlin.math.sqrt

class Rectangle1(val width: Int, val height: Int)

// THis class should be a data class, since it mainly contains and uses data
data class Rectangle(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

fun function1() {
    val rect1 = Rectangle1(width = 5, height = 7)
    println(rect1.width)
    println(rect1.height)
}


//New Section:
fun maxArea(rect1: Rectangle, rect2: Rectangle): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

fun function2() {
    val rect2 = Rectangle(width = 5f, height = 7f)

    println("The diagonal is ${rect2.diagonal}")
    println("The area is ${rect2.area}" )

    val rect3 = Rectangle(width = 5f, height = 5f)
    println("The largest area is ${maxArea(rect1 = rect2, rect2 = rect3)}")
}

//New Section:
data class Rectangle3(val width: Float, val height: Float): Shape {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference = 2 * width + 2 * height
}

data class Circle(val radius: Float): Shape {
    override val area = radius * radius * PI.toFloat()
    val diameter = 2 * radius
    override val circumference = 2 * radius
}

interface Shape {
    val area: Float
    val circumference: Float
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

fun function3() {
    val circle = Circle(5f)
    println("The circle's radius is ${circle.radius}")
    println("The circle's area is ${circle.area}")
    println("The circle's diameter is ${circle.diameter}")
    val rect1 = Rectangle3(width = 5f, height = 7f)
    println("unPolishedWork.sumAreas: ${sumAreas(rect1, circle)}")
}



fun main() {
//    unPolishedWork.function1()
//    unPolishedWork.function2()
    function3()
}















