import kotlin.math.PI
import kotlin.math.sqrt

/**
 * Denne filen viser:
 * - abstract class
 * - arv
 * - felles state og oppførsel
 */

class PlainRectangleExample(val width: Float, val height: Float)

data class SimpleRectangleData(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

fun demoSimpleClassAgain() {
    println("DemoSimpleClassAgain")
    val rectangle = PlainRectangleExample(width = 5f, height = 7f)
    println("Rectangle width = ${rectangle.width}")
    println("Rectangle height = ${rectangle.height}")
}

fun findLargesSimpleRectangleArea(first: SimpleRectangleData, second: SimpleRectangleData): Float {
    return maxOf(first.area, second.area)
}

fun demoSimpleRectangleData() {
    println("DemoSimpleRectangleData")
    val firstRectangle = SimpleRectangleData(width = 5f, height = 7f)

    println("Diagonal = ${firstRectangle.diagonal}")
    println("Area = ${firstRectangle.area}")

    val secondRectangle = SimpleRectangleData(width = 5f, height = 5f)
    println("Largest area = ${findLargesSimpleRectangleArea(firstRectangle, secondRectangle)}")
}

/**
 * Abstract class:
 * - Kan ikke instantieres direkte.
 * - brukes som felles baseklasse
 */
abstract class AbstractShape {
    abstract val area: Float
    abstract val circumference: Float

    // Eksempel på intern tilstand som alle subklasser arver
    var counter: Int = 1

    fun incrementCounter() {
        counter++
    }
}

data class AbstractRectangle(
    val width: Float,
    val height: Float
) : AbstractShape() {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference: Float = 2 * width + 2 * height
}

data class AbstractCircle(
    val radius: Float
) : AbstractShape() {
    override val area: Float = radius * radius * PI.toFloat()
    val diameter: Float = 2 * radius
    override val circumference: Float = 2 * radius * PI.toFloat()
}

fun sumAbstractShapeAreas(vararg shapes: AbstractShape): Double {
    return shapes.sumOf { shape ->
        shape.area.toDouble()
    }
}

fun demoAbstractClassUsage() {
    println("demoAbstractClassUsage")

    val circle = AbstractCircle(5f)
    println("Circle radius = ${circle.radius}")
    println("Circle area = ${circle.area}")
    println("Circle diameter = ${circle.diameter}")

    val firstRectangle = AbstractRectangle(width = 5f, height = 7f)
    println("Total area = ${sumAbstractShapeAreas(firstRectangle, circle)}")

    println("firstRecangle.counter = ${firstRectangle.counter}")
    firstRectangle.incrementCounter()
    println("firstRectangle.counter after increment = ${firstRectangle.counter}")

    val secondRectangle = AbstractRectangle(width = 5f, height = 5f)
    println("secondRecangle.counter = ${secondRectangle.counter}")
    secondRectangle.incrementCounter()
    println("secondRectangle.counter after increment = ${secondRectangle.counter}")
}





































