fun main() {
    println(hasRepeatedCharacter("aba"))
    println(hasDoubleCharacter("abba"))
}

fun hasRepeatedCharacter(str: String): Boolean {
    for (i in str.indices) {
        for (j in str.indices) {
            if (i == j)
                continue

            if (str[i] == str[j])
                return true
        }
    }

    return false
}

fun hasDoubleCharacter(str: String): Boolean {
    for(i in str.indices){
        if(i+1 < str.length - 1 && str[i] == str[i+1])
            return true
    }

    return false
}