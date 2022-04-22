//Comment for commit
fun main() {
    println(printNumber(5))
}

/**
 * Returns a list of integers from n to 1
 * @param n - the start number
 */
fun printNumber(n: Int): List<Int> {
    var result = mutableListOf<Int>()

    for (i in n downTo 1)
        result.add(i)

    return result
}