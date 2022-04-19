fun main() {
    println(printNumber(1))
}

fun printNumber(n: Int): List<Int> {
    var result = mutableListOf<Int>()

    for(i in n downTo 1)
        result.add(i)

    return result
}