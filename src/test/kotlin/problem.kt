//123123

fun main() {
    println(palindrome("abba"))
}

fun palindrome(str: String): Boolean {
    return str == str.reversed()
}