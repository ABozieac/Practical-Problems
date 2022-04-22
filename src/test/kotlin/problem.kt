//Comment for commit
fun main() {
    println(printNumber(5))
}

/**
 * Creates a list with integers from n to 1
 * @param n - the start number
 * @return A list containing elements from n to 1
 */
fun printNumber(n: Int): List<Int> {
    var result = mutableListOf<Int>()

    for (i in n downTo 1)
        result.add(i)

    return result
}