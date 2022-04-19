fun main(){
    println(getOdd(listOf(1,2,3,4,5,6,7,8,9)))
}

fun getOdd(nums: List<Int>) : List<Int>{
    var result = mutableListOf<Int>()

    for(num in nums){
        if(num % 2 != 0)
            result.add(num)
    }

    return result
}