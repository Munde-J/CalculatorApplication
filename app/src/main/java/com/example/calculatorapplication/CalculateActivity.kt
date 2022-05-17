package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculateActivity : AppCompatActivity() {
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {

            var num1=etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            if(num1.isBlank()){
                etNumber1.setError("Enter a number")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNumber2.setError("Enter a number")
                return@setOnClickListener
            }
            add(num1.toInt(),num2.toInt())

        }
        btnSubtract.setOnClickListener {
            var num1=etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            if(num1.isBlank()){
                etNumber1.setError("Enter a number")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNumber2.setError("Enter a number")
                return@setOnClickListener
            }
            subtract(num1.toInt(),num2.toInt())

        }
        btnMultiply.setOnClickListener {
            var num1=etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            if(num1.isBlank()){
                etNumber1.setError("Enter a number")
                return@setOnClickListener
            }
            if(num1.isBlank()){
                etNumber2.setError("Enter a number")
                return@setOnClickListener
            }
            multiply(num1.toInt(),num2.toInt())

        }

        btnModulus.setOnClickListener {
            var num1=etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            if(num1.isBlank()){
                etNumber1.setError("Enter a number")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNumber2.setError("Enter a number")
                return@setOnClickListener
            }

            modulus(num1.toInt(),num2.toInt())
        }


    }

    fun add(num1:Int,num2: Int){
        var total=num1+num2
        tvResult.text=total.toString()
    }
    fun subtract(num1:Int,num2: Int){
        var total=num1-num2
        tvResult.text=total.toString()
    }
    fun multiply(num1:Int,num2: Int){
        var total=num1*num2
        tvResult.text=total.toString()
    }
    fun modulus(num1:Int,num2: Int){
        var total=num1%num2
        tvResult.text=total.toString()
    }


}

