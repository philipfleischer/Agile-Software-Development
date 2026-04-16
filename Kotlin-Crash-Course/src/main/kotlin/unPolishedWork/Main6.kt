package unPolishedWork

import kotlin.math.PI
import kotlin.math.sqrt

// THis class should be a data class, since it mainly contains and uses data
data class Rectangles(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

fun fu1() {
    val rect1 = Rectangle1(width = 5, height = 7)
    println(rect1.width)
    println(rect1.height)
}


//New Section:
fun maxArea(rect1: Rectangles, rect2: Rectangles): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

fun fu2() {
    val rect2 = Rectangles(width = 5f, height = 7f)

    println("The diagonal is ${rect2.diagonal}")
    println("The area is ${rect2.area}" )

    val rect3 = Rectangles(width = 5f, height = 5f)
    println("The largest area is ${maxArea(rect1 = rect2, rect2 = rect3)}")
}

//New Section:
data class Rectangles3(val width: Float, val height: Float): Shapes {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference = 2 * width + 2 * height
}

data class Circles(val radius: Float): Shapes {
    override val area = radius * radius * PI.toFloat()
    val diameter = 2 * radius
    override val circumference = 2 * radius * PI.toFloat()
}

interface Shapes {
    val area: Float
    val circumference: Float
}

sealed interface Shapes2 {
    val area: Float
    val circumference: Float
}

fun printShapes(vararg shapes: Shapes) {
    for (shape in shapes) {
        when(shape) {
            is Circles -> println("This is a unPolishedWork.Circle SHAPE!")
            is Rectangles3 -> println("This is a unPolishedWork.Rectangle SHAPE!")
        }
    }
}

fun printShapes2(vararg shapes: Shapes) {
    for (shape in shapes) {
        val output = when(shape) {
            is Circles -> "This is a unPolishedWork.Circle SHAPE!"
            is Rectangles3 -> "This is a unPolishedWork.Rectangle SHAPE!"
            else -> "This is not a unPolishedWork.Circle or unPolishedWork.Rectangle SHAPE!"
        }
        println(output)
    }
}

// else -> is not needed since it is a sealed interface and we know which can be used
fun printShapes3(vararg shapes: Shapes2) {
    for (shape in shapes) {
        val output = when(shape) {
            is Circles -> "This is a unPolishedWork.Circle SHAPE!"
            is Rectangles3 -> "This is a unPolishedWork.Rectangle SHAPE!"
        }
        println(output)
    }
}

fun sumAreaes(vararg shapes: Shapes): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

fun fu3() {
    val circle = Circles(5f)
    println("The circle's radius is ${circle.radius}")
    println("The circle's area is ${circle.area}")
    println("The circle's diameter is ${circle.diameter}")
    val rect1 = Rectangles3(width = 5f, height = 7f)
    println("unPolishedWork.sumAreaes: ${sumAreaes(rect1, circle)}")

    println("PrinShapes1;: ")
    printShapes(rect1, circle)
    println("PrinShapes2;: ")
    printShapes2(rect1, circle)
    printShapes2(rect1)
}



fun main() {
//    unPolishedWork.fu1()
//    unPolishedWork.fu2()
    fu3()
}















