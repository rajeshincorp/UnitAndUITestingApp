package rajesh.matrix.unitanduitestingapp.utils

import org.junit.Assert.*
import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome_Hello() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPalindrome("Hello")
        //Assert
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_malayalam() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPalindrome("malayalam")
        //Assert
        assertEquals(true,result)
    }

}