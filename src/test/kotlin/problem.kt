fun main() {
    println(anagrams("rail safety", "fairy tales"));
}

/**
 * Checks if a word is anagram of another
 * @param str1 - First word
 * @param str2 - Second word
 * @return If second word is anagram of first one
 */
fun anagrams(str1: String, str2: String): Boolean {
    return (selectLettersAndSort(str1) == selectLettersAndSort(str2))
}

/**
 * Selects only letters from the string and sorts them
 * @param str - String to select letters from
 * @return A sorted array of letters
 */
fun selectLettersAndSort(str: String): List<Char> {
    val result = StringBuilder()

    for (i in str.indices)
        if (str[i].isLetter())
            result.append(str[i].lowercaseChar())

    return result.toString().toCharArray().sorted()
}