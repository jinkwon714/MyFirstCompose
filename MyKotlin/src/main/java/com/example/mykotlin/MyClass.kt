package com.example.mykotlin

fun main(){

//    calculate(11, 1000, message = "is multiple of", multipleOf = 11)
//    calculate(message = "is multiple of", multipleOf = 11)

    val catAge = calculateCatAge(10)
    if(checkAge(catAge))
        print("This cat is old $catAge")
    else
        print("This cat is young $catAge")
}



fun calculateCatAge(age: Int):Int{
    return age *7
}

fun checkAge(catAge: Int): Boolean {
    return catAge > 14
}