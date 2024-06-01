package rajesh.matrix.unitanduitestingapp.utils

class Helper {

    fun isPalindrome(input:String) : Boolean {
        var start = 0
        var end = input.length - 1
        while (start < end) {
            if (input[start] != input[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }

}