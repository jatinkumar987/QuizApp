package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var mCurrentPosition:Int=1
    private var mQuestionList:ArrayList<Question>?=null
    private var mSelectedPosition:Int=0


       // ID
    val progress = findViewById<ProgressBar>(R.id.progressBar)
    val tvprogress =findViewById<TextView>(R.id.tv_progress)
    val tvquestion =findViewById<TextView>(R.id.tv_question)
    val iv =findViewById<ImageView>(R.id.iv_image)
    val tvq =findViewById<TextView>(R.id.tv_question)
    val tvq1 =findViewById<TextView>(R.id.tv_option_one)
    val tvq2 =findViewById<TextView>(R.id.tv_option_two)
    val tvq3 =findViewById<TextView>(R.id.tv_option_three)
    val tvq4 =findViewById<TextView>(R.id.tv_option_four)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionList= Constant.getQuestions()
        setQuestion()

    }
private fun setQuestion() {
    mCurrentPosition = 1
    val question:Question?=mQuestionList!![mCurrentPosition-1]

    progress.progress= mCurrentPosition
    tvprogress.text="$mCurrentPosition"+"/"+progress.max

    tvquestion.text =question!!.question
    iv.setImageResource(question.image)
    tvq1.text=question.optionOne
    tvq2.text=question.optionTwo
    tvq3.text=question.optionThree
    tvq4.text=question.optionFour

}



}