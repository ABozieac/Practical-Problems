fun main() {
    println(getIndex(listOf("A", "B", "C"), "D"))
}

fun getIndex(list: List<String>, str: String): Int {
    var result = -1

    list.forEachIndexed { index, el ->
        if (el.equals(str)) {
            result = index
            return@forEachIndexed
        }
    }

    return result
}