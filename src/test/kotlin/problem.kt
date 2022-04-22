//bla-bla-bla

fun main() {
    println(getAllPairs(2))
}

/**
 * Get all pairs from 0 to n
 * @param n - Upper boundary
 * @return List of pairs with numbers from 0 to n
 */
fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    var result = mutableListOf<Pair<Int, Int>>()

    for (i in 0..n) {
        for (j in 0..n) {
            result.add(Pair(i, j))
        }
    }

    return result
}