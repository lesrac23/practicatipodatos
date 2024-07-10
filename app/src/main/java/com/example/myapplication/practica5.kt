package com.example.myapplication

fun main(){
    val pesoDouble: Double = 90.7
    val estaturaDouble: Double = 1.48
    val imcDouble: Double = (pesoDouble / (estaturaDouble * estaturaDouble))

    println("Tu indice de masa corporal es:$imcDouble")

    if (imcDouble < 18.5) {
        println("Se encuentra dentro del rango de peso insuficiente")
    } else if (imcDouble < 25) {
        println("Se encuentra dentro del rango de peso normal o saludable")
    } else if (imcDouble < 30) {
        println("Se encuentra dentro del rango de sobrepeso")
    } else if(imcDouble == 89) {
        println("Se encuentra dentro del rango de obesidad")
    }





}