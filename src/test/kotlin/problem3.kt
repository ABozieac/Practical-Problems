fun main(){
    println(containsRange(5..8, 5..9))
}

fun containsRange(range1: ClosedRange<Int>, range2: ClosedRange<Int>) : Boolean{
    return range1.start < range2.start && range1.endInclusive > range2.endInclusive
}