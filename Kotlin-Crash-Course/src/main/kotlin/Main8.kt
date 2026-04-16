import kotlin.math.PI
import kotlin.math.sqrt

// THis class should be a data class, since it mainly contains and uses data
data class Rectangles00(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

//New Section:
fun maxArea01(rect1: Rectangles00, rect2: Rectangles00): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

//New Section:
data class Rectangles300(val width: Float, val height: Float): Shapes {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference = 2 * width + 2 * height
}

data class Circles00(val radius: Float): Shapes {
    override val area = radius * radius * PI.toFloat()
    val diameter = 2 * radius
    override val circumference = 2 * radius * PI.toFloat()
}


interface Shape01 {
    val area: Float
    val circumference: Float
}

object FixSizeSquare: Shape01 {
    override val area: Float = 16f
    override val circumference: Float = 16f
}

fun obje1() {
    println(FixSizeSquare.area)
}



fun main() {
 obje1()
}















