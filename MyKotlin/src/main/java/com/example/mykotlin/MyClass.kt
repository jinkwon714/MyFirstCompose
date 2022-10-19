package com.example.mykotlin

fun main(){

val amount = 1000
    when (amount) {
        999 -> print("Really Close")
        1000 -> print("Rich but not there...")
        1100 -> print("You've made it!")
        else -> {
            print("$amount is just not going to work")
        }
    }


}