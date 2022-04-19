fun main() {
    println(countUniqueValues(listOf(-2, -1, -1, 0, 1)))
}

fun countUniqueValues(nums: List<Int>): Int {
    var result = 0

    for (i in nums.indices) {
        if (i == nums.size - 1 && nums[i] != nums[i - 1]) {
            result++
        } else if (nums[i] != nums[i + 1]) {
            result++
        }
    }

    return result
}