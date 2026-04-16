import kotlin.math.PI
import kotlin.math.sqrt

/**
 * Denne filen viser:
 * - vanlig klasse
 * - data class
 * - interface
 * - polymorfisme
 * - vararg
 */

class BasicRectangle(val width: Double, val height: Double)

/**
 * Data class passer godt når klasen hovedsaklig holder på data.
 */
data class MeasuredRectangle(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

fun demoRegularClassVsDataClass() {
    val rectangle = BasicRectangle(width = 5.0, height = 7.0)
    println("Width = ${rectangle.width}, Height = ${rectangle.height}")
}

fun findLargesRectangleArea(first: MeasuredRectangle, second: MeasuredRectangle): Float {
    return maxOf(first.area, second.area)
}

fun demoDataClassAndArea() {
    val firstRectangle = MeasuredRectangle(width = 5f, height = 7f)

    println("Diagonal = ${firstRectangle.diagonal}")
    println("Area = ${firstRectangle.area}")

    val secondRectangle = MeasuredRectangle(width = 5f, height = 5f)
    println("Largest area = ${findLargesRectangleArea(firstRectangle, secondRectangle)}")
}

interface GeometricShape {
    val area: Float
    val circumference: Float
}

data class InterfaceRectangle(
    val width: Float,
    val height: Float
): GeometricShape {
    val diagonal: Float = sqrt(width*width + height*height)
    override val area: Float = width * height
    override val circumference: Float = 2 * width + 2 * height
}

data class InterfaceCircle(
    val radius: Float
): GeometricShape {
    override val area: Float = radius * radius * PI.toFloat()
    val diameter: Float = 2 * radius
    override val circumference: Float = 2 * PI.toFloat() * radius
}

fun sumShapeAreas(vararg shapes: GeometricShape): Double {
    return shapes.sumOf {shape ->
        shape.area.toDouble()
    }
}

fun demoInterfaceAndPolymorphism() {
    val circle = InterfaceCircle(5f)
    println("Circle radius = ${circle.radius}")
    println("Circle area = ${circle.area}")
    println("Circle diameter = ${circle.diameter}")

    val rectangle = InterfaceRectangle(width = 5f, height = 7f)
    println("Total area = ${sumShapeAreas(rectangle, circle)}")
}
































