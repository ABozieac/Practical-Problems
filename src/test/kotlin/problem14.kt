fun main() {
    println(product(listOf(1, 2, 4)))
}

fun product(nums: List<Int>): Int {
    return nums.reduce() { accumulator, element -> accumulator * element }
}
