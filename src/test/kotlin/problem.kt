fun main() {
    println(hasRepeatedCharacter("aba"))
    println(hasDoubleCharacter("abba"))
}

/**
 * Checks if a string has repeated characters
 * @param str - String to search for repeated characters
 * @return Boolean if there are repeated characters or no
 */
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

/**
 * Checks if a string has double characters, for example "aa"
 * @param str - String to search for double characters
 * @return Boolean if string has double characters or no
 */
fun hasDoubleCharacter(str: String): Boolean {
    for(i in str.indices){
        if(i+1 < str.length - 1 && str[i] == str[i+1])
            return true
    }

    return false
}