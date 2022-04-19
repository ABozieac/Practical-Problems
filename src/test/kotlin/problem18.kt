fun main() {
    println(palindrome("abdefg"))
}

fun palindrome(str: String): Boolean {
    var i = 0
    var j = str.length - 1

    while (i != str.length - 1 && j != 0) {
        if (str[i] != str[j])
            return false

        i++
        j--
    }

    return true
}