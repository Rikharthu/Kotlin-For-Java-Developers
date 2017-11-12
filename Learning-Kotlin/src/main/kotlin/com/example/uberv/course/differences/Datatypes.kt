package com.example.uberv.course.differences

fun main(args: Array<String>) {

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val ints = arrayOf(1, 2, 3, 4)

    val longs = arrayOf(1L, 2L, 3L)

    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val values = arrayOf(1,2,3,4)

    println(values is Array<Long>)
    println(values is Array<Int>)

    println(names)
    println(longs)
    println(longs2)
}
