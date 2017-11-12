package academy.learnprogramming.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello" // looks in the string pool to see, whether this literal "Hello" has already been created

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}") // true, because of optimization of string literals
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}") // true

    var num = 2988

    val something: Any
    something = "The Any type is the root of the Kotlin class hirerarchy."
    if (something is String) {
        println(something.toUpperCase())
    }
    println("""   1
        |  11
        | 111
        |1111
    """.trimMargin())
    println("""1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))
}