package com.genquiz.myapplication

import android.app.Application
import android.graphics.drawable.AnimationDrawable
import android.os.Handler
import androidx.lifecycle.AndroidViewModel
import java.util.*
import kotlin.collections.ArrayList

class QuizViewModel(application: Application) : AndroidViewModel(application) {
var questionIndex =0
lateinit var animationDrawable: AnimationDrawable
val questions = Questions()
    var questionList = ArrayList<String>()
    val answers = Answers()
val answerMap = answers.qandamap
 var tempList :ArrayList<String>
lateinit var handler: Handler
var dontShuffle = false
 var answerList:ArrayList<String>


init{
    questions.populateList(questionList)
//    Collections.shuffle(questionList)
    tempList = ArrayList<String>()
    answerList = questions.getAnswerList(questionList.get(questionIndex))


    tempList.add(answerList.get(0))
tempList.add(answerList.get(1))
tempList.add(answerList.get(2))
tempList.add(answerList.get(3))






}





}