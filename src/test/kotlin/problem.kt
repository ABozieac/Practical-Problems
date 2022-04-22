//Comment for commit

fun main() {
    println(countUniqueValues(listOf(-2, -1, 0, -1, 2, 3)))
}

/**
 * Counts unique values in a list of numbers
 * @param nums - A list of integers
 * @return Number of unique values
 */
fun countUniqueValues(nums: List<Int>): Int {
    return nums.distinct().size
}