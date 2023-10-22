package com.example.firstappkotlin.TP3

import java.util.Scanner

//classe Circel
class Circle(val rayon: Float)

//classe Student
class Student {
    fun isPassed(mark: Int): Boolean {
        return mark > 40
    }
}
fun Student.isExcellent(mark: Int): Boolean {
    return mark > 90
}
fun main() {
    var listemutable = mutableListOf<String>()
    listemutable.add(0,"Ahmed")
    listemutable.add(1,"sara")
    listemutable.add(2,"amin")
    listemutable.add(3,"yassin")
    for (i in listemutable){
        println(i)
    }
    var s = Student()
    println(s.isPassed(50))
    println(s.isExcellent(89))

    fun Circle.calculatePerimeter(): Double {
        return   rayon * 2 * Math.PI
    }
    var sc = Scanner(System.`in`)
    println("saiser le rayon : ")
    var a = sc.nextFloat()
    val circle = Circle(a)
    val perimeter = circle.calculatePerimeter()
    println("Le périmètre du cercle est ${perimeter}")


}



