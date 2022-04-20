//comment

fun main() {
    println(formatTrainRoute(listOf("Station1", "Station2", "Station3")))
}

fun formatTrainRoute(stations: List<String>): String {
    var result = "Train is calling at"

    stations.forEachIndexed { index, station ->
        if (index == stations.size - 1 && index == 0)
            result += " $station"
        else if (index == stations.size - 1)
            result += " and $station"
        else if (index == stations.size - 2)
            result += " $station"
        else
            result += " $station,"
    }

    return result
}