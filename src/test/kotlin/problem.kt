//Comment for commit

fun main() {
    println(factorial(5))
}

/**
 * Calculates the factorial of n
 * @param n - number to calculate factorial of
 * @return Factorial of n
 */
fun factorial(n: Int): Int {
    if (n == 0 || n == 1)
        return 1

    //Using formula to obtain n * n-1 * n-2...
    return n * factorial(n - 1)
}