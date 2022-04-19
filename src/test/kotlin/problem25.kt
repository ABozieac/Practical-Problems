fun main() {
    println(hasRepeatedCharacter("artiom"))
}

fun hasRepeatedCharacter(str: String): Boolean {
    for (i in str.indices) {
        for (j in str.indices) {
            if (i == j)
                continue

            if (str[i] == str[j])
                return true
        }
    }

    return false
}