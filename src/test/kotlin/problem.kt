//comment

fun main() {
    println(formatTrainRoute(listOf("Station1", "Station2", "Station3")))
}

/**
 * Creates train route
 * @param stations - List of stations
 * @return A string with the route of train
 */
fun formatTrainRoute(stations: List<String>): String {
    var result = "Train is calling at"

    stations.forEachIndexed { index, station ->
        // If only one station add " station" or station before last
        if (index == stations.size - 1 && index == 0 || index == stations.size - 2)
            result += " $station"
        // Elif last station add " and station"
        else if (index == stations.size - 1)
            result += " and $station"
        // Else separate stations with comma
        else
            result += " $station,"
    }

    return result
}