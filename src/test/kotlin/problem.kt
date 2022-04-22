//Test for commit

fun main() {
    val str = "Artiom a vizitat, Le-notre dam"
    println(capitalizeSentences(str))
}

fun capitalizeSentences(str: String): String {
    var result = StringBuilder()

    for (i in str.indices) {
        if (str[i].isLetter() && i == 0 || str[i].isLetter() && !str[i - 1].isLetter() && str[i-1] != '-')
            result.append(str[i].uppercaseChar())
        else if (str[i].isLetter() && i != 0 && !str[i].isUpperCase())
            result.append(str[i].lowercaseChar())
        else
            if (i - 1 > 0 && str[i - 1] != ' ')
                result.append(str[i])
    }

    return result.toString()
}