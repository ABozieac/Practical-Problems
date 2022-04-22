//comment

fun main() {
    println(reverse("Testerino"))
}

/**
 * Reverses a string
 * @param str - String to reverse
 * @return reversed string
 */
fun reverse(str: String): String {
    var result = ""

    for (i in str.length - 1 downTo 0)
        result += str[i]

    return result
}