package rajesh.matrix.unitanduitestingapp.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper = Helper()
        println("Before every test")
    }

    @After
    fun tearD(){
        println("After every test")
    }

    @Test
    fun isPalindrome_Hello() {
        //Arrange
          /*val helper = Helper()*/
        //Act
        val result = helper.isPalindrome("Hello")
        //Assert
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_malayalam() {
        //Arrange
          /*val helper = Helper()*/
        //Act
        val result = helper.isPalindrome("malayalam")
        //Assert
        assertEquals(true,result)
    }

}