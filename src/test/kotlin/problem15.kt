fun main() {
    println(capitalizeFirst(listOf("igor", " wojda", "loh")))
}

fun capitalizeFirst(strings: List<String>): List<String> {
    var result = strings.toMutableList()

    for (i in strings.indices) {
        if (!((strings[i].trim())[0].isUpperCase())) {
            result[i] = "${strings[i].trim()[0].uppercaseChar()}${strings[i].trim().substring(1)}"

            if (i == strings.size - 1)
                return result
        }
    }

    capitalizeFirst(result)

    return result
}