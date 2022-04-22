import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {
    println(decapitalizeConst("__FOOBAR_ABA"))
}

fun decapitalizeConst(str: String): String {
    val result = StringBuilder()

    val matches = Regex("[a-zA-Z]+").findAll(str)

    for (match in matches)
        if (match.value == matches.elementAt(0).value)
            result.append(match.value.lowercase())
        else
            result.append(match.value[0].uppercaseChar() + match.value.substring(1, match.value.length).lowercase())

    if (str.isNotEmpty() && !str[0].isLetter())
        result.append("lTH")

    return result.toString()
}