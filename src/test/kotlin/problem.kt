//Comment for commit

fun main() {
    println(capitalizeFirst(listOf("igor", " wojda", "loh")))
}

/**
 * Capitalizes strings in a list using recursion
 * @param strings - a list of strings
 * @return A list of capitalized strings
 */
fun capitalizeFirst(strings: List<String>): List<String> {
    var result = strings.toMutableList()

    for (i in strings.indices) {
        // Trim string to avoid bugs and check if it's not capitalized
        if (!((strings[i].trim())[0].isUpperCase())) {
            // Capitalize the string
            result[i] = "${strings[i].trim()[0].uppercaseChar()}${strings[i].trim().substring(1)}"


            if (i == strings.size - 1)
                return result
        }
    }

    // Do it for the next string using recursion
    capitalizeFirst(result)

    return result
}