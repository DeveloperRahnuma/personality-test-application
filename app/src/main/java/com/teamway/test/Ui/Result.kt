package com.teamway.test.Ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.teamway.test.databinding.ActivityMainBinding
import com.teamway.test.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //for view binding support
        //ActivityResultBinding is a binding file for the layout activity_result
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //we have all selected answer by user in arraylist ( AllQuestion_Answer.selectedAnswer)
        //you can perform your logic to that determind user are introvert and extroward
        //i am not performing any logic just use random number for displaying the result on screen
        if((0..100).random() % 2 == 0){
            binding.showresult.text = "You Are Extrovert"
        }else{
            binding.showresult.text = "You Are Introvert"
        }

    }
}