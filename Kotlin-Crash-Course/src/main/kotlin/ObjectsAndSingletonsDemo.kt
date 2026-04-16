/**
 * Denne filen viser:
 * - object
 * - singleton
 * - hvordan et objekt brukes som én delt instans
 */

interface MeasurableShape {
    val area: Float
    val circumference: Float
}

/**
 * object = singleton
 * Det finnes bare én instans av denne i hele programmet.
 */
object FixedSizeSquare: MeasurableShape {
    override val area: Float = 16f
    override val circumference: Float = 16f
}

fun demoSingletonObject() {
    println("FixedSizeSquare.area = ${FixedSizeSquare.area}")
    println("FixedSizeSquare.circumference = ${FixedSizeSquare.circumference}")
}