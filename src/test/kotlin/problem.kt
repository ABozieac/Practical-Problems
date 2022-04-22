//Test for commit

fun main() {
    val str = "Artiom a vizitat, Le-notre dam"
    println(capitalizeSentences(str))
}

/**
 * Capitalizes every word in a sentence
 * @param str - Sentence to capitalize words
 * @return String where all words are capitalized
 */
fun capitalizeSentences(str: String): String {
    var result = StringBuilder()

    for (i in str.indices) {
        // If first letter of word or letter after symbols then capitalize it
        if (str[i].isLetter() && i == 0 || str[i].isLetter() && !str[i - 1].isLetter() && str[i - 1] != '-')
            result.append(str[i].uppercaseChar())
        // Elif not first letter but capitalized then make it lowercase
        else if (str[i].isLetter() && i != 0 && !str[i].isUpperCase())
            result.append(str[i].lowercaseChar())
        else
        // Remove multiple empty spaces
            if (i - 1 > 0 && str[i - 1] != ' ')
                result.append(str[i])
    }

    return result.toString()
}