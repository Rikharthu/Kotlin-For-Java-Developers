package com.example.uberv.differences

import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    val values = arrayOf(1, 2, 3, 4)     // Int
    val values2 = arrayOf(1, 2L, 3, 4)   // All Long

    println(values is Array<Int>)
    println(values2 is Array<Long>)
    println(values[0]::class)   // Int
    println(values2[0]::class)  // Long

    println("longs1[2] = ${longs1[2]}")

    // You can use Array constructor and pass a lambda expression to initialize it
    // P.S. this lambda is actually 'init' clause
    val evenNumbers = Array(16) { i -> i * 2 } // multiple indexes by 2
    for (number in evenNumbers) {
        print("$number ")
    }
    println()

    val lotsOfNumbers = Array(100000) { i -> i + 1 } // [1:100000]
//    val allZeros = Array(100) { i -> 0 }
    val allZeros = Array(100) { 0 }
    // 'i' here is index

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        print("$number ")
    }
    println()

    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        print("$number ")
    }
    println()

    // Array of 'Any'
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    printArray(mixedArray)
    println(mixedArray is Array<Any>)

//    val ints = Array(10) { i -> i }
//    val myIntArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Java's int[] maps to IntArray in Kotlin
    val myIntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    DummyClass().printNumbers(myIntArray)

//    var someOtherArray = Array<Int>(5) ERROR, type is not known
    var array1: Array<Int>

    var someIntArray = IntArray(5) // OK, type can only be Int
    for (number in someIntArray) {
        println(someIntArray) // 0
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())
}

private fun printArray(mixedArray: Array<Any>) {
    for (number in mixedArray) {
        print("$number ")
    }
    println()
}