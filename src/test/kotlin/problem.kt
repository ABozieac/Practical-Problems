fun main() {
    println(anagrams("rail saflty", "fairy tales"));
}

fun anagrams(_str1: String, _str2: String): Boolean {
    var str1 = ""
    var str2 = ""

    for (i in _str1.indices) {
        if (_str1[i].isLetter()) {
            str1 += _str1[i].lowercaseChar()
        }
    }

    for (i in _str2.indices) {
        if (_str2[i].isLetter()) {
            str2 += _str2[i].lowercaseChar()
        }
    }

    return (str1.toCharArray().sorted() == str2.toCharArray().sorted())
}