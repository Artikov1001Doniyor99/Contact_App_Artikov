package com.example.modul_4_lesson_9_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modul_4_lesson_9_3.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    lateinit var binding: ActivityListBinding
    lateinit var listShow:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        MySharedPreferences.init(this)
        listShow = MySharedPreferences.obyekString

        if (binding.scrollTextView.text == "") {
            for (user in listShow) {
                binding.scrollTextView.append("${user.username}\n${user.number}\n\n")
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding.scrollView.removeAllViews()
    }


}