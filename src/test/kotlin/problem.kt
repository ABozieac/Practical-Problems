fun main() {
    println(getIndex(listOf("A", "B", "C"), "A"))
}

fun getIndex(list: List<String>, str: String): Int {
    return list.indexOf(str)
}