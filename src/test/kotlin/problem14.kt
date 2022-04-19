fun main() {
    println(product(listOf(1, 2, 4)))
}

fun product(nums: List<Int>): Int {
    var result = 1

    for (num in nums) {
        result *= num
    }

    return result
}
