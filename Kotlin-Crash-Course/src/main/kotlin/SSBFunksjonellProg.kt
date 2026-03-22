package func

/**
 * En enkel dataklasse som representerer et navn.
 *
 * id         -> en unik identifikator
 * name       -> selve navnet
 * popularity -> hvor populært navnet er (f.eks. antall personer med dette navnet)
 */
data class Name(val id: String, val name: String, val popularity: Int)


fun sSBFunksjonellProg() {

    /**
     * Siden vi ikke har readSSB() tilgjengelig,
     * lager vi en liten testliste manuelt.
     *
     * Denne simulerer data fra SSB (Statistisk Sentralbyrå).
     */
    val names: List<Name> = listOf(
        Name("1", "Emma", 15000),
        Name("2", "Noah", 14000),
        Name("3", "Olivia", 13000),
        Name("4", "Lucas", 12500),
        Name("5", "Ella", 12000),
        Name("6", "Anna", 11500),
        Name("7", "Emma", 11000),
        Name("8", "Noah", 10500),
        Name("9", "Sara-Linn", 10000),
        Name("10", "Isak", 9000)
    )

    /**
     * take(n)
     *
     * Tar de første n elementene i listen.
     *
     * Her tar vi de 5 første navnene i listen.
     */
    println("----- Første 5 elementer -----")
    names.take(5).forEach { println(it) }


    /**
     * sortedBy { }
     *
     * Sorterer listen etter en verdi.
     *
     * Her sorterer vi etter popularity (stigende).
     *
     * De minst populære navnene kommer først.
     */
    println("\n----- 5 minst populære navn -----")
    names
        .sortedBy { it.popularity }
        .take(5)
        .forEach { println(it) }


    /**
     * sortedBy { -it.popularity }
     *
     * Hvis vi bruker minus foran verdien,
     * får vi sortering i motsatt retning (synkende).
     *
     * De mest populære navnene kommer først.
     */
    println("\n----- 5 mest populære navn -----")
    names
        .sortedBy { -it.popularity }
        .take(5)
        .forEach { println(it) }


    /**
     * filter { }
     *
     * Filter brukes til å velge bare elementer
     * som oppfyller en bestemt betingelse.
     *
     * Her fjerner vi navn som inneholder bindestrek.
     *
     * Eksempel:
     * "Sara-Linn" fjernes.
     */
    println("\n----- Navn uten bindestrek -----")
    names
        .filter { !it.name.contains("-") }
        .sortedBy { it.popularity }
        .take(5)
        .forEach { println(it) }


    /**
     * groupBy { }
     *
     * Deler listen i grupper basert på en nøkkel.
     *
     * Her grupperer vi etter name.
     *
     * Resultatet blir:
     *
     * Map<String, List<Name>>
     *
     * Eksempel:
     *
     * "Emma" -> [Name(...), Name(...)]
     */
    println("\n----- Navn som finnes flere ganger -----")
    names
        .groupBy { it.name }
        .values
        .filter { it.size > 1 }   // bare grupper med mer enn ett element
        .forEach { println(it) }


    /**
     * EKSTRA EKSEMPLER (nyttige til eksamen)
     */

    println("\n----- Map eksempel -----")

    /**
     * map { }
     *
     * Lager en ny liste der hvert element er transformert.
     *
     * Her lager vi en liste med bare navnene.
     */
    val bareNavn = names.map { it.name }

    println(bareNavn)


    println("\n----- Count eksempel -----")

    /**
     * count { }
     *
     * Teller hvor mange elementer som oppfyller en betingelse.
     *
     * Her teller vi navn med popularitet over 12000.
     */
    val antallPopulaere = names.count { it.popularity > 12000 }

    println("Antall populære navn: $antallPopulaere")


    println("\n----- Find eksempel -----")

    /**
     * find { }
     *
     * Returnerer første element som oppfyller betingelsen.
     */
    val funnet = names.find { it.name == "Emma" }

    println(funnet)


    println("\n----- Partition eksempel -----")

    /**
     * partition { }
     *
     * Deler listen i to:
     *
     * 1. elementer som oppfyller betingelsen
     * 2. elementer som ikke oppfyller betingelsen
     */
    val (populaere, mindrePopulaere) =
        names.partition { it.popularity > 12000 }

    println("Populære navn:")
    println(populaere)

    println("Mindre populære navn:")
    println(mindrePopulaere)
}


fun main() {
    sSBFunksjonellProg()
}