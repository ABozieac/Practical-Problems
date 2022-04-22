//artiom

fun main() {
    println(vowels("unadouaUNADOUA"))
}

fun vowels(str: String): Int {
    return "[aeyuioAEYUIO]".toRegex().findAll(str).count()
}