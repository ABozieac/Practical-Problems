import java.math.BigInteger

//Comment for commit

fun main() {
    println(power(200000, 200))
}

/**
 * Raise a to the power of b
 * @param a - base
 * @param b - exponent
 * @return value of a raised to the power o b
 */
fun power(a: Int, b: Int): BigInteger {
    var result = BigInteger("1")

    for (i in 2..b)
        result *= a.toBigInteger()

    return result
}