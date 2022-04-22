//artiom

fun main() {
    println(vowels("unadouaUNADOUA"))
}

/**
 * Counts the number of vowels in a string
 * @param str - String to find vowels from
 * @return the number of vowels
 */
fun vowels(str: String): Int {
    //Counting vowels using regex
    return "[aeyuioAEYUIO]".toRegex().findAll(str).count()
}