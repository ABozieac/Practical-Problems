fun main() {
    println(addUpTo(3))
}

fun addUpTo(n: Int): Int {
    var result: Int = 0

    for (i in 1..n)
        result += i

    return result
}
