fun main() {
    println(getIndex(listOf("A", "B", "C"), "E"))
}

/**
 * Gets the index of a string where its met in the list
 * @param list - List with strings
 * @param str - String to search for
 * @return the index where str is met in list
 */
fun getIndex(list: List<String>, str: String): Int {
    for (i in list.indices)
        if (list[i] == str)
            return i

    return -1
}