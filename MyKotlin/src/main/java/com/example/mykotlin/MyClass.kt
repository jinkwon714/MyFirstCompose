package com.example.mykotlin

fun main(){

//    calculate(11, 1000, message = "is multiple of", multipleOf = 11)
//    calculate(message = "is multiple of", multipleOf = 11)

    val catAge = calculateCatAge(10) * 10
    print("This cat is $catAge years old")
}

//fun calculate(first: Int = 11,
//              second: Int = 1000,
//              message: String,
//              multipleOf: Int){
//    for (i in first..second){
//     if(i%multipleOf == 0){
//         println("$i $message $multipleOf")
//     }
//    }
//}

fun calculateCatAge(age: Int):Int{
    return age *7
}