package com.example.myapplication

fun main(parametro: Array<String>){
    print("Ingresa el dia de la semana:")
    val diaSemana = readln().toInt()
    when(diaSemana){
        1-> println("Lunes")
        2-> println("Martes")
        3-> println("Miercoles")
        4-> println("Jueves")
        5-> println("Viernes")
        else -> println("Fin de semana")
    }
    if (diaSemana > 4){
        println("Las alitas son al 2*1")
    }else{
        println("La pizzas es al 3*2")
    }

}