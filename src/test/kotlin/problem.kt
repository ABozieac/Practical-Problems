//Comment

fun main() {
    println(maxChar("apple 1231111"))
}

/**
 * Finds the character that is met the most often in a string
 * @param str - String to find the character
 * @return The character met most often
 */
fun maxChar(str: String): Char {
    var map = mutableMapOf<Char, Int>()

    //Put every char from string in a map
    for (ch in str) {
        map.put(ch, 0)
    }

    //Count the number of times every character is met
    for (i in str.indices) {
        map.put(str[i], map.getValue(str[i]) + 1)
    }

    var maxValue = 0
    var maxKey = ' '

    //Find the character met most often
    for (pair in map) {
        if (pair.component2() > maxValue) {
            maxValue = pair.component2()
            maxKey = pair.component1()
        }
    }

    return maxKey
}