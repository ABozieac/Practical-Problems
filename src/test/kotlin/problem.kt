//araraew

fun main() {
    println(countUpAndDown(5))
}

fun countUpAndDown(n: Int): List<Int> {
    var result = mutableListOf<Int>(0, 0)

    for (i in 1..n) {
        result.add(i, i)
        result.add(result.size - i, i)
    }

    if(n != 0)
        result.remove(n)

    return result
}