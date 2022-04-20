//Comment for commit
fun main() {
    println(longestWord("this is a house"))
}

fun longestWord(str: String): String {
    var words = str.split(" ")
    var biggestWord = words[0]

    for (word in words) {
        if (word.length > biggestWord.length)
            biggestWord = word
    }

    return biggestWord
}