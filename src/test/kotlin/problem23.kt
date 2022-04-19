fun main() {
    pyramid(4)
}

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