fun main() {
    println(getAllPairs(2))
}

fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    var result = mutableListOf<Pair<Int, Int>>()

    for (i in 0..n) {
        for (j in 0..n) {
            result.add(Pair(i, j))
        }
    }

    return result
}