fun main(){
    println(containsRange(5..8, 5..9))
}

/**
 * Checks if a range contains another
 * @param range1 - first range
 * @param range2 - second range
 * @return Boolean if range1 contains range2 or no
 */
fun containsRange(range1: ClosedRange<Int>, range2: ClosedRange<Int>) : Boolean{
    return range1.start <= range2.start && range1.endInclusive >= range2.endInclusive
}