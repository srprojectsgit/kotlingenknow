package com.genquiz.myapplication


import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.util.Log
import android.widget.Button
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.genquiz.myapplication.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.*

private lateinit var binding: ActivityMainBinding
private lateinit var textFile:File
private lateinit var file:FileInputStream
val FILE_NAME = "questionsfile.txt"
val LOGQUESTIONS_NAME = "logfile.txt"
val LOGANSWERS_NAME = "loganswers.txt"
private lateinit var androidViewModel: QuizViewModel
lateinit var questionLogList:ArrayList<String>
lateinit var answerLogList:ArrayList<String>
lateinit var answerLogFile:File
lateinit var questionLogFile:File
lateinit var right: MediaPlayer
lateinit var wrong: MediaPlayer
lateinit var answer:String

var soundPlaying = true
var backgroundChanged = false


var button1Clicked = false
var button2Clicked = false
var button3Clicked = false
var button4Clicked = false




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        androidViewModel = ViewModelProvider(this).get(QuizViewModel::class.java)






        questionLogFile = File(filesDir.path+ File.separator+ LOGQUESTIONS_NAME)
        answerLogFile = File(filesDir.path+File.separator+ LOGANSWERS_NAME)
        val myFile = filesDir.path +File.separator+"questionsfile.txt"
        textFile = File(myFile)
        if(textFile.length()==0L){Collections.shuffle(androidViewModel.questionList)}





        questionLogList = ArrayList<String>()
        answerLogList = ArrayList<String>()


        readQuestionsLog()
        readanswerLog()








        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root
        setContentView(view)

        val transferList = ArrayList<String>()
        val metrics = DisplayMetrics()
        @Suppress("DEPRECATION")
        windowManager.defaultDisplay.getMetrics(metrics)
        val height = metrics.heightPixels

        if(height<=700|| binding.textView.length()>170){
            binding.textView.textSize = 24f
        }

        right = MediaPlayer.create(this,R.raw.right_answer)
        wrong = MediaPlayer.create(this,R.raw.wrong_answer)

        binding.button.isAllCaps = false
        binding.button2.isAllCaps = false
        binding.button3.isAllCaps = false
        binding.button4.isAllCaps = false



        androidViewModel.animationDrawable = binding.scrollLayout.getBackground() as AnimationDrawable
        androidViewModel.animationDrawable.setEnterFadeDuration(4000)
        androidViewModel.animationDrawable.setExitFadeDuration(7000)

        androidViewModel.animationDrawable.start()

        readFile();

        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        val myInt = sharedPref.getInt("My Index Point",0)
        androidViewModel.questionIndex = myInt


        binding.textView.setText(androidViewModel.questionList.get(androidViewModel.questionIndex))

        androidViewModel.tempList = androidViewModel.
        questions.getAnswerList(androidViewModel.questionList.get(androidViewModel.questionIndex).toString())

        Collections.shuffle(androidViewModel.tempList)


        androidViewModel.dontShuffle = true


        binding.button.setText(androidViewModel.tempList.get(0))
        binding.button2.setText(androidViewModel.tempList.get(1))
        binding.button3.setText(androidViewModel.tempList.get(2))
        binding.button4.setText(androidViewModel.tempList.get(3))

        binding.textView4.setText(""+ androidViewModel.questionIndex + File.separator +androidViewModel.questionList.size)


        changeColor()

        binding.scrollLayout.post{
            binding.scrollLayout.fullScroll(ScrollView.FOCUS_DOWN)

        }



        binding.button.setOnClickListener {


            button1Clicked = true
            delayAnimation()
            androidViewModel.questionIndex++
            addToLog()


        }

        binding.button2.setOnClickListener {

            button2Clicked = true
            delayAnimation()
            androidViewModel.questionIndex++
            addToLog()


        }


        binding.button3.setOnClickListener {


            button3Clicked = true
            delayAnimation()
            androidViewModel.questionIndex++
            addToLog()




        }


        binding.button4.setOnClickListener {


            button4Clicked = true
            delayAnimation()
            androidViewModel.questionIndex++
            addToLog()





        }

        binding.answerLog.setOnClickListener{


            writeToFile(answerLogList, LOGANSWERS_NAME)
            writeToFile(questionLogList, LOGQUESTIONS_NAME)

            val myLogs: ChosenObjects = ChosenObjects(questionLogList, answerLogList)
            val intent = Intent(this, ActivityLog::class.java)
            intent.putExtra("logs",myLogs)
            startActivity(intent)
        }

        binding.backgroundButton.setOnClickListener {
            if(!backgroundChanged) {
                binding.scrollLayout.setBackgroundColor(Color.BLACK)
                binding.textView.setTextColor(Color.WHITE)
                backgroundChanged = true
            }
            else
            {
                binding.scrollLayout.setBackgroundResource(R.drawable.gradient_list)
                binding.textView.setTextColor(Color.WHITE)
                androidViewModel.animationDrawable = binding.scrollLayout.getBackground() as AnimationDrawable
                androidViewModel.animationDrawable.setEnterFadeDuration(4000)
                androidViewModel.animationDrawable.setExitFadeDuration(7000)

                androidViewModel.animationDrawable.start()
                backgroundChanged = false}
        }

        binding.sound.setOnClickListener{
            if(soundPlaying){
                right.setVolume(0f,0f)
                wrong.setVolume(0f,0f)
                soundPlaying = false
            }

            else if(!soundPlaying){
                right.setVolume(1f,1f)
                wrong.setVolume(1f,1f)
                soundPlaying = true
            }
        }



        var logString = ""
        for(q:String in androidViewModel.questionList){
            logString+=q+"\n"

        }





        var myOutputStream: FileOutputStream? = null

        if(!textFile.exists()){

            try {
                myOutputStream = openFileOutput(FILE_NAME, MODE_PRIVATE)
                myOutputStream.write(logString.encodeToByteArray())
            } catch (e:Exception) {
                e.printStackTrace()
            }
            finally {
                try {
                    if (myOutputStream != null) {
                        myOutputStream.close()
                    }
                } catch (e: Exception) {
                    e.printStackTrace();
                }


            }}





    }

    override fun onPause() {
        super.onPause()

        Log.i("sohpause","paused")
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putInt("My Index Point", androidViewModel.questionIndex)//androidViewModel.questionIndex
            apply()
        }


    }

    fun writeToFile(myList:ArrayList<String>,myFileName:String){
        val myOutputStream = openFileOutput(myFileName, MODE_PRIVATE)

        var myString = ""
        for(i in 0..myList.size-1){
            myString+= myList.get(i)+"\n"
        }


        try {
            myOutputStream.write(myString.encodeToByteArray())
        } catch (e:Exception) {
            e.printStackTrace()
        }
        finally {
            try {
                if (myOutputStream != null) {
                    myOutputStream.close()
                }
            } catch (e: Exception) {
                e.printStackTrace();
            }

        }
    }

    override fun onResume() {
        super.onResume()

//        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
//        val myInt = sharedPref.getInt("My Index Point",0)
//        Log.i("My_Index",""+myInt)
//
//        readFile();



//        androidViewModel.tempList.clear()
//        binding.textView.setText(androidViewModel.questionList.get(myInt))
//        androidViewModel.questionIndex = myInt
//        androidViewModel.tempList = androidViewModel.questions.getAnswerList(androidViewModel.questionList.get(myInt))
//
//        Collections.shuffle(androidViewModel.tempList)
//
//        binding.button.setText(androidViewModel.tempList.get(0))
//        binding.button2.setText(androidViewModel.tempList.get(1))
//        binding.button3.setText(androidViewModel.tempList.get(2))
//        binding.button4.setText(androidViewModel.tempList.get(3))
//
//        val myTemp = androidViewModel.questionList.size
//        binding.textView4?.setText(""+ androidViewModel.questionIndex + File.separator +myTemp)
//







    }

    fun checkRight(b: Button){
         answer = androidViewModel.answerMap.get(
             androidViewModel.questionList.get(
                 androidViewModel.questionIndex)).toString()

        binding.button.isClickable = false
        binding.button2.isClickable = false
        binding.button3.isClickable = false
        binding.button4.isClickable = false







        if(b.text.toString().equals(answer)){
            b.setBackgroundColor(Color.GREEN)
            right.start()

        }


        else {
            if(binding.button.text.toString().equals(answer)){
                binding.button.setBackgroundColor(Color.GREEN)
            }

            else if(binding.button2.text.toString().equals(answer)){
                binding.button2.setBackgroundColor(Color.GREEN)
            }


            else if(binding.button3.text.toString().equals(answer)){
                binding.button3.setBackgroundColor(Color.GREEN)
            }

            else if(binding.button4.text.toString().equals(answer)){
                binding.button4.setBackgroundColor(Color.GREEN)
            }
            wrong.start()
            b.setBackgroundColor(Color.RED)

        }


        if (answer != null) {
            Log.i("sohan_list", answer + " "+b.text.toString())
        }




    }

    fun addToLog(){



        if(answerLogList.size==15){
            answerLogList.removeAt(0)
            questionLogList.removeAt(0)

            if (answer != null) {
                answerLogList.add(answer)
            }
            questionLogList.add(binding.textView.text.toString())



        }


        else {
            answerLogList.add(answer!!)
            questionLogList.add(binding.textView.text.toString())
        }

        writeToFile(answerLogList, LOGANSWERS_NAME)
        writeToFile(questionLogList, LOGQUESTIONS_NAME)
    }

    fun delayAnimation(){




        if(button1Clicked){
            checkRight(binding.button)
        }

        else if(button2Clicked){
            checkRight(binding.button2)
        }

        else if(button3Clicked){
            checkRight(binding.button3)
        }

        else if(button4Clicked){
            checkRight(binding.button4)
        }

        androidViewModel.handler = Handler(Looper.getMainLooper())

        androidViewModel.handler.postDelayed(

            {moveToNext()},2000

        )


        button1Clicked = false;
        button2Clicked = false;
        button3Clicked = false;
        button4Clicked = false;






    }

    fun moveToNext(){

        if(androidViewModel.questionIndex>= androidViewModel.questionList.size){
            androidViewModel.questionIndex =0
        }

        androidViewModel.tempList = androidViewModel.
        questions.getAnswerList(androidViewModel.questionList.get(androidViewModel.questionIndex).toString())

        Log.i("Before",androidViewModel.tempList.toString())


        Collections.shuffle(androidViewModel.tempList)

        Log.i("After",androidViewModel.tempList.toString())


        binding.textView.setText(androidViewModel.questionList.get(androidViewModel.questionIndex))


        binding.button.setText(androidViewModel.tempList.get(0))
        binding.button2.setText(androidViewModel.tempList.get(1))
        binding.button3.setText(androidViewModel.tempList.get(2))
        binding.button4.setText(androidViewModel.tempList.get(3))


        binding.button.isClickable = true
        binding.button2.isClickable = true
        binding.button3.isClickable = true
        binding.button4.isClickable = true

        val myTemp = androidViewModel.questionList.size
        binding.textView4.setText(""+ androidViewModel.questionIndex + File.separator +myTemp)

        changeColor()

        binding.scrollLayout.post{
            binding.scrollLayout.fullScroll(ScrollView.FOCUS_DOWN)

        }


    }

    fun changeColor(){
        binding.button.setBackgroundColor(Color.GRAY)
        binding.button2.setBackgroundColor(Color.GRAY)
        binding.button3.setBackgroundColor(Color.GRAY)
        binding.button4.setBackgroundColor(Color.GRAY)

    }



    fun readFile(){if(questionLogFile.exists()) {
        androidViewModel.questionList.clear()
        textFile.forEachLine { androidViewModel.questionList.add(it) }
    }
    }

    fun readanswerLog(){
        if(answerLogFile.exists()){
            answerLogFile.forEachLine{ answerLogList.add(it)}
        }}


    fun readQuestionsLog(){
        if(questionLogFile.exists()){
            questionLogFile.forEachLine{ questionLogList.add(it)}
        }}


}