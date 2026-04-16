import unPolishedWork.Country

/**
 * Denne filen viser:
 * - enum class
 * - when med enum
 * - entries
 */

enum class CountryCode(val code: String) {
    GERMANY("DE"),
    FRANCE("FR"),
    USA("US")
}

fun greetingForCountry(country: CountryCode): String {
    return when (country) {
        CountryCode.GERMANY -> "Germany: Guten Tag!"
        CountryCode.FRANCE -> "France: Bonjour!"
        CountryCode.USA -> "USA: Hello!"
    }
}

fun demoEnums() {
    println(greetingForCountry(CountryCode.FRANCE))

    println("All countries:")
    for (country in CountryCode.entries) {
        println("${country.name} -> ${country.code}")
    }
}