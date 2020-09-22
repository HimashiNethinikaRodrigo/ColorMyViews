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
            textViewOne,
            textViewTwo,
            textViewThree,
            textViewFour,
            textViewFive,
            constraintLayout,
            buttonRed,
            buttonYellow,
            buttonGreen
        )

        for (item in clickableViews)
            item.setOnClickListener { view -> makeColored(view) }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            textViewOne.id -> view.setBackgroundColor(Color.DKGRAY)
            textViewTwo.id -> {
                view.setBackgroundColor(Color.GRAY)
                view.setBackgroundResource(R.drawable.ic_baseline_chat_bubble_24)
            }
            textViewThree.id -> view.setBackgroundColor(Color.BLUE)
            textViewFour.id -> view.setBackgroundColor(Color.MAGENTA)
            textViewFive.id -> view.setBackgroundColor(Color.BLUE)
            buttonRed.id -> textViewThree.setBackgroundResource(R.color.my_red)
            buttonYellow.id -> textViewFour.setBackgroundResource(R.color.my_yellow)
            buttonGreen.id -> textViewFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}