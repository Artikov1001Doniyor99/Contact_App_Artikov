package com.example.modul_4_lesson_9_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modul_4_lesson_9_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextadd.setOnClickListener {
            startActivity(
                Intent(
                this,AddActivity::class.java
            )
            )
        }

        binding.nextList.setOnClickListener {
            startActivity(
                Intent(this,ListActivity::class.java)
            )
        }

    }
}