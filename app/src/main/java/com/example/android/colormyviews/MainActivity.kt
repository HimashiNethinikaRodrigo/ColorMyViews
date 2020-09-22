package com.example.android.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            findViewById(R.id.textViewOne),
            findViewById(R.id.textViewTwo),
            findViewById(R.id.textViewThree),
            findViewById(R.id.textViewFour),
            findViewById(R.id.textViewFive),
            findViewById(R.id.constraintLayout)
        )

        for (item in clickableViews)
            item.setOnClickListener{view ->makeColored(view)}
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.textViewOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textViewTwo ->{
                view.setBackgroundColor(Color.GRAY)
                view.setBackgroundResource(R.drawable.ic_baseline_chat_bubble_24)
            }
            R.id.textViewThree -> view.setBackgroundColor(Color.BLUE)
            R.id.textViewFour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.textViewFive -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}