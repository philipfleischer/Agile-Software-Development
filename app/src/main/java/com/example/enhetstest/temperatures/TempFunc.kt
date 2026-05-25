package com.example.enhetstest.temperatures

fun highestTempHour(temperatures: List<Temperature>): String {
    var currentHighest = Temperature(-100, "--:--")
    temperatures.forEach {
        if (it.temp > currentHighest.temp) {
            currentHighest = it
        }
    }

    return currentHighest.time
}

val hiTempHour: (List<Temperature>) -> String = { list ->
    list.maxBy { it.time }.time
}