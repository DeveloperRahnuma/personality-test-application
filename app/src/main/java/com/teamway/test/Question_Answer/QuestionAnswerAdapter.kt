package com.teamway.test.Question_Answer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.teamway.test.R
import java.util.ArrayList

class QuestionAnswerAdapter(val questionAndAnswerList : ArrayList<QuestionData>) : RecyclerView.Adapter<QuestionAnswerAdapter.MyDesign>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDesign {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.quest_answer_items, parent, false)
        return MyDesign(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MyDesign, position: Int) {
        // set question on question field
        holder.questionField.text = questionAndAnswerList.get(position).question

        //set option for each answer one by one answer.get(0) will be first ans and set into option one,
        // answer.get(0) will be secound answer and set into the secound option and list going on
        holder.op1.text = questionAndAnswerList.get(position).answer.get(0)
        holder.op2.text = questionAndAnswerList.get(position).answer.get(1)
        holder.op3.text = questionAndAnswerList.get(position).answer.get(2)
        holder.op4.text = questionAndAnswerList.get(position).answer.get(3)

        //performing oncheck change listner in radio group
        holder.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.option_one -> {  AllQuestion_Answer.selectedAnswer.add(holder.op1.text as String)}
                R.id.option_two -> {  AllQuestion_Answer.selectedAnswer.add(holder.op2.text as String)}
                R.id.option_three -> {  AllQuestion_Answer.selectedAnswer.add(holder.op3.text as String)}
                R.id.option_four -> {  AllQuestion_Answer.selectedAnswer.add(holder.op4.text as String)}
            }
        }
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
      return questionAndAnswerList.size
    }

    //the class is hodling the list view
    class MyDesign(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //reference of field which we created in quest_answer_items
        val questionField = itemView.findViewById<TextView>(R.id.question)
        val op1 = itemView.findViewById<RadioButton>(R.id.option_one)
        val op2 = itemView.findViewById<RadioButton>(R.id.option_two)
        val op3 = itemView.findViewById<RadioButton>(R.id.option_three)
        val op4 = itemView.findViewById<RadioButton>(R.id.option_four)

        //radio group
        val radioGroup = itemView.findViewById<RadioGroup>(R.id.radio_group)
    }

}

