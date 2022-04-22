//Comment for commit

fun main() {
    println(product(listOf(1, 2, 4)))
}

/**
 * Calculates the product of all the numbers from a list
 * @param nums - a list of integers
 * @return product of all the numbers from the list
 */
fun product(nums: List<Int>): Int {
    return nums.reduce() { accumulator, element -> accumulator * element }
}
