package com.example.firstappkotlin.TP3

fun String.deletFirstAndLast(n:String):String{
    return n.substring(1,n.length-1)
}

fun main(){
    var name:String = "Abdelghani douirek"
    println(name.deletFirstAndLast(name))

    var n = "youness belkhair"
    n = n.deletFirstAndLast(n)
    println(n)
}