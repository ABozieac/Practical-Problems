import java.util.*

fun main() {
    println(countUniqueValues(listOf(-2, -1, 0, -1, 2, 3)))
}

fun countUniqueValues(nums: List<Int>): Int {
    return nums.count() { Collections.frequency(nums, it) == 1 }
}