package com.example.kotlinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val btn1 = findViewById<Button>(R.id.btnFragment1)
        val btn2 = findViewById<Button>(R.id.btnFragment2)
         supportFragmentManager.beginTransaction().apply {
             replace(R.id.flFragment,firstFragment)
             commit()
         }
        btn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment,firstFragment)
                commit()
            }
        }
        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,secondFragment)
                commit()
            }
        }

    }
}