fun main() {
    println(reverse("Testerino"))
}

fun reverse(str: String): String {
    var result = ""

    for (i in str.length - 1 downTo 0)
        result += str[i]

    return result
}