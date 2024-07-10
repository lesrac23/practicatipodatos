package com.example.myapplication
fun main(parametro:Array<String>){
    print("Ingresa el numero1:")
    val numero1 = readln().toDouble()
    print("Ingresa el numero2:")
    val numero2 = readln().toDouble()
    val total = (numero1 + numero2)
    println("La suma de $numero1 + $numero2 es $total")

}