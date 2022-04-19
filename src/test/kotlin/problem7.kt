fun main() {
    println(countUpAndDown(5))
}

fun countUpAndDown(n: Int): List<Int> {
    var result = mutableListOf<Int>()

    for (i in 0..n) {
        result.add(i)
    }

    for (i in n-1 downTo 0) {
        result.add(i)
    }

    return result
}