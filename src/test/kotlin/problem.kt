//araraew

fun main() {
    println(countUpAndDown(6))
}

/**
 * Counts numbers from 0 to n and from n to 0
 * @param n - Number to count to and from
 * @return list with integers
 */
fun countUpAndDown(n: Int): List<Int> {
    var result = mutableListOf<Int>(0, 0)

    for (i in 1 until n) {
        result.add(i, i)
        result.add(result.size - i, i)
    }

    result.add(result.size / 2, n)

    return result
}