//Test for commit

fun main() {
    val str = "test?for.. 2my  5 4}function aaaaa AAAAA"
    println(capitalizeSentences(str))
}

fun capitalizeSentences(str: String): String {
    var result = StringBuilder()

    for (i in str.indices) {
        if (str[i].isLetter() && i == 0 || str[i].isLetter() && !str[i - 1].isLetter())
            result.append(str[i].uppercaseChar())
        else if (str[i].isLetter() && i != 0 && !str[i].isUpperCase())
            result.append(str[i].lowercaseChar())
        else
            result.append(str[i])
    }

    return result.toString()
}