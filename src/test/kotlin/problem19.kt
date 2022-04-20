fun main() {
    println(anagrams("rail safety", "fairy tales"));
}

fun anagrams(str1: String, str2: String): Boolean {
    for(ch in str2){
        if(ch.isLetter() && !str1.contains(ch)){
            return false
        }
    }

    return true
}