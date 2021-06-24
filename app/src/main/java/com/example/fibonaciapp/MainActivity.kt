package com.example.fibonaciapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvNumbers = findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager = LinearLayoutManager(baseContext)
        var numbersRvAdapter = NumbersRvAdapter(fibonacci( 100))
        rvNumbers.adapter = numbersRvAdapter

//        fibonacci(100)
    }
}
    fun fibonacci(maxNumber:Int):List<BigInteger>{
        var count=0
        var firstNumber=0.toBigInteger()
        var secondNumber=1.toBigInteger()
        var fibbNumbers= mutableListOf<BigInteger>()
        fibbNumbers.add(firstNumber)
        fibbNumbers.add(0.toBigInteger())




        while (count<maxNumber){
           println(firstNumber)
           var sum=firstNumber+secondNumber
            firstNumber=secondNumber
            secondNumber=sum
            count++
            fibbNumbers.add(firstNumber)

        }

        return fibbNumbers
    }

