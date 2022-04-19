fun main() {
    println(power(4, 3))
}

fun power(a: Int, b: Int): Int {
    var result = a

    for (i in 2..b)
        result *= a

    return result
}