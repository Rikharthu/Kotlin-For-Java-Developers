package com.example.uberv.course.differences

fun main(args: Array<String>) {
    var number: Int
    number = 10 // Semicolons are not needed

    // Hard and Soft keywords https://kotlinlang.org/docs/reference/keyword-reference.html
    var catch: Int // catch is a soft keyword, used as a variable name
    try {

    } catch (e: Exception) { // 'catch' used as a keyword

    }

    val names = arrayListOf("John", "Jane", "Mary")
    // Indexing operator
    println(names[1]) // access collection elements with square brackets instead of using namaes.get(1)
    println(names.get(2))

    // Kotlin uses it's own string class https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html
    println("Hello, World!".length) // length is now a property instead of method

    // Kotlin doesn't distinguish between checked and unchecked exceptions (methods do not need to declare that they throw an Exception)
    // Moreover 'throw' keyword doesn't even exist

    // Ternary operator
    // q = x ? y : z  <- doesn't exist in Kotlin, replaced by 'if'
    val x = true
    val q = if (x) 4 else 5

    // For loop doesn't exist
//    for (i: Int= 0;i < 20;i++){
//        . . .
//    }

    // Doesn't have a static keyword (but concept is still there)

    // No 'new' keyword
}