fun main() {
    println(encodeCaesarCipher("art.i.o?m;t.i'o  ma", 12))
}

fun encodeCaesarCipher(str: String, shift: Int): String {
    var result = ""

    for (i in str.indices) {
        if(str[i].isLetter())
            result += ((str[i].code - 97 + shift) % 26 + 97).toChar()
        else
            result += str[i]
    }

    return result
}