//123123

fun main() {
    println(palindrome("abba"))
}

/**
 * Checks if a word is a palindrome
 * @param str - Word to check
 * @return Is word a palindrome or not
 */
fun palindrome(str: String): Boolean {
    return str == str.reversed()
}