package func

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Denne testklassen brukes både til å øve på funksjonell programmering
 * i Kotlin og til å forstå hva de viktigste liste-funksjonene faktisk gjør.
 *
 * Tanken er:
 * - Vi starter med en enkel liste
 * - Vi bruker en funksjon på lista
 * - Vi sjekker resultatet med assertEquals
 *
 * Dette er veldig nyttig til eksamen, fordi du både ser syntaksen
 * og effekten av hver funksjon.
 */
class FunksjonellProgrammeringTest {

    /**
     * En enkel liste vi bruker i mange av testene.
     */
    private val list = listOf(1, 2, 3, 4)

    @Test
    fun testFirst() {
        // first() henter ut det første elementet i lista.
        // I lista [1, 2, 3, 4] er første element 1.
        assertEquals(1, list.first())
    }

    @Test
    fun testLast() {
        // last() henter ut det siste elementet i lista.
        // I lista [1, 2, 3, 4] er siste element 4.
        assertEquals(4, list.last())
    }

    @Test
    fun testForEach() {
        /**
         * forEach går gjennom hvert element i lista én etter én.
         *
         * Viktig:
         * - forEach lager ikke en ny liste
         * - den brukes når vi vil gjøre noe med hvert element
         *
         * Her bruker vi den til å summere alle tallene i lista.
         */
        var sum = 0

        list.forEach { tall ->
            sum += tall
        }

        // 1 + 2 + 3 + 4 = 10
        assertEquals(10, sum)
    }

    @Test
    fun testMap() {
        /**
         * map brukes når vi vil lage en ny liste
         * der hvert element er "omgjort" på en eller annen måte.
         *
         * Her kvadrerer vi hvert tall:
         * 1 -> 1
         * 2 -> 4
         * 3 -> 9
         * 4 -> 16
         */
        val kvadrert = list.map { it * it }

        assertEquals(listOf(1, 4, 9, 16), kvadrert)
    }

    @Test
    fun testFilter() {
        /**
         * filter brukes når vi vil beholde bare de elementene
         * som oppfyller en betingelse.
         *
         * Her beholder vi bare partall.
         */
        val partall = list.filter { it % 2 == 0 }

        assertEquals(listOf(2, 4), partall)
    }

    @Test
    fun testFold() {
        /**
         * fold brukes til å "samle sammen" hele lista til én verdi.
         *
         * Format:
         * fold(startverdi) { accumulator, element -> ny_verdi }
         *
         * Her summerer vi alle tallene i lista.
         *
         * Startverdi = 0
         *
         * Steg for steg:
         * acc = 0
         * acc = 0 + 1 = 1
         * acc = 1 + 2 = 3
         * acc = 3 + 3 = 6
         * acc = 6 + 4 = 10
         */
        val sum = list.fold(0) { acc, tall -> acc + tall }

        assertEquals(10, sum)
    }

    @Test
    fun testFoldMedProdukt() {
        /**
         * fold kan også brukes til produkt.
         *
         * Her ganger vi sammen alle elementene:
         * 1 * 2 * 3 * 4 = 24
         *
         * Når vi ganger, må startverdien være 1,
         * fordi 1 er det nøytrale elementet for multiplikasjon.
         */
        val produkt = list.fold(1) { acc, tall -> acc * tall }

        assertEquals(24, produkt)
    }

    @Test
    fun testSortedBy() {
        /**
         * sortedBy sorterer lista etter en regel.
         *
         * sortedBy { it } betyr:
         * sorter stigende etter verdien selv
         *
         * sortedBy { -it } betyr:
         * sorter synkende, fordi vi sorterer etter den negative verdien
         */
        assertEquals(listOf(1, 2, 3, 4), list.sortedBy { it })
        assertEquals(listOf(4, 3, 2, 1), list.sortedBy { -it })
    }

    @Test
    fun testFind() {
        /**
         * find returnerer det første elementet som oppfyller betingelsen.
         *
         * Her leter vi etter første tall som er større enn 2.
         * Lista er [1, 2, 3, 4], så svaret blir 3.
         */
        val funnet = list.find { it > 2 }

        assertEquals(3, funnet)
    }

    @Test
    fun testFindIngenTreff() {
        /**
         * Hvis find ikke finner noe, returneres null.
         *
         * Her leter vi etter et tall større enn 10,
         * men det finnes ikke i lista.
         */
        val funnet = list.find { it > 10 }

        assertNull(funnet)
    }

    @Test
    fun testFindLast() {
        /**
         * findLast returnerer det siste elementet
         * som oppfyller betingelsen.
         *
         * Her leter vi etter siste partall i [1, 2, 3, 4].
         * Partallene er 2 og 4, så siste blir 4.
         */
        val sisteFunnet = list.findLast { it % 2 == 0 }

        assertEquals(4, sisteFunnet)
    }

    @Test
    fun testCount() {
        /**
         * count teller hvor mange elementer som oppfyller en betingelse.
         *
         * Her teller vi antall partall:
         * 2 og 4 -> totalt 2 stk
         */
        val antallPartall = list.count { it % 2 == 0 }

        assertEquals(2, antallPartall)
    }

    @Test
    fun testPartition() {
        /**
         * partition deler lista i to lister:
         * - første liste: elementer som oppfyller betingelsen
         * - andre liste: elementer som ikke oppfyller betingelsen
         *
         * Her deler vi i partall og oddetall.
         */
        val (partall, oddetall) = list.partition { it % 2 == 0 }

        assertEquals(listOf(2, 4), partall)
        assertEquals(listOf(1, 3), oddetall)
    }

    @Test
    fun testZipWithNext() {
        /**
         * zipWithNext lager par av nabo-elementer.
         *
         * Fra [1, 2, 3, 4] får vi:
         * (1, 2), (2, 3), (3, 4)
         */
        val naboPar = list.zipWithNext()

        assertEquals(
            listOf(
                Pair(1, 2),
                Pair(2, 3),
                Pair(3, 4)
            ),
            naboPar
        )
    }

    @Test
    fun testZipWithNextForskjeller() {
        /**
         * zipWithNext kan også brukes med en funksjon.
         *
         * Her finner vi forskjellen mellom nabo-elementer:
         * 2 - 1 = 1
         * 3 - 2 = 1
         * 4 - 3 = 1
         */
        val forskjeller = list.zipWithNext { a, b -> b - a }

        assertEquals(listOf(1, 1, 1), forskjeller)
    }

    @Test
    fun testZip() {
        /**
         * zip kobler sammen to lister element for element.
         *
         * Eksempel:
         * [1, 2, 3, 4]
         * ["a", "b", "c", "d"]
         *
         * blir til:
         * (1, "a"), (2, "b"), (3, "c"), (4, "d")
         */
        val bokstaver = listOf("a", "b", "c", "d")
        val kombinert = list.zip(bokstaver)

        assertEquals(
            listOf(
                Pair(1, "a"),
                Pair(2, "b"),
                Pair(3, "c"),
                Pair(4, "d")
            ),
            kombinert
        )
    }

    @Test
    fun testZipMedBeregning() {
        /**
         * zip kan også kombineres med en funksjon.
         *
         * Her legger vi sammen elementer fra to lister:
         * [1, 2, 3, 4]
         * [10, 20, 30, 40]
         *
         * blir:
         * 11, 22, 33, 44
         */
        val andreTall = listOf(10, 20, 30, 40)
        val summert = list.zip(andreTall) { a, b -> a + b }

        assertEquals(listOf(11, 22, 33, 44), summert)
    }
}


//Noen veldig viktige eksamensting å huske fra denne fila:
//•	forEach brukes når du vil gjøre noe med hvert element, men ikke nødvendigvis lage en ny liste.
//•	map lager en ny liste med omformede verdier.
//•	filter beholder bare elementer som passer en betingelse.
//•	fold samler hele lista til én verdi.
//•	find gir første treff.
//•	findLast gir siste treff.
//•	count teller antall treff.
//•	partition deler i to grupper.
//•	zipWithNext ser på nabo-elementer.
//•	zip kobler sammen to lister.
//
//En liten ekstra ting: i assertEquals er det vanligst å skrive:
//assertEquals(forventet, faktisk)
//altså forventet verdi først. Det gjør testene lettere å lese.