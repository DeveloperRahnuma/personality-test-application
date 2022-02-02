package com.teamway.test.Question_Answer

import java.lang.reflect.Array
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

object AllQuestion_Answer {

    //here set of question is defind
    var Question = arrayOf(
        "You’re really busy at work and a colleague is telling you their life story and personal woes. You:",
        "You’ve been sitting in the doctor’s waiting room for more than 25 minutes. You:",
        "You’re having an animated discussion with a colleague regarding a project that you’re in charge of. You:",

    )

    //here set of question is defind
    var Answer = arrayOf(
         arrayOf(
             "Don’t dare to interrupt them",
             "Think it’s more important to give them some of your time; work can wait",
             "Listen, but with only with half an ear",
             "Interrupt and explain that you are really busy at the moment"
         ),

        arrayOf(
            "Look at your watch every two minutes",
            "Bubble with inner anger, but keep quiet",
            "Explain to other equally impatient people in the room that the doctor is always running late",
            "Complain in a loud voice, while tapping your foot impatiently"
        ),

        arrayOf(
            "Don’t dare contradict them",
            "Think that they are obviously right",
            "Defend your own point of view, tooth and nail",
            "Continuously interrupt your colleague"
        )
    )

    var selectedAnswer = ArrayList<String>()
}