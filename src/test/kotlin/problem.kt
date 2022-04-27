fun main() {
    println(decapitalizeConst("AA_AA___AAA__BBB"))
}

/**
 * Converts constant value's name to variable name
 * @param str - Constant value's  name
 * @return Converted constant's name to variable name
 */
fun decapitalizeConst(str: String): String {
    val result = StringBuilder()

    //Find all words
    val matches = Regex("[a-zA-Z]+").findAll(str)

    // First word is fully lowercase
    result.append(matches.elementAt(0).value.lowercase())

    for (i in 1 until matches.count()) {
        // Make first letter capitalized
        result.append(matches.elementAt(i).value[0].uppercaseChar() + matches.elementAt(i).value.substring(1, matches.elementAt(i).value.length).lowercase())
    }

    if (str.isNotEmpty() && !str[0].isLetter())
        result.append("lTH")

    return result.toString()
}