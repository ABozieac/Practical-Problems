fun main() {
    println(countDown(5))
}

fun countDown(n: Int): List<Int> {
    var result = mutableListOf<Int>()

    for (i in n downTo 0) {
        result.add(i)
    }

    return result
}