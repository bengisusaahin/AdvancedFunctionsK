package com.bengisusahin.advancedfunctionsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var myInt : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (myInt != null){
            val num = myInt!! + 1
        }

        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            it + 1
        } ?: 0

        //also
        val atil = Person("Atil", 35)
        val atlas = Person("Atlas",1)
        val bengisu = Person("Bengisu", 24)

        val people = listOf<Person>(atil,atlas,bengisu)
        people.filter { it.age > 18 }.also {
            for (person in it){
                println(person.name)
            }
        }

    }
}

data class Person( var name:String, var age : Int)