package com.example.mykotlin

fun main(){

//    calculate(11, 1000, message = "is multiple of", multipleOf = 11)
//    calculate(message = "is multiple of", multipleOf = 11)


    enhancedMessage(message = "Hello There"){
        println(it)
        24
    }

}


//val name: (String) -> Unit = {name -> println(name)}
//val name: (String) -> Unit = {it
//    println("Hello my name is $it")}
//
//fun showName(name: String){
//    println(name)

    fun enhancedMessage(message: String, funAsParameter: (String) -> Int){
        println("$message ${funAsParameter("Hey")}")
    }






