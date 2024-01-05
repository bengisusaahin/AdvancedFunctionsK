package com.bengisusahin.advancedfunctionsk

fun main(){

    //filter

    /*val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    val smallNumberList = myNumList.filter { num -> num < 6 }
    for (num in smallNumberList){
        println(num)
    }

     */

    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    val smallNumberList = myNumList.filter { it < 6 }
    for (num in smallNumberList){
        println(num)
    }

    //map
    /*
    val squaredNumbers = myNumList.map { num -> num * num }
    for (num in squaredNumbers){
        println(num)
    }

     */
    val squaredNumbers = myNumList.map {it* it }
    for (num in squaredNumbers){
        println(num)
    }
}