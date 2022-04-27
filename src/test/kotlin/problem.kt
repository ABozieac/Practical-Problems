//Test for commit

fun main() {
    val str = "aa Aa# AA aA"
    println(capitalizeSentences(str))
}

/**
 * Capitalizes every word in a string
 * @param str - String to capitalize words
 * @return String where all words are capitalized
 */
fun capitalizeSentences(str: String): String {
    val result = StringBuilder()

    //Find all words
    val matches = Regex("[a-z[^ ]A-Z]+").findAll(str)

    for (match in matches){
        result.append(match.value[0].uppercaseChar())
        result.append(match.value.substring(1, match.value.length))
        result.append(" ")
    }

    return result.toString()
}