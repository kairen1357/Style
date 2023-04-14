package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun makeColored(view: View){
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_one_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)

            else -> view.setBackgroundColor((Color.LTGRAY))
        }

    }

    private fun setListener(){
        val boxOnseText=findViewById<TextView>(R.id.box_one_text)
        val boxOneText=findViewById<TextView>(R.id.box_one_text)
        val boxOneText=findViewById<TextView>(R.id.box_one_text)
        val boxOneText=findViewById<TextView>(R.id.box_one_text)
        val boxOneText=findViewById<TextView>(R.id.box_one_text)

        val rootconstraintLayout=findViewById<View>(R.id.constraint)

        val clickableViews : list<View> =
            ListOf(boxOneText,root)
    }
}