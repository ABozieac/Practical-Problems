//Kaizoku ou ni ore wa naruuuuu

fun main() {
    pyramid(4)
}

/**
 * Prints a pyramid
 * @param n - Numbers of floors
 */
fun pyramid(n: Int) {

    var j = n - 1
    var i = 1
    while (j >= 0) {

        for (k in 1..j)
            print(' ')

        for (k in 1..i)
            print('*')

        for (k in 1..j)
            print(' ')

        j--
        i += 2
        println()
    }
}