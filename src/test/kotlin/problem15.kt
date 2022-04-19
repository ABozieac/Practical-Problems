fun main() {
    println(capitalizeFirst(listOf("igor", "wojda")))
}

fun capitalizeFirst(strings: List<String>): List<String> {
    var result = strings.toMutableList()

    for (i in strings.indices) {
        if (!((strings[i])[0].isUpperCase())) {
            result[i] = "${strings[i][0].uppercaseChar()}${strings[i].substring(1)}"

            if (i == strings.size - 1)
                return result
        }
    }

    capitalizeFirst(result)

    return result
}