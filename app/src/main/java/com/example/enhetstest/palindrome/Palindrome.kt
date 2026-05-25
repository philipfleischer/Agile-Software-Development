package com.example.enhetstest.palindrome

fun isPalindrome(word: String): Boolean {
    return word.lowercase() == word.reversed().lowercase()
}