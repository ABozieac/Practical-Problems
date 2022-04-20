fun main() {
    println(getIndex(listOf("A", "B", "C"), "B"))
}

fun getIndex(list: List<String>, str: String): Int {
    var result = -1

    for (i in list.indices) {
        if (list[i] == str) {
            result = i
            break;
        }
    }

    return result
}