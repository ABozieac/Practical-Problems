//Comment for commit

fun main() {
    println(factorial(5))
}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1)
        return 1

    return n * factorial(n - 1)
}