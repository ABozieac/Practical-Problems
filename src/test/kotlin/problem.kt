//artiom

fun main() {
    println(vowels("unadoua"))
}

fun vowels(str: String): Int {
    return str.count { it == 'a' || it == 'e' || it == 'u' || it == 'i' || it == 'o' || it == 'y' }
}