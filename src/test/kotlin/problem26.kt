fun main() {
    println(encodeCaesarCipher("xyz", 1))
}

fun encodeCaesarCipher(str: String, shift: Int): String {
    var result = ""

    for (i in str.indices) {
        if(!(str[i].code + shift).toChar().isLetter())
            result += (96 + shift).toChar()
        else
            result += (str[i].code + shift).toChar()
    }

    return result
}