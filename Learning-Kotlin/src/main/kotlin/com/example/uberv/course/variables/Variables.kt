package com.example.uberv.course.variables

fun main(args: Array<String>) {

    val intNumber: Int = 25
    val number = 25 // is a literal for type 'Int'
    val shortNumber: Short = 25
//    number=33 Error! 'val' can not be reassigned!

    var otherNumber = 25
    otherNumber = 33 // Ok, 'var' variables can be reassigned

    println("number class: ${number::class}")
    println("intNumber class: ${intNumber::class}")
    println("shortNumber class: ${shortNumber::class}")

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"
    val employee2: Employee
    employee2 = Employee("Tim Watson")
    val employee3 = Employee(id = 303, name = "Semen Semenych")
    var vasyaEmployee = Employee()
    vasyaEmployee = Employee("Vasjya Ne'Pupkin", 1488)
    println(vasyaEmployee)

}

class Employee(var name: String = "Vasya Pupkin", val id: Int = 1337) {
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}