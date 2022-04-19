fun main() {
    println(decapitalizeConst("FOO_BAR"))
}

fun decapitalizeConst(str: String): String {
    var result = ""

    var i = 0
    var flag: Boolean

    while (i != str.length) {
        flag = false
        if (str[i] == '_') {
            for (j in i + 1..str.length - 1) {
                if (str[j] != '_') {
                    if (result.length == 0)
                        result += str[j].lowercaseChar()
                    else
                        result += str[j].uppercaseChar()

                    i = j
                    flag = true
                    break;
                }
            }
        }

        if (!flag)
            result += str[i].lowercaseChar()

        i++
    }

    return result
}