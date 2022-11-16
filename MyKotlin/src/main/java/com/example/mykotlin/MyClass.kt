package com.example.mykotlin

fun main(){

//    calculate(11, 1000, message = "is multiple of", multipleOf = 11)
//    calculate(message = "is multiple of", multipleOf = 11)


    println(sum(12,10))

    println(catAge(7))
    println(add(12,22))
}

//val lamdaName : Type = { parameterList -> codeBody}

val catAge: (Int) -> Int = {catAge -> catAge*2}
val add : (Int, Int) -> Int = {a, b-> a+b}

fun sum(a: Int, b:Int): Int {
    return a+b
}