import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {
    println(decapitalizeConst("__FOO_BAR_BAZ"))
}

fun decapitalizeConst(str: String): String {
    var result = StringBuilder()

    var matches = Regex("[a-zA-Z]+").findAll(str)!!

    for (match in matches)
        if (match.value == matches.elementAt(0).value)
            result.append(match.value.lowercase())
        else
            result.append(match.value[0].uppercaseChar() + match.value.substring(1, match.value.length).lowercase())

    if ("_{2}".toRegex().containsMatchIn(str))
        result.append("lTH")

    return result.toString()
}