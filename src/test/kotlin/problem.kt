fun main() {
    println(vowels("artiom face teste muhahhhaha"))
}

fun vowels(str: String): Int {
    var result = 0

    for (ch in str) {
        when (ch) {
            'a', 'e', 'u', 'i', 'o', 'y' -> result++
        }
    }

    return result
}