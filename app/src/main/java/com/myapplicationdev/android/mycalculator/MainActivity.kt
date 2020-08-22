package com.myapplicationdev.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    var msg = ""
    var op = ""
    var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button2.setOnClickListener {
            var neg = -1* msg.toInt()
            msg = "$neg"
            textView.text = msg
        }
        button3.setOnClickListener {
            var perc = msg.toDouble()/100
            msg = "$perc"
            textView.text = msg
        }
        button19.setOnClickListener {
            var expression = ExpressionBuilder(msg).build()
            var res = expression.evaluate()
            msg = res.toString()
            textView.text = msg
        }

    }
    fun onButtonClick(view: View) {

        val btnSelected = view as Button

        when(btnSelected.id){
            button5.id -> msg += "7"
            button6.id -> msg += "8"
            button7.id -> msg += "9"
            button9.id -> msg += "4"
            button10.id -> msg += "5"
            button11.id -> msg += "6"
            button13.id -> msg += "1"
            button14.id -> msg += "2"
            button15.id -> msg += "3"
            button17.id -> msg += "0"
            button18.id -> msg += "."

            button1.id -> msg = ""
            button4.id -> msg += "/"
            button8.id -> msg += "*"
            button12.id -> msg += "-"
            button16.id -> msg += "+"
        }
        textView.text = msg
    }
}