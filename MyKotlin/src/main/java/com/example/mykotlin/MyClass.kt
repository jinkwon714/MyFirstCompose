package com.example.mykotlin

fun main(){

    calculate(11, 1000)
}

fun calculate(first: Int, second: Int){
    for (i in first..second){
     if(i%2 == 0){
         println("$i is multiple of 2")
     }
    }
}