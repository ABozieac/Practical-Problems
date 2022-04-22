import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {
    println(decapitalizeConst("__FOOBAR_ABA"))
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

    for (match in matches)
    //If first word then lowercase it
        if (match.value == matches.elementAt(0).value)
            result.append(match.value.lowercase())
        else
        // Make first letter capitalized
            result.append(match.value[0].uppercaseChar() + match.value.substring(1, match.value.length).lowercase())

    if (str.isNotEmpty() && !str[0].isLetter())
        result.append("lTH")

    return result.toString()
}