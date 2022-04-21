//araraew

fun main() {
    println(countUpAndDown(0))
}

fun countUpAndDown(n: Int): List<Int> {
    var result = mutableListOf<Int>(0, 0)

    for (i in 1..n) {
        result.add(i, i)

        if(n != i)
            result.add(result.size - i, i)
    }

    return result
}