package com.example.kl_bai_1

fun main() {
    println("Nguyễn Văn Anh - PS123456 ")
    println("Toi yeu viet nam ")
    println("Toi yeu viet nam ")
    println("Toi yeu viet nam ")
    var a = 0.0
    var b = 0.0
    println("Nhập a")
    var s = readLine()
    if (s != null) a = s.toDouble();
    println("Nhập b")
    s = readLine()
    if (s != null) b = s.toDouble();
    println("Tổng:" + (a + b))
    println("Hiệu:" + (a - b))
    println("Tích:" + (a * b))
    println("Thương:" + (a / b))

    //vd1
    println("Hello, World!")
    //vd2
    printMessage("Hello")
    // vd3
    println(sum(1, 2))
    // vd4
    println(multiply(2, 4))
    // vd5
    println(3 add 3)
    // vd6
    println("v" equar "c")
    // vd7
    val point1 = Point(1, 2)
    val point2 = Point(3, 4)
    val sum = point1 + point2
    println("Sum: (${sum.x}, ${sum.y})") // Kết quả sẽ là Sum: (4, 6)
    //vd8
    printNumbers(1, 2, 3, 4, 5)
    //vd9
    var neverNull: String = "This can't be null"            // 1

    // 2

    var nullable: String? = "You can keep a null here"      // 3


    println(strLength(neverNull)) // In ra độ dài của chuỗi neverNull
    println(
        strLength(
            nullable ?: ""
        )
    ) // In ra độ dài của chuỗi nullable, xử lý null-safe với elvis operator
    //vd10

    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6

}

fun printMessage(message: String) {                               // 1
    println(message)
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

infix fun Int.add(b: Int): Int = this + b;
infix fun String.equar(b: String): Boolean = this == b;

class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

class Point2(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}


fun strLength(notNull: String): Int {                   // 7
    return notNull.length
}

class Customer                                  // 1

class Contact(val id: Int, var email: String)




