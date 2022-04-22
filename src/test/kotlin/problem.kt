fun main() {
    println(anagrams("rail saflty", "fairy tales"));
}

fun anagrams(_str1: String, _str2: String): Boolean {
    return (selectLetters(_str1).toCharArray().sorted() == selectLetters(_str2).toCharArray().sorted())
}

fun selectLetters(str: String): String {
    val result = StringBuilder()

    for (i in str.indices)
        if (str[i].isLetter())
            result.append(str[i].lowercaseChar())

    return result.toString()
}