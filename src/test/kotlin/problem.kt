fun main() {
    println(getIndex(listOf("A", "B", "C"), "E"))
}

fun getIndex(list: List<String>, str: String): Int {
    for (i in list.indices)
        if (list[i] == str)
            return i

    return -1
}