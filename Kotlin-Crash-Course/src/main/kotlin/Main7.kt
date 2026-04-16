import kotlin.math.PI
import kotlin.math.sqrt

// THis class should be a data class, since it mainly contains and uses data
data class Rectangles0(val width: Float, val height: Float) {
    val diagonal: Float = sqrt(width * width + height * height)
    val area: Float = width * height
}

//New Section:
fun maxArea(rect1: Rectangles0, rect2: Rectangles0): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

//New Section:
data class Rectangles30(val width: Float, val height: Float): Shapes {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference = 2 * width + 2 * height
}

data class Circles0(val radius: Float): Shapes {
    override val area = radius * radius * PI.toFloat()
    val diameter = 2 * radius
    override val circumference = 2 * radius * PI.toFloat()
}


interface Shapes01 {
    val area: Float
    val circumference: Float
}

fun sumAreaes0(vararg shapes: Shapes01): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

//ENUMERATION CLASS
enum class Country(val code: String) {
    GERMANY("DE"), FRANCE("FR"), USA("US")
}

fun greetMe(country: Country): String {
    return when (country) {
        Country.GERMANY -> "Germany, Guten Tag!"
        Country.FRANCE -> "France, Bonjour!"
        Country.USA -> "USA, Hello!"
    }
}

fun fa4() {
    println(greetMe(Country.GERMANY))

    println("Countries.entries:")
    for (country in Country.entries) {
        println(country)
    }
}



fun main() {
//    fa1()
//    fa2()
//    fa3()
    fa4()
}















