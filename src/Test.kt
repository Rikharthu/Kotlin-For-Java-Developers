fun main(args: Array<String>) {
    area(10, 20)
    // named params
    area(height = 10, width = 20)
}

fun area(width: Int, height: Int) {
    println("width = $width and height = $height")
}

class KotlinClass constructor(message: String) {

}