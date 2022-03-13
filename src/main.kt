fun main() {

    val numArray = intArrayOf(1, 2, 3, 4, 5, 6)

    println(getAverage(numArray))
    println(isPalindrome("asa"))
}

// EXERCISE #1
fun getAverage(arr: IntArray): Int {
    var sum = 0
    var counter = 0

    for (num in arr) {
        if (num % 2 == 0) {
            sum += num
            counter++
        }
    }

    return sum / counter
}

// EXERCISE #2
fun isPalindrome(str: String): Boolean {

    val reversed = str.reversed()

    if (str == reversed)
        return true
    return false
}