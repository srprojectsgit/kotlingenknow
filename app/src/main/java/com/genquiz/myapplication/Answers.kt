package com.genquiz.myapplication

class Answers {
    val qandamap = HashMap<String,String>()
    val myQuestions = Questions()
    val myQandA: Array<Array<String>> = Questions().questionsAndAnswers


    init {
        for(myval in 0..myQandA.size-1){
            qandamap.put(myQandA[myval][0],myQandA[myval][1])
        }
    }

}