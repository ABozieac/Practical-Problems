//bla-bla-bla

fun main() {
    println(countDown(5))
}

/**
 * Count from n down to 0
 * @param n - lower boundary
 * @return List with integers from n to 0
 */
fun countDown(n: Int): List<Int> {
    var result = mutableListOf<Int>()

    for (i in n downTo 0) {
        result.add(i)
    }

    return result
}