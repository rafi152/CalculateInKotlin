package org.meicode.myapplicationinkotlintajbih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    lateinit var btnadd: Button
    lateinit var btnsub: Button
    lateinit var btnmul: Button
    lateinit var btndiv: Button
    lateinit var eta: EditText
    lateinit var etb: EditText
    lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd=findViewById(R.id.add)
        btnsub=findViewById(R.id.substraction)
        btnmul=findViewById(R.id.multiply)
        btndiv=findViewById(R.id.divided)
        eta=findViewById(R.id.edittext1)
        etb=findViewById(R.id.edittext2)
        resultTV=findViewById(R.id.result_tv)

        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a=eta.text.toString().toDouble()
        var b=etb.text.toString().toDouble()
        var result=0.0
        when(v?.id){
            R.id.add ->{
                result=a+b
            }
            R.id.substraction ->{
                result=a-b
            }
            R.id.multiply ->{
                result=a*b
            }
            R.id.divided ->{
                result=a/b
            }
        }
        resultTV.text="result is $result"
    }
}