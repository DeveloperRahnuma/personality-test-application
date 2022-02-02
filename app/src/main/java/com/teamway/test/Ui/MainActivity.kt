package com.teamway.test.Ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.teamway.test.Question_Answer.AllQuestion_Answer
import com.teamway.test.Question_Answer.QuestionAnswerAdapter
import com.teamway.test.Question_Answer.QuestionData
import com.teamway.test.R
import com.teamway.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var questionList: ArrayList<QuestionData>

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //for view binding support
        //ActivityMainBinding is a binding file for the layout activity_main
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //adding some dummy data to the list as a questsion and each question will contain 4 option as well
        questionList = ArrayList<QuestionData>()

        //here all question with there answer get placed into data class QuestionData
        for(i in 0..AllQuestion_Answer.Question.size-1){
            questionList.add(QuestionData(question = AllQuestion_Answer.Question.get(i), answer = AllQuestion_Answer.Answer.get(i)))
        }

        //Pass All the information into recycle view for display on screen
        //getting recyclerview from xml

        //adding a layoutmanager
        binding.questionAnserList.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapter = QuestionAnswerAdapter(questionList)

        //for cler the arraylist of selected iteme so each time when app open
        //selected answer becoume empty
        AllQuestion_Answer.selectedAnswer.clear()

        //now adding the adapter to recyclerview
        binding.questionAnserList.adapter = adapter

        //button click handle
        binding.button.setOnClickListener {
            //user have to selected atleast one answer to fo forward
            if(AllQuestion_Answer.selectedAnswer.size < 1){
                Toast.makeText(this, R.string.noAnswerMessage,Toast.LENGTH_LONG).show()
            }else{
                //for redirect user into result screen
                startActivity(Intent(this,Result::class.java))
            }
        }
    }
}