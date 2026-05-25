package com.example.enhetstest

import com.example.enhetstest.palindrome.isPalindrome
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class PalindromeTest {

    @Test
    fun testIsPalindromeShouldReturnTrue() {
        // TODO: Arrange - Setting up what we need for the test
        // TODO: Act - call the method to be tested
        // TODO: Assert - Check that the results from Act are as expected

        // Arrange
        val word = "Hannah"

        // Act
        val result = isPalindrome(word)

        // Assert
        assertTrue(result)
    }

    @Test
    fun testIsPalindromeShouldReturnFalse() {
        // Arrange
        val ord = "oogaaagooo"

        // Act
        val res = isPalindrome(ord)

        // Assert
        assertFalse(res)
    }
}