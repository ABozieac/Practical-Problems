fun main() {
    println(fizzBuzz(16))
}

/**
 * Makes a list of numbers from 1 to n where numbers divided by 3 and 5 are replaced with "FizzBuzz"
 * numbers divided by 3 with "Fizz" and numbers divded by 5 with "Buzz"
 * @param n - Number of elements in a list
 * @return List of any elements
 */
fun fizzBuzz(n: Int): List<Any> {
    var result = mutableListOf<Any>()

    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0)
            result.add("FizzBuzz")
        else if (i % 3 == 0)
            result.add("Fizz")
        else if (i % 5 == 0)
            result.add("Buzz")
        else
            result.add(i)
    }

    return result
}