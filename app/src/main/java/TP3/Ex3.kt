package com.example.firstappkotlin.TP3

class Person(private var name: String, private var age: Int) {
    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
    fun setName(n : String) {
        name = n
    }
    fun setAge(a : Int) {
        age = a
    }
    fun afficher(){
        println("nom ${name} de l'age ${age} ans")
    }
}
fun main(){
    var p = Person("ahmed",19)
    p.afficher()
    p.setName("amin")
    p.setAge(23)
    p.afficher()
}