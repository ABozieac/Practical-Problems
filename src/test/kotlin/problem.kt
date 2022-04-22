fun main() {
    println(addUpTo(100))
}

/**
 * Adds up numbers from 1 to n
 * @param n - Upper boundary
 * @return Sum of numbers from 1 to n
 */
fun addUpTo(n: Int): java.math.BigInteger {
    var result = java.math.BigInteger("0")

    //Calculate the result using formula
    result += ((((1 + n) * n)) / 2).toBigInteger()

    return result
}
