//araraew

fun main() {
    println(countUpAndDown(6))
}

fun countUpAndDown(n: Int): List<Int> {
    var result = mutableListOf<Int>(0, 0)

    for (i in 1 until n) {
        result.add(i, i)
        result.add(result.size - i, i)
    }

    result.add(result.size / 2, n)

    return result
}