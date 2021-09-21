package com.example.modul_4_lesson_9_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.example.modul_4_lesson_9_3.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    lateinit var binding:ActivityAddBinding
    lateinit var listAdd:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MySharedPreferences.init(this)
        listAdd = MySharedPreferences.obyekString



        binding.addList.setOnClickListener {
            if (binding.editText1.text.toString() != "" && binding.editText2.text.toString() != ""){
                var ContactName = binding.editText1.text.toString()
                var ContactNumber = binding.editText2.text.toString()
                if(ContactName == " " && ContactNumber != " ") {
                    val user = User(ContactName, ContactNumber)
                    listAdd.add(user)
                    MySharedPreferences.obyekString = listAdd
                    Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
                    finish()
                }else{
                    Toast.makeText(this, "Enter a name and number", Toast.LENGTH_SHORT).show()
                    YoYo.with(Techniques.StandUp)
                        .duration(300)
                        .repeat(1)
                        .playOn(findViewById(R.id.editText_1))
                    YoYo.with(Techniques.StandUp)
                        .duration(300)
                        .repeat(1)
                        .playOn(findViewById(R.id.editText_2))
                }
            }else{
                if (binding.editText1.text.toString() == "" && binding.editText2.text.toString() != ""){
                    Toast.makeText(this, "Enter a name", Toast.LENGTH_SHORT).show()
                    YoYo.with(Techniques.StandUp)
                        .duration(300)
                        .repeat(1)
                        .playOn(findViewById(R.id.editText_1))
                }else{
                    if (binding.editText1.text.toString() != "" && binding.editText2.text.toString() == ""){
                        Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show()
                        YoYo.with(Techniques.StandUp)
                            .duration(300)
                            .repeat(1)
                            .playOn(findViewById(R.id.editText_2))
                    }else{
                        if (binding.editText1.text.toString() == "" && binding.editText2.text.toString() == ""){
                            Toast.makeText(this, "Enter a name and number", Toast.LENGTH_SHORT).show()
                            YoYo.with(Techniques.StandUp)
                                .duration(300)
                                .repeat(1)
                                .playOn(findViewById(R.id.editText_1))
                            YoYo.with(Techniques.StandUp)
                                .duration(300)
                                .repeat(1)
                                .playOn(findViewById(R.id.editText_2))
                        }
                    }
                }
            }
        }


    }
}