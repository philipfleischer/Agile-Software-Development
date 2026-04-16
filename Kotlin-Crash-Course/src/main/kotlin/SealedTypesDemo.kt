import kotlin.math.PI
import kotlin.math.sqrt

/**
 * Denne filen viser:
 * - sealed interface
 * - when med og uten else
 * - forskjellen på vanlig interface og sealed interface
 */

interface OpenShape {
    val area: Float
    val circumference: Float
}

sealed interface ClosedShape {
    val area: Float
    val circumference: Float
}

data class OpenRectangle(
    val width: Float,
    val height: Float
) : OpenShape, ClosedShape {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference: Float = 2 * width + 2 * height
}

data class OpenCircle(
    val radius: Float
) : OpenShape, ClosedShape {
    override val area: Float = radius * radius * PI.toFloat()
    val diameter: Float = 2 * radius
    override val circumference: Float = 2 * radius * PI.toFloat()
}

fun printOpenShapeKinds(vararg shapes: OpenShape) {
    for (shape in shapes) {
        when (shape) {
            is OpenCircle -> println("This is a circle")
            is OpenRectangle -> println("This is a rectangle")
            else -> println("This is not a OpenShape")
        }
    }
}

/**
 * Når vi bruker vanlig interface, må vi ha else,
 * fordi kompilatoren ikke vet alle mulige implementasjoner.
 */
fun describeOpenShape(vararg shapes: OpenShape) {
    for (shape in shapes) {
        val output = when (shape) {
            is OpenCircle -> println("This is a circle")
            is OpenRectangle -> println("This is a rectangle")
            else -> println("This is not a OpenShape")
        }
        println(output)
    }
}

/**
 * Når vi bruker sealed interface, vet kompilatoren alle tillatte typer.
 * Derfor trengs ikke else.
 */
fun describeClosedShape(vararg shapes: ClosedShape) {
    for (shape in shapes) {
        val output = when (shape) {
            is OpenCircle -> println("This is a circle")
            is OpenRectangle -> println("This is a rectangle")
        }
        println(output)
    }
}

fun sumOpenShapeAreas(vararg shapes: OpenShape): Double {
    return shapes.sumOf { it.area.toDouble() }
}

fun demoSealedAndWhen() {
    val circle = OpenCircle(5f)
    val rectangle = OpenRectangle(width = 5f, height = 7f)

    println("Circle radius = ${circle.radius}")
    println("Circle area = ${circle.area}")
    println("Circle diameter = ${circle.diameter}")
    println("Total area = ${sumOpenShapeAreas(rectangle, circle)}")

    println("printOpenShapeKinds:")
    printOpenShapeKinds(rectangle, circle)

    println("describeOpenShapes:")
    describeOpenShape(rectangle, circle)

    println("describeClosedShapes:")
    describeClosedShape(rectangle, circle)
}






























