import java.math.BigInteger

//Comment for commit

fun main() {
    println(power(200000, 200))
}

fun power(a: Int, b: Int): BigInteger {
    var result = BigInteger("1")

    for (i in 2..b)
        result *= a.toBigInteger()

    return result
}