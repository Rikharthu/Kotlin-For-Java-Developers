package com.example.uberv.course.typealiases

// More info https://kotlinlang.org/docs/reference/type-aliases.html

// Type aliases provide alternatives names for existing types
// If the type name is too long you can introduce a different shorter name and use the new one instead

typealias EmployeeSet = Set<Employee>
typealias EmployeeIDCard = Employee.IDCard
// Alias for function type
typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)

fun main(args: Array<String>) {
    val employees: EmployeeSet; // instead of Set<Employee>
    val idCard1 = Employee.IDCard(1, System.currentTimeMillis() + 1000 * 60 * 60 * 24)
    val idCard2 = EmployeeIDCard(2, System.currentTimeMillis() + 1000 * 60 * 60 * 24)

    // function that takes an integer and returns 'true' if it is bigger than 0
    val f: (Int) -> Boolean = { it > 0 }
    // foo() accepts a Predicate<Int>, which actually is (Int) -> Boolean
    println(foo(f))

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2, 0, 4, 7).filter(p)) // 1, 4, 7
    println(listOf(1, -2, 0, 4, 7).filter({ x -> x > 0 }))
    println(listOf(1, -2, 0, 4, 7).filter(f))
}

class Employee(var name: String = "Vasya Pupkin", val id: Int = 1337) {
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }

    class IDCard(var id: Int, var expires: Long)
}