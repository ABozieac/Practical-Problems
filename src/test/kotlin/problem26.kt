fun main() {
    println(encodeCaesarCipher("abc", 1))
}

fun encodeCaesarCipher(str: String, shift: Int): String {
    var result = ""

    for (i in str.indices) {
        result += (str[i].code + shift).toChar()
    }

    return result
}