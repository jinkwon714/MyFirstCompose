package com.example.mykotlin

fun main(){

    val amount = 99

    when(amount) {
        in 1..100 -> print("This amount is between 1 and 100")
        !in 10..90 -> print("This amount is outside range")
        999 -> print("Yo man you are rich")
        else -> {
            print("I don't know what have you done!")
        }
    }
}