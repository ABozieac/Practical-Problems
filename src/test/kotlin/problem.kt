fun main() {
    println(getOdd(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
}

/**
 * Get odd numbers from a list
 * @param nums - A list of integers
 * @return A list of integers containing only odd numbers
 */
fun getOdd(nums: List<Int>): List<Int> {
    var result = mutableListOf<Int>()
    nums.forEach { value ->
        if (value % 2 != 0)
            result.add(value)
    }

    return result
}