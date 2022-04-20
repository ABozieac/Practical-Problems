fun main() {
    println(addUpTo(100))
}

fun addUpTo(n: Int): java.math.BigInteger {
    var result = java.math.BigInteger("0")

    result += ((((1 + n) * n)) / 2).toBigInteger()

    return result
}
