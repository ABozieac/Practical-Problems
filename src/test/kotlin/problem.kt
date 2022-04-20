fun main() {
    println(maxChar("apple 1231111"))
}

fun maxChar(str: String): Char {
    var map = mutableMapOf<Char, Int>()

    for (ch in str) {
        map.put(ch, 0)
    }

    for (i in str.indices) {
        map.put(str[i], map.getValue(str[i]) + 1)
    }

    var maxValue = 0
    var maxKey = ' '

    for (pair in map) {
        if (pair.component2() > maxValue) {
            maxValue = pair.component2()
            maxKey = pair.component1()
        }
    }

    return maxKey
}