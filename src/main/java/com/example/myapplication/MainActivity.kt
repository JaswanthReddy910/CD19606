package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout:LinearLayout=findViewById(R.id.layout)
        val tv:TextView=findViewById(R.id.tv)
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        val button3:Button=findViewById(R.id.button3)
        var size:Float=10f
        var i:Int=5
        var j:Int=0

        button1.setOnClickListener {
            tv.setTextSize(size)
            size=(size+5)%50
        }
        button2.setOnClickListener {
            when(i%3){
                0 -> tv.setTextColor(Color.TRANSPARENT)
                1 -> tv.setTextColor(Color.GREEN)
                2 -> tv.setTextColor(Color.BLACK)
            }
            i=i+1
        }
        button3.setOnClickListener {
            when(j%3){
                0 -> layout.setBackgroundColor(Color.RED)
                1 -> layout.setBackgroundColor(Color.GREEN)
                2 -> layout.setBackgroundColor(Color.BLUE)
            }
            j=j+1
        }
    }


}