package com.example.seekprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resetbtn = findViewById<Button>(R.id.resetbtn)

        //progressBars
        val widthBar = findViewById<ProgressBar>(R.id.progressBar)
        val heightBar = findViewById<ProgressBar>(R.id.progressBar2)

        //images
        val img1 = findViewById<ImageView>(R.id.imageView)
        val img2 = findViewById<ImageView>(R.id.imageView2)
        val img3 = findViewById<ImageView>(R.id.imageView3)

        //widthbars
        val wb1 = findViewById<SeekBar>(R.id.seekBar)
        val wb2 = findViewById<SeekBar>(R.id.seekBar2)
        val wb3 = findViewById<SeekBar>(R.id.seekBar3)

        //heightbars
        val hb1 = findViewById<SeekBar>(R.id.seekBar4)
        val hb2 = findViewById<SeekBar>(R.id.seekBar5)
        val hb3 = findViewById<SeekBar>(R.id.seekBar6)
    }
}