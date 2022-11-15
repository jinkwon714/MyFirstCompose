package com.example.mykotlin

fun main(){

    calculate(11, 1000, multipleOf = 3)
}

fun calculate(first: Int, second: Int, multipleOf: Int){
    for (i in first..second){
     if(i%multipleOf == 0){
         println("$i is multiple of $multipleOf")
     }
    }
}